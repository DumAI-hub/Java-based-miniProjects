import java.util.Scanner;

public class Armstronng {

    boolean isArm (int x){

        int digit=0 ;
        int sum = 0, temp = x, y =x;
        
        while(y != 0){
            y = y / 10;
            digit++;
        }

        while(temp != 0){
        
            int r = temp % 10;
            sum += Math.pow(r, digit);
            temp = temp / 10;

        }

        return (sum == x);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Armstronng a = new Armstronng();

        System.out.println("Enter the number to check : ");
        int num = sc.nextInt();

        if(a.isArm(num)){
            System.out.println(num + " is an armstrong number.");
        }else{
            System.out.println(num + " is not an armstrong number.");
        }

        sc.close();
    }
    
}
