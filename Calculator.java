import java.util.Scanner;

public class Calculator {
    Scanner sc = new Scanner(System.in);

    Calculator(){
        System.out.println("....Simple Calculator....");
    }
    void add(){

        System.out.println("Enter the numbers to add :");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println();
        System.out.println(sum);
    }

    void sub(){
        System.out.println("Enter the numbers to subtract :");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int res = num1 - num2;

        System.out.println();
        System.out.println(res);
    }

    void mul(){
        System.out.println("Enter the numbers to multiply");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int sum = num1 * num2;

        System.out.println();
        System.out.println(sum);
    }

    void div(){
        System.out.println("Enter the numbers to divide : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int sum = num1 / num2;

        System.out.println();
        System.out.println(sum);
    }

    void modu(){
        System.out.println("Enter the numbers to check he modulus : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int sum = num1 % num2;

        System.out.println();
        System.out.println(sum);
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Calculator c = new Calculator();

        while(true){
            System.out.println("\n\n***Menu***\n1.Addition.\n2.Substraction.\n3.Multiply.\n4.Divide.\n5.Modulus.\n6.Exit.");
            System.out.println("Enter your choice:");
            int option = sc.nextInt();

            switch(option) {
                case 1:
                    c.add();
                    break;
                case 2:
                    c.sub();
                    break;
                case 3:
                    c.mul();
                    break;
                case 4:
                    c.div();
                    break;
                case 5:
                    c.modu();
                    break;
                case 6:
                    System.out.println("Exitinggg....!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option...!");
            }
        }

    }
}
