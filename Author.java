import java.util.ArrayList;

public class Author {
    private String name;
    private String email;
    private String gender;
    private String tel;

    public Author(String name, String email, String gender, String tel) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getTel() {
        return tel;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }



    @Override
    public String toString() {
        return "Author[name=" + name + ", email=" + email + ", gender=" + gender + "]";
        //return name + "(" + gender + ")" + " at " + email;
    }
}
