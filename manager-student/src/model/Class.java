package model;

public class Class extends Classroom{
    private String className;

    public Class(String classCode, String className, int code) {
        super(classCode, code);
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Class{" +
                "ClassName='" + className + '\'' +
                "ClassCode=" + this.getClassCode() + '\'' +
                "TeacherCode=" + this.getCode()  + '\'' +
                '}';
    }
}
