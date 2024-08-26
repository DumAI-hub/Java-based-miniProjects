import java.util.Scanner;

class helloworld{

	helloworld(){}


	
	public static void main (String args[]){
		
		
		Scanner sc = new Scanner(System.in);
		char user;
		System.out.println("Enter your name :");
		user = sc.next().charAt(1);
		System.out.println("Hello " + user + " !");
		sc.close();
	}

}
