package CuiSkillBank;

import java.util.Objects;

public class Staff extends Member{
    String designation;
    Volunteer[] volunteer;

    ChatBox chat = new ChatBox();
    public Staff(String name, String designation,String email, int id, String phoneNumber, Volunteer[] volunteer, String passWord) {
        super(name, email, id, phoneNumber, passWord);
        this.volunteer = volunteer;
        this.designation = designation;
    }
    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    void displayStaff(Staff tempObj){
        System.out.println("Name:"+tempObj.getName());
        System.out.println("Designation: "+ tempObj.getDesignation());
        System.out.println("Email: "+ tempObj.getEmail());
        System.out.println("ID: "+tempObj.getId());
        System.out.println("PhoneNumber: "+ tempObj.getPhoneNumber());
        System.out.println("PassWord: " + tempObj.getPassWord());
    }
    public void matchVolunteer(){
        for (int i = 0; i<volunteer.length; i++){
            if(volunteer[i] !=  null && volunteer[i+1] != null) {
                for (int j = 0; j < volunteer[i].skillneed.length; j++) {
                    if((volunteer[i].skillneed[j] != null && volunteer[i+1].skilloffer[j] != null) || (volunteer[i].skilloffer[j] != null && volunteer[i+1].skillneed[j] != null)) {
                        if ((Objects.equals(volunteer[i].skillneed[j].name, volunteer[i + 1].skilloffer[j].name)) ||
                                (Objects.equals(volunteer[i].skilloffer[j].name, volunteer[i + 1].skillneed[j].name))
                        ) {
                            System.out.println("Volunteer has a skill that matches the offer");
                            System.out.println("Name: \n"+ volunteer[i].getName()+ "<------->" + volunteer[i+1].getName());
                            System.out.println("Email: \n"+ volunteer[i].getEmail()+"<------->"+volunteer[i+1].getEmail());
                            System.out.println("PhoneNumber: \n"+ volunteer[i].getPhoneNumber()+"<------->"+volunteer[i+1].getPhoneNumber());
                            volunteer[i].sendMessage();
                        } else {
                            System.out.println("Volunteer does not have a skill that matches the offer");
                        }
                    }
                }
            }
        }
    }
}
