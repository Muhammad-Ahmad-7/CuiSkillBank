package CuiSkillBank;

import java.util.Scanner;

public class SkillNeed extends Skill{
    public SkillNeed(String name, String dateTime) {
        super(name, dateTime);
    }

    public void addSkill(Volunteer temp){
        Scanner input = new Scanner(System.in);
        System.out.println("****SkillNeed****");
        //input.nextLine(); // consume remaining end-of-line character
        System.out.println("Enter the skill name: ");
        String skillName = input.nextLine();
        System.out.println("Enter the skill Availability (Date/Time): ");
        String skillDescription = input.nextLine();
        temp.skillneed[1] = new SkillNeed(skillName, skillDescription);
    }
    public void displaySkill(){
        System.out.println(getName());
    }
    public  void deleteSkill(Volunteer temp, String name){

    }
}
