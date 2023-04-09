package CuiSkillBank;

public class Member {
    String name;
    String email;
    int id;
    String phoneNumber;

    String passWord;
    public Member(String name, String email, int id, String phoneNumber, String passWord) {
        this.name = name;
        this.email = email;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.passWord = passWord;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
