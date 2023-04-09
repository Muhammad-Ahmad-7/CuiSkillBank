package CuiSkillBank;

public class Director {
    Volunteer[] volunteer;
    String password;
    String email;

    public Director(Volunteer[] volunteer, String password, String email) {
        this.volunteer = volunteer;
        this.password = password;
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void generateReport(){
        System.out.println("*******LIST OF REGISTERED VOLUNTEERS*******");
        for(Volunteer tempVolunteer: volunteer){
            if(tempVolunteer != null){
                System.out.println("Name: " +  tempVolunteer.getName());
                System.out.println("Email: " +  tempVolunteer.getEmail());
                System.out.println("PhoneNumber: " +  tempVolunteer.getPhoneNumber());
                System.out.println("ID: " +  tempVolunteer.getId());
                tempVolunteer.displaySkills();
                System.out.println();
            }
        }
    }

}
