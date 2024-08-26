import java.util.Scanner;

class add{
    Scanner sc = new Scanner(System.in);

    private double real, imag;
    void getData(){

        System.out.println("Enter the real part :");
        real = sc.nextDouble();
        System.out.println("Enter the imaginary number :");
        imag = sc.nextDouble();
    }
    public add sum(add other){
        add temp = new add();
        temp.real = real + other.real;
        temp.imag = imag + other.imag;

        return temp;
    }

    void display(){
        System.out.println("The sum of the two complex numbers is : " +real+ " + i" +imag);
    }
}


class Complex{
    public static void main(String[] args){
        add a1 = new add();
        add a2 = new add();
        add a3 = new add();
        
        System.out.println("Enter the frist complex no :");
        a1.getData();
        System.out.println("Enter the second complex no :");
        a2.getData();
        a3 = a1.sum(a2);

        a3.display();
        

    
    }
}