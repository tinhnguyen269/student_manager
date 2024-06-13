package model;

public class Techer extends Classroom {
    private int code;
    private String name;
    private String birtday;
    private String gender;
    private String phone;

    public Techer(int code, String name, String birtday, String gender, String phone){
        this.birtday = birtday;
        this.code = code;
        this.gender = gender;
        this.name = name;
        this.phone = phone;
    }

    public Techer() {
    }

    public String getBirtday() {
        return birtday;
    }

    public void setBirtday(String birtday) {
        this.birtday = birtday;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toStringTecher() {
        return "Techer{" +
                "birtday='" + birtday + '\'' +
                ", TeacherCode=" + code +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
