package CuiSkillBank;

import java.util.Objects;

public class ChatBox {
    String message;
    String name;
    public void sendMessageStaff(String name,String ph, String message){
        System.out.println(name+": "+message);
    }
    public void sendMessageVolunteer(Volunteer list[], String phNum, String message){
        for (Volunteer temp: list){
            if(temp != null){
                if(Objects.equals(temp.getPhoneNumber(), phNum)){
                    System.out.println(temp.getName()+ ": "+message);
                }
            }

        }
    }
}
