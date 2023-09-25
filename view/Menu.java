package view;

import manager.StudentManager;
import model.Student;

import java.util.Scanner;

public class Menu {
    Scanner inputInt = new Scanner(System.in);
    int choice;
    Scanner inputString = new Scanner(System.in);
    StudentManager studentManager = new StudentManager();

    public void showMenu(){
       do {
           System.out.println("===Menu===\n1.Thêm sinh viên\n2.Sửa sinh viên\n3.Xóa sinh viên\n4.Hiển thị tất cả sinh viên\n5.Tìm kiếm");
           System.out.println("Nhập lựa chọn của bạn");
           choice = inputInt.nextInt();
           switch (choice){
               case 1:
                   add();
                   break;
               case 2:
                   update();
                   break;
               case 3:
                   remove();
                   break;
               case 4:
                   showAll();
                   break;
               case 5:
                   getName();
                   break;
           }
       }while (choice!=0);
    }
    public void add(){
        System.out.println("Nhập tên sinh viên ");
        String name = inputString.nextLine();
        System.out.println("Nhập giới tính");
        String sex = inputString.nextLine();
        System.out.println("Nhập điểm  toán");
        double math = inputInt.nextDouble();
        System.out.println("Nhập điểm văn");
        double literature = inputInt.nextDouble();
        System.out.println("Nhập điểm tiếng anh");
        double english = inputInt.nextDouble();
        double [] score = {math,literature,english};
        Student student = new Student(name,sex,score);
        studentManager.add(student);
        System.out.println("Thêm thành công");
    }
    public void showAll(){
        System.out.println(studentManager.findAll());
    }
    public void update(){
        System.out.println("Nhập id muốn sửa");
        int id = inputInt.nextInt();
        System.out.println("Nhập tên sinh viên ");
        String name = inputString.nextLine();
        System.out.println("Nhập giới tính");
        String sex = inputString.nextLine();
        System.out.println("Nhập điểm  toán");
        double math = inputInt.nextDouble();
        System.out.println("Nhập điểm văn");
        double literature = inputInt.nextDouble();
        System.out.println("Nhập điểm tiếng anh");
        double english = inputInt.nextDouble();
        double [] score = {math,literature,english};
        Student student = new Student(name,sex,score);
        studentManager.update(id,student);
        System.out.println("Sủa thành công");
    }
    public void remove(){
        System.out.println("Nhập id muốn xóa");
        int id = inputInt.nextInt();
        studentManager.remove(id);
        System.out.println("Xóa thành công");
    }
    public void getName(){
        System.out.println("Nhập tên bạn muốn tìm kiếm");
        String name = inputString.nextLine();
        System.out.println( studentManager.getName(name));
    }
}
