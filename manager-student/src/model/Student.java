package model;

public class Student extends Classroom{
    private String codeClass;

    public Student() {
    }

    public Student(int code, String name, String birtday, String gender, String phone, String codeClass) {
        super(code, name, birtday, gender, phone);
        this.codeClass = codeClass;
    }

    public String getCodeClass() {
        return codeClass;
    }

    public void setCodeClass(String codeClass) {
        this.codeClass = codeClass;
    }

    public String toString() {
        return "(Student)" +

                "Mã sinh viên:" + this.getCode() +
                ", Tên sinh viên='" + this.getName() +
                " ,Ngày sinh:" + this.getBirtday() +
                " ,Giới tính:" + this.getGender() +
                " ,số điện thoại: " + this.getPhone() +
                " ,Mã lớp học:" + this.getCodeClass()
                ;
    }
}
