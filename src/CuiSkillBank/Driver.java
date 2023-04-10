package CuiSkillBank;

import java.util.Objects;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        int exit;
        System.out.println("<-----WELCOME TO CUISKILLBANK----->");
        do {
            Volunteer[] volunteer = new Volunteer[4];
            volunteer[0] = new Volunteer("Ali", "ali@123gmail.com", 123, "0300000", "1234");
            volunteer[1] = new Volunteer("Ahmad", "ahmad@123gmail.com", 456, "0400000", "7860");
            volunteer[0].skillneed[0] = new SkillNeed("programming", "morning");
            volunteer[0].skilloffer[0] = new SkillOffer("coding", "night");
            volunteer[1].skilloffer[0] = new SkillOffer("web", "morning");
            volunteer[1].skillneed[0] = new SkillNeed("coding", "night");
            Staff stf1 = new Staff("Bilal", "Manager", "bilal@gmail.com", 786, "050000", volunteer, "0099");
            Director director = new Director(volunteer, "director123", "directorcui@gmail.com");
            Scanner input = new Scanner(System.in);
            int choice, skillChoice;
            System.out.println("Select one Option From the Menu\n1: For Registration of New Volunteer\n2: For Login as Volunteer\n3: For Login as STAFF" +
                    "\n4: For Generating Monthly Statistical Report\n5: For Viewing Community activities");
            choice = input.nextInt();
            if (choice == 1) {
                String name, email, phoneNumber, passWord;
                int id;
                System.out.println("Enter Your Name: ");
                input.nextLine(); // consume remaining end-of-line character
                name = input.nextLine();
                System.out.println("Enter Your Email: ");
                email = input.nextLine();
                System.out.println("Enter Your ID: ");
                id = input.nextInt();
                input.nextLine(); // consume remaining end-of-line character
                System.out.println("Enter Your Phone Number: ");
                phoneNumber = input.nextLine();
                System.out.println("Enter Your PassWord: ");
                passWord = input.nextLine();
                volunteer[2] = new Volunteer(name, email, id, phoneNumber, passWord);
                System.out.println("Enter 1 for Skill Need\n2 for Skill Offer\nelse for Both: ");
                skillChoice = input.nextInt();
                if (skillChoice == 1) {
                    System.out.println("*****Skill Need*****");
                    input.nextLine(); // consume remaining end-of-line character
                    System.out.println("Enter the skill name: ");
                    String skillName = input.nextLine();
                    System.out.println("Enter the skill Availability (Date/Time): ");
                    String skillDescription = input.nextLine();
                    volunteer[2].skillneed[0] = new SkillNeed(skillName, skillDescription);
                } else if (skillChoice == 2) {
                    System.out.println("*****Skill Offer*****");
                    input.nextLine(); // consume remaining end-of-line character
                    System.out.println("Enter the skill name: ");
                    String skillName = input.nextLine();
                    System.out.println("Enter the skill Availability (Date/Time): ");
                    String skillDescription = input.nextLine();
                    volunteer[2].skilloffer[0] = new SkillOffer(skillName, skillDescription);
                } else {
                    System.out.println("****Skill Need****");
                    input.nextLine(); // consume remaining end-of-line character
                    System.out.println("Enter the skill name: ");
                    String skillName = input.nextLine();
                    System.out.println("Enter the skill Availability (Date/Time): ");
                    String skillDescription = input.nextLine();
                    volunteer[2].skillneed[0] = new SkillNeed(skillName, skillDescription);
                    System.out.println("****Skill Offer****");
                    //input.nextLine(); // consume remaining end-of-line character
                    System.out.println("Enter the skill name: ");
                    skillName = input.nextLine();
                    System.out.println("Enter the skill Availability (Date/Time): ");
                    skillDescription = input.nextLine();
                    volunteer[2].skilloffer[0] = new SkillOffer(skillName, skillDescription);
                }
                System.out.println("VOLUNTEER REGISTERED SUCCESSFULLY");
            } else if (choice == 2) {
                String email, passWord;
                int count = 0;
                input.nextLine();
                System.out.println("Enter Your Email: ");
                email = input.nextLine();
                //input.nextLine();
                System.out.println("Enter your Password");
                passWord = input.nextLine();
                for (Volunteer temp : volunteer) {
                    if (temp != null) {
                        if ((Objects.equals(email, temp.getEmail())) && Objects.equals(passWord, temp.getPassWord())) {
                            temp.displayVolunteer(temp);
                            count++;
                            int addSkillChoice;
                            System.out.println("Enter\n1: For Adding SkillOffer\n2: For Adding SkillNeed\n3: For Deleting any SkillOffer" +
                                    "\n4: For Deleting SkillNeed\n5: For Send Message");
                            addSkillChoice = input.nextInt();
                            if (addSkillChoice == 1) {
                                temp.skilloffer[0].addSkill(temp);
                            } else if (addSkillChoice == 2) {
                                temp.skillneed[0].addSkill(temp);
                            } else if (addSkillChoice == 3) {
                                input.nextLine();
                                System.out.println("Enter Skill You Want To Delete: ");
                                String name1 = input.nextLine();
                                for (int i = 0; i < temp.skilloffer.length; i++) {
                                    //System.out.println(temp.skilloffer.length);
                                    if (temp.skilloffer[i] != null) {
                                        if (Objects.equals(temp.skilloffer[i].getName(), name1)) {
                                            temp.skilloffer[i] = null;
                                            System.out.println("Skill Deleted Successfully " + temp.skilloffer[i]);
                                        }
                                    }
                                }
                                //temp.skilloffer[0].deleteSkill(temp, name1);
                            } else if (addSkillChoice == 4) {
                                input.nextLine();
                                System.out.println("Enter Skill You Want To Delete: ");
                                String name1 = input.nextLine();
                                for (int i = 0; i < temp.skillneed.length; i++) {
                                    //System.out.println(temp.skilloffer.length);
                                    if (temp.skilloffer[i] != null) {
                                        if (Objects.equals(temp.skillneed[i].getName(), name1)) {
                                            temp.skillneed[i] = null;
                                            System.out.println("Skill Deleted Successfully " + temp.skillneed[i]);
                                        }
                                    }
                                }
                            } else if(addSkillChoice == 5){
                                System.out.println("CHAT BOX");
                                input.nextLine();
                                System.out.println("Enter Staff Phone Number: ");
                                String ph = input.nextLine();
                                System.out.println("Enter Message: ");
                                String message = input.nextLine();
                                temp.chat.sendMessageStaff(temp.getName(), ph,message);
                            } else {
                                System.out.println("Enter Correct Choice");
                            }
                            System.out.println("********AFTER ADDING SKILLS AND DELETING SKILLS*********");
                            temp.displayVolunteer(temp);
                        }
                    }
                }
                if (count == 0) {
                    System.out.println("Incorrect Email, PassWord");
                }
            } else if (choice == 3) {
                input.nextLine();
                System.out.println("Enter Your Email: ");
                String email = input.nextLine();
                System.out.println("Enter Your Password: ");
                String passWord = input.nextLine();
                if (Objects.equals(email, stf1.getEmail()) && Objects.equals(passWord, stf1.getPassWord())) {
                    stf1.displayStaff(stf1);
                    System.out.println("Enter\n1: For Matching Volunteer\n2: For Sending message to Volunteer");
                    int subChoice = input.nextInt();
                    if (subChoice == 1) {
                        stf1.matchVolunteer();
                    } else if(subChoice == 2){
                        System.out.println("CHAT BOX");
                        input.nextLine();
                        System.out.println("Enter Phone Number: ");
                        String ph = input.nextLine();
                        System.out.println("Enter Your Message: ");
                        String message = input.nextLine();
                        stf1.chat.sendMessageVolunteer(volunteer, ph, message);
                    }
                } else {
                    System.out.println("WRONG EMAIL AND PASSWORD");
                }
            } else if (choice == 4) {
                input.nextLine();
                System.out.println("Enter Email: ");
                String email = input.nextLine();
                System.out.println("Enter Password: ");
                String password = input.nextLine();
                if (Objects.equals(director.getEmail(), email) && Objects.equals(director.getPassword(), password)) {
                    director.generateReport();
                } else {
                    System.out.println("WRONG EMAIL PASSWORD");
                }
            } else if(choice == 5){
                LocalCommunities community = new LocalCommunities();
                community.getActivity();
            } else {
                System.out.println("WRONG CHOICE");
            }
            Scanner input2 = new Scanner(System.in);
            System.out.println("Enter 1 for Exit");
            exit = input2.nextInt();
        } while (exit != 1);
    }
}
