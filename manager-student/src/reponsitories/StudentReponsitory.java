package reponsitories;

import model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StudentReponsitory {
    ArrayList<Student> students = new ArrayList<>();
    private static final String SRC_STUDENT ="E:\\Case study\\Module2\\student-module2\\manager-student\\src\\data\\student.csv";

    public void addStudent(Student student) {
        students.add(student);
        writeFile(students,true);
    }
    private void writeFile(ArrayList<Student> students, boolean append) {
        File file = new File(SRC_STUDENT);
        try (FileWriter fileWriter = new FileWriter(file, append);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            for (Student temp : students) {
                String studentData = toStringStudent(temp);
                if (studentData != null) {
                    bufferedWriter.write(studentData);
                    bufferedWriter.newLine();
                }
            }
        } catch (IOException e) {
            System.out.println("Lỗi ghi file!");
        }
    }
    public String toStringStudent(Student student) {
        return student.getCode() +"," +  student.getName() + "," + student.getBirtday() + "," + student.getGender() +","+ student.getPhone() +"," + student.getCodeClass();
    }

    public List<Student> getAll() {
        List<Student> students1 = new LinkedList<>();
        File file = new File(SRC_STUDENT);
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                String[] temp = line.split(",");
                    students1.add(new Student(Integer.parseInt(temp[0]),temp[1],temp[2],temp[3],temp[4],temp[5]));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Khômng tìm thấy file");
        } catch (IOException e) {
            System.out.println("Lỗi đọc dữ liệu");
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println("Lỗi đóng file");
                }
            }
        }
        students = new ArrayList<>(students1);
        return students;
    }

    public boolean findByCode(int code) {
        for(Student student: students){
            if(student.getCode()== code){
                return true;
            }
        }
        return false;
    }

    public void delete(int code) {
        for(Student student: students){
            if(student.getCode()== code){
                students.remove(student);
                writeFile(students,false);
            }
        }
    }
}
