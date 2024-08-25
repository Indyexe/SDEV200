
import java.util.Scanner;

public class PalindromeInteger {

   //Methods for the program
    public static int reverse(int number) {
        int reversing = 0;

        while (number !=0) {
            reversing = reversing * 10 + number % 10; 
            number /= 10; //removing the last digit
        }
        return reversing;
    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number); 
    }


 
 public static void main(String[] args) {

    Scanner userInput = new Scanner(System.in);
//This section gets the users input
System.out.print("Enter a number: ");
int number = userInput.nextInt();

System.out.println("The reverse of your number is: " + reverse(number));

//checks if the number is a Palindrome
if (isPalindrome(number)) {
    System.out.println("The number you entered is a palidrome");
    
} else {
    System.out.println("The number you entered is not a palidrome");
}

userInput.close();

}

}