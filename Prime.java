import java.util.Scanner;

public class Prime {

    Prime(int num){
        int count =0;
        if(num == 1 || num ==2){
            System.out.println(num + " is a prime number");
        }else{

            for(int i = 1; i <= num; i++){
                if(num % i == 0){
                    count++;
            }

            
        }

        if(count == 2){
            System.out.println(num + " is a prime number.");
        }else{
            System.out.println(num + " is not a prime number");
        }
        
    }
    
}

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    try{
        System.out.println("Enter the number :");
        int num = sc.nextInt();

        Prime p1=new Prime(num);
    }catch(Exception e){

        System.out.println("Please enter a valid input");

    }

        
}
}