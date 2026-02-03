import java.util.Scanner;

class Employee {
    int age;
    String name;
    Scanner s1 = new Scanner(System.in);

    void getdata() {
        System.out.print("Enter Employee Name: ");
        name = s1.nextLine();
        System.out.print("Enter Employee Age: ");
        age = s1.nextInt();
        s1.nextLine();
    }

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
    }
}

class Qualification extends Employee {
    String q;

    void accept() {
        super.getdata();
        System.out.print("Enter Employee Qualification: ");
        q = s1.nextLine();
    }

    void show() {
        super.display();
        System.out.println("Employee Qualification: " + q);
    }
}

class Designation extends Employee {
    String des;

    void input() {
        super.getdata();
        System.out.print("Enter Employee Designation: ");
        des = s1.nextLine();
    }

    void output() {
        super.display();
        System.out.println("Designation: " + des);
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Qualification s2 = new Qualification();
        System.out.println("---Enter Employee Details---");
        s2.accept();
        System.out.println("---Qualification Details---");
        s2.show();

        Designation s3 = new Designation();
        System.out.println("---Enter Employee Details---");
        s3.input();
        System.out.println("---Designation Details---");
        s3.output();
    }
}
