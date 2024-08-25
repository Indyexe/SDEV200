
import java.util.Scanner;

public class MajorDiagonal {

    //sum of the major diagonal method
    public static double sumMajorDiagonal (double [] [] m) {
        double total = 0;
        for (int i = 0; i < m.length; i++) {
            total += m[i][i]; // This adds only the diagonal I used this article to help me figure this out https://www.geeksforgeeks.org/efficiently-compute-sums-of-diagonals-of-a-matrix/
        }
        return total;
    }

    //User Input Method
    public static double[][] getArray() {
        Scanner userInput = new Scanner(System.in);
        double[][] m = new double[4][4]; 

    System.out.println("Enter " + m.length + " rows and " + m[0].length + " columns: ");
            //For this portion of code I used help from listing 8.1 on page 296 in the Liang Book
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) { 
                m[i][j] = userInput.nextDouble();
            }
        }   
        return m;   
    }
    


     public static void main(String[] args) {

        double[][] matrix = getArray();

        double sum = sumMajorDiagonal(matrix);

        //final output of what the user enters
        System.out.println("The sum of the elements in your major diagonal is: " + sum);

     }

}
