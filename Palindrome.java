import java.util.Scanner;

public class Palindrome {

    Palindrome() {

        System.out.println("Checking...!!!");

    }

    boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;

    }

    public static void main(String[] args) {

        Palindrome a1 = new Palindrome();
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a string to check to palindrome :");
            String input = sc.nextLine();

            sc.close();

            if (a1.isPalindrome(input)) {
                System.out.println(input + " is palindrome.");
            } else {
                System.out.println(input + " is not palinndrome.");
            }

        } catch (Exception e) {
            System.out.println("Unkmown error occured...");
        }

    }
}
