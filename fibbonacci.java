import java.util.Scanner;

public class fibbonacci {

    

    int fib(int num){
        if(num <= 1){
            return num;
        }
        return fib(num-1)+fib(num-2);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter the number for fib series :");
        int num = sc.nextInt();

        fibbonacci f = new fibbonacci();

        System.out.println("The series upto " + num);
        for(int i = 0; i < num; i++){
            System.out.print(f.fib(i) + " ");
        }
        

    }

    
}
