package controller;

import model.Student;
import service.impl.StudentService;
import view.ViewMenu;

import java.util.List;

public class MainController {
    public static void main(String[] args) {
        ViewMenu viewMenu = new ViewMenu();
        StudentService studentService = new StudentService();
        boolean check;
        boolean confirm;
        int code;
        int choice;
        while (true) {
            choice = viewMenu.view();
            switch (choice) {
                case 1:
                    Student student = viewMenu.viewAdd();
                    studentService.addStudent(student);
                    viewMenu.viewMessage(true);
                    break;
                case 2:
                    code = viewMenu.findByCode();
                    check = studentService.findByCode(code);
                    if (check){
                        confirm = viewMenu.confirmDelete();
                        if(confirm){
                            studentService.delete(code);
                            viewMenu.viewMessage(true);
                        }

                    }else {
                        viewMenu.viewMessage(false);
                    }
                    break;
                case 3:
                    List<Student> students = studentService.getAll();
                    ViewMenu.viewAll(students);
                    break;
                case 4:
                    break;
                case 0:
                    break;
            }
        }
    }

}
