package assigment2;

import java.util.Scanner;

class Student {
    String name;
    String email;
    String phone;
    String address;
    String status;
    
        public Student(String nameinit, String email, String phone,String address,String status ) {
        name = nameinit;
        email = email;
        phone = phone;
        address=address;
        status=status;
    }
}

public class students {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number of students:");
        int n = Integer.parseInt(in.nextLine().trim());
        System.out.println("Input Student String name, String email, String phone,String address,String status");
        Student stu[] = new Student[3];
        for (int i = 0; i < n; i++) {
            stu[i].name = in.next();
            stu[i].email = in.next();
            stu[i].phone = in.next();
            stu[i].address = in.next();
            stu[i].status = in.next();
            System.out.println("enter next student details");
        }
        in.close();
        for (int i = 0; i < n; i++) {
            System.out.println(stu[i].name);
            System.out.println(stu[i].email);
            System.out.println(stu[i].phone);
            System.out.println(stu[i].address);
            System.out.println(stu[i].status);
        }
    }
}
