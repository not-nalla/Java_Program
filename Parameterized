import java.util.Scanner;

class Employee {
    int roll_id;
    String name;
    String dept;

    Employee(int id, String n, String d) {
        roll_id = id;
        name = n;
        dept = d;
    }

    void display() {
        System.out.println("Name of Employee: " + name);
        System.out.println("Id of Employee: " + roll_id);
        System.out.println("Department of Employee: " + dept);
    }
    
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("---Enter Info for Employee---");

        System.out.println("Enter Employee ID:");
        int id = s1.nextInt();
        s1.nextLine();

        System.out.println("Enter Employee Name:");
        String n = s1.nextLine();

        System.out.println("Enter the Department:");
        String d = s1.nextLine();

        Employee e = new Employee(id, n, d);
        System.out.println("---Employee Info---");
        e.display();
    }
 
}

