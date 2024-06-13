package model;

public abstract class Classroom {
    private int code;
    private String name;
    private String birtday;
    private String gender;
    private String phone;
    private String classCode;

    //       giao vien
    public Classroom(int code, String name, String birtday, String gender, String phone) {
        this.birtday = birtday;
        this.code = code;
        this.gender = gender;
        this.name = name;
        this.phone = phone;
    }
//        hoc sinh

    public Classroom(int code, String name, String birtday, String gender, String phone, String classCode) {
        this.birtday = birtday;
        this.code = code;
        this.gender = gender;
        this.name = name;
        this.phone = phone;
        this.classCode = classCode;
    }

    // lop hoc
    public Classroom(String classCode, int code) {
        this.classCode = classCode;
        this.code = code;
    }

    public Classroom() {
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

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }
}


