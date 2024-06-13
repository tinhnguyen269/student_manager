package view;

import model.Student;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ViewMenu {
    int choice;

    public static void viewAll(List<Student> students) {
        if (students.isEmpty()) {
            System.out.println("Danh sách rỗng!");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }

    }


    public int view() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Thêm mới sinh viên");
        System.out.println("2.Xóa sinh viên");
        System.out.println("3.Xem danh sách sinh viên");
        System.out.println("4.Tìm kiếm sinh viên");
        System.out.println("0.Thoát");
        System.out.println("Nhập lựa chọn:");
        choice = Integer.parseInt(sc.nextLine());
        return choice;
    }

    public Student viewAdd() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sv:");
        int code = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập tên sv:");
        String name = sc.nextLine();
        System.out.print("Nhập ngày sinh:");
        String birtday = sc.nextLine();
        System.out.print("nhập giới tính:");
        String gender = sc.nextLine();
        System.out.print("Nhập số điện thoại:");
        String phone = sc.nextLine();
        System.out.print("Nhập mã lớp học:");
        String classCode = sc.nextLine();
        Student student = new Student(code, name, birtday, gender, phone, classCode);
        return student;

    }

    public void viewMessage(boolean result) {
        if (result) {
            System.out.println("Tác vụ thành công!");
        } else {
            System.out.println("Tác vụ thất bại!");
        }
    }

    public int findByCode() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập mã:");
            int code = Integer.parseInt(sc.nextLine());
            return code;
    }

    public boolean confirmDelete() {
        System.out.println("Bạn có muốn xóa hay không?");
        System.out.print("Bấm Y để xác nhận,N để hủy:");
        Scanner sc = new Scanner(System.in);
        String confirm = sc.nextLine();
        if (confirm.equals("Y")){
            return true;
        }
        return false;
    }
}
