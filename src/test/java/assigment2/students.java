package assigment2;

import java.util.Scanner;

class Student {
    String name;
    String email;
    String phone;
    String address;
    String status;
    public Student() {

    }
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
        Student[] stu = new Student[n];
        for (int i = 0; i < n; i++) {
            stu[i] = new Student();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("enter student details");
            System.out.println("enter student name");
            stu[i].name = in.next();
            System.out.println("enter student email");
            stu[i].email = in.next();
            System.out.println("enter student phone");
            stu[i].phone = in.next();
            System.out.println("enter student address");
            stu[i].address = in.next();
            System.out.println("enter student status");
            stu[i].status = in.next();

        }
        System.out.println("enter which student details to display");
        int r=in.nextInt();

            System.out.println(stu[r].name);
            System.out.println(stu[r].email);
            System.out.println(stu[r].phone);
            System.out.println(stu[r].address);
            System.out.println(stu[r].status);
        in.close();
    }
}
//output
//Input number of students:
//2
//Input Student String name, String email, String phone,String address,String status
//enter student details
//enter student name
//adarsh
//enter student email
//adarsh@mail.com
//enter student phone
//9900998949
//enter student address
//address1
//enter student status
//single
//enter student details
//enter student name
//ramu
//enter student email
//ramu@mail.com
//enter student phone
//345678
//enter student address
//ertyu
//enter student status
//mingle
//enter which student details to display
//1
//ramu
//ramu@mail.com
//345678
//ertyu
//mingle
