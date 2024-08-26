import java.util.Scanner;

class myfirstcode{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number :");
            int num = sc.nextInt();
            if(num == 0){
                throw ArithmeticException();
            }
        }catch(Exception e){
            System.out.println("Error");
        }
    
    }
}