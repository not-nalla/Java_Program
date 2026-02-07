import java.util.Scanner;

public class Calculator {
    public static void main(String a[]){
        Scanner s1=new Scanner(System.in);
        
        System.out.println("----Menu Driven Calculator----");
        System.out.print("Enter 1st no:");
        int num1=s1.nextInt();
        System.out.print("Enter 2nd no:");
        int num2=s1.nextInt();
        System.out.println("--Menu--");
        System.out.println("~1.Addition");
        System.out.println("~2.Subtraction");
        System.out.println("~3.Multiplication");
        System.out.println("~4.Division");
        System.out.println("~5.Modulus");
        System.out.print("Enter your Choice : ");
        int choice=s1.nextInt();

        switch (choice) {
            case 1:
                int add=num1+num2;
                System.out.println("Addtion of "+num1+" & "+num2+" = "+add);
                break;
            
            case 2:
                int sub=num1-num2;
                System.out.println("Subtraction of "+num1+" & "+num2+" = "+sub);
                break;

            case 3:
                int mul=num1*num2;
                System.out.println("Multiplication of "+num1+" & "+num2+" = "+mul);
                break;

            case 4:
                if( num2 !=0){
                int div=num1/num2;
                System.out.println("Division of "+num1+" & "+num2+" = "+div);
                }else {
                    System.out.println("Can't divide by Zero/0");
                }
                break;

            case 5:
                if( num2 !=0){
                int mol=num1%num2;
                System.out.println("Modulo of "+num1+" & "+num2+" = "+mol);
                } else {
                    System.out.println("Can't modulo by Zero/0");
                }
                break;

            default:
                throw new AssertionError();
        }

    }
    
}
