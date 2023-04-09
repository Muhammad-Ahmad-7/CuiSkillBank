package CuiSkillBank;

public abstract class Skill {
    String name;
    String dateTime;

    public Skill(String name, String dateTime) {
        this.name = name;
        this.dateTime = dateTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public abstract  void displaySkill();
    public abstract void addSkill(Volunteer temp);
    public abstract void deleteSkill(Volunteer temp, String name);
}
