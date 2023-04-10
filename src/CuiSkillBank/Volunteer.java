package CuiSkillBank;

public class Volunteer extends Member{
    SkillOffer[] skilloffer = new SkillOffer[4];
    SkillNeed[] skillneed = new SkillNeed[4];
    public Volunteer(String name, String email, int id, String phoneNumber, String passWord) {
        super(name, email, id, phoneNumber, passWord);
    }

    public SkillOffer[] getSkilloffer() {
        return skilloffer;
    }
    public void setSkilloffer(SkillOffer[] skilloffer) {
        this.skilloffer = skilloffer;
    }

    public SkillNeed[] getSkillneed() {
        return skillneed;
    }

    public void setSkillneed(SkillNeed[] skillneed) {
        this.skillneed = skillneed;
    }

    public void addSkillOffer(SkillOffer[] skilloffer, SkillNeed[] skillneed){
        this.skilloffer = skilloffer;
        this.skillneed = skillneed;
    }

    void displayVolunteer(Volunteer tempObj){
        System.out.println("Name :"+tempObj.getName());
        System.out.println("Email: "+ tempObj.getEmail());
        System.out.println("ID: "+tempObj.getId());
        System.out.println("PhoneNumber: "+ tempObj.getPhoneNumber());
        System.out.println("PassWord: " + tempObj.getPassWord());
        System.out.println("****Skill You Offering****");
        for (SkillOffer tempSkillOffer: skilloffer){
            if (tempSkillOffer!=null){
                System.out.println(tempSkillOffer.getName());
            }

        }
        System.out.println("****Skill You Need****");
        for (SkillNeed tempSkillNeed: skillneed){
            if (tempSkillNeed!=null){
                System.out.println(tempSkillNeed.getName());
            }
        }
    }
    void displaySkills(){
        System.out.println("Skill Offer: ");
        for (SkillOffer tempSkillOffer: skilloffer){
            if (tempSkillOffer!=null){
                System.out.println(tempSkillOffer.getName());
            }

        }
        System.out.println("Skill Need: ");
        for (SkillNeed tempSkillNeed: skillneed){
            if (tempSkillNeed!=null){
                System.out.println(tempSkillNeed.getName());
            }
        }
    }
    public void sendMessage(){
        System.out.println("Message has been sent Successfully");
    }
}
