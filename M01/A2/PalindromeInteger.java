public class PalindromeInteger {

   //Methods for the program
    public static int reverse(int number) {
        int reversing = 0;

        while (number !=0) {
            reversing = reversing * 10 + number % 10; 
            number /= 10; //removing the last digit
        }
    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }


 
 public static void main(String[] args) {
}

}