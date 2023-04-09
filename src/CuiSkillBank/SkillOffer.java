package CuiSkillBank;

import java.util.Objects;
import java.util.Scanner;

public class SkillOffer extends Skill{
    public SkillOffer(String name, String dateTime) {
        super(name, dateTime);
    }
    public void addSkill(Volunteer temp){
        Scanner input = new Scanner(System.in);
        System.out.println("****SkillOffer****");
        //input.nextLine(); // consume remaining end-of-line character
        System.out.println("Enter the skill name: ");
        String skillName = input.nextLine();
        System.out.println("Enter the skill Availability (Date/Time): ");
        String skillDescription = input.nextLine();
        temp.skilloffer[1] = new SkillOffer(skillName, skillDescription);
    }

    public void displaySkill(){
        System.out.println(getName());
    }
    public  void deleteSkill(Volunteer temp, String name){


    }
}
