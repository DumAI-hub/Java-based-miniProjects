import java.util.Scanner;

class addition1{
		int num1=0;
		int num2=0;
		int sum =0;

	Scanner sc = new Scanner(System.in);
	addition1(){

                System.out.println("Enter two number to add :");
                num1 = sc.nextInt();
                num2 = sc.nextInt();

                sum = num1+num2;

                System.out.println("Sum is " + sum);
	}


	public static void main(String args[]){
	
		addition1 a = new addition1();	
	}

}
