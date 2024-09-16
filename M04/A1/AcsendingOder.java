import java.io.*;
import java.util.*;

//As a heads up make sure you use the file path of the txt file in order for the program to work correctly
public class AcsendingOrder {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the path to the text file:");
        String fileName = scanner.nextLine();

        List<String> wordList = new ArrayList<>();

        try { //try block to handle any exception in the code I used this stackoverflow post to help me with this portion of code https://stackoverflow.com/questions/2535723/try-catch-on-stack-overflows-in-java
            readFileAndCollectWords(fileName, wordList);
            sortWords(wordList);
            printWords(wordList);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    //This is the method that validates the words and collects them
private static void readFileAndCollectWords(String filePath, List<String> wordList) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String currentLine;

        while ((currentLine = reader.readLine()) != null) {
            String[] splitWords = currentLine.split("\s+");
            for (String word : splitWords) {
                if (isValidWord(word)) {
                    wordList.add(word);
                }
            }
        }
        reader.close();
    }

    // This is the method that checks if the word starts with a letter
    private static boolean isValidWord(String word) {
        return word.matches("^[a-zA-Z].*");
    }

    // This method sorts the words alphabetically
    private static void sortWords(List<String> words) {
        Collections.sort(words);
    }

    // this method prints the sorted words
    private static void printWords(List<String> words) {
        for (String word : words) {
            System.out.println(word);
        }
    }
}