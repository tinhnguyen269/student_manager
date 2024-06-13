package service.impl;

import model.Student;
import reponsitories.StudentReponsitory;
import service.IService;

import java.util.List;

public class StudentService implements IService {
    StudentReponsitory studentReponsitory = new StudentReponsitory();
    public void addStudent(Student student) {
        studentReponsitory.addStudent(student);
    }

    public List<Student> getAll() {
        return studentReponsitory.getAll();
    }

    public boolean findByCode(int code) {
        return studentReponsitory.findByCode(code);
    }

    public void delete(int code) {
        studentReponsitory.delete(code);
    }
}
