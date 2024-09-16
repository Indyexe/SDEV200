import java.io;
import java.util;

public class AscendingOrder {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a valid file path as the argument"); //Tells user to put in a valid filepath
            return;
        }

        String fileName = args[0];
        List<String> wordList = new ArrayList<>();

        try { //try block to handle any exception in the code
            readFileAndCollectWords(fileName, wordList);
            sortWords(wordList);
            printWords(wordList);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }