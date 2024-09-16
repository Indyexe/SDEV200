import java.util.*;
  import java.io.*;
 
   public class CountKeywords {
     public static void main(String[] args) throws Exception {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter a Java source file: ");
       String filename = input.nextLine();
 
      File file = new File(filename);
      if (file.exists()) {
        System.out.println("The number of keywords in " + filename
          + " is " + countKeywords(file));
      }
      else {
        System.out.println("File " + filename + " does not exist");
      }
    }

    public static int countKeywords(File file) throws Exception {
      // Array of all Java keywords + true, false and null
      String[] keywordString = {"abstract", "assert", "boolean",
          "break", "byte", "case", "catch", "char", "class", "const",
          "continue", "default", "do", "double", "else", "enum",
          "extends", "for", "final", "finally", "float", "goto",
          "if", "implements", "import", "instanceof", "int",
          "interface", "long", "native", "new", "package", "private",
          "protected", "public", "return", "short", "static",
          "strictfp", "super", "switch", "synchronized", "this",
          "throw", "throws", "transient", "try", "void", "volatile",
          "while", "true", "false", "null"};

      Set<String> keywordSet =
        new HashSet<>(Arrays.asList(keywordString));
      int keywordCount = 0;
    boolean inCommentBlock = false; // Checks if inside a block comment

    // This usses BufferedReader to read contents of file line by line
    BufferedReader reader = new BufferedReader(new FileReader(file));
    String line;

        // This post on stackoverflow helped me with this while statement https://stackoverflow.com/questions/77452826/java-substring-of-multi-line-string-up-to-nth-line-and-character-index-on-that-l
    while ((line = reader.readLine()) != null) { 
        // This helps handle multi line comment blocks
        if (inCommentBlock) {
            int endCommentIndex = line.indexOf("/");
            if (endCommentIndex != -1) {
                inCommentBlock = false; // End of comment block found
                line = line.substring(endCommentIndex + 2); 
            } else {
                continue; 
            }
        }
    }

        int startCommentIndex = line.indexOf("/");
        if (startCommentIndex != -1) {
            inCommentBlock = true;
            line = line.substring(0, startCommentIndex); 
        }

        // This portion of code helps handle single line comments
        int singleLineCommentIndex = line.indexOf("//");
        if (singleLineCommentIndex != -1) {
            line = line.substring(0, singleLineCommentIndex); 
        }


        line = line.replaceAll
        
        // Tokenize the line using non-word characters as delimiters
        String[] tokens = line.split("[^a-zA-Z0-9_]+");

        // This checks each token to see if it's a keyword
        for (String token : tokens) {
            if (keywordSet.contains(token)) {
                keywordCount++; // Increments the keyword count if the token is a keyword
            }
        }
    }

    reader.close(); 
    return keywordCount;
} 

    }

    //I coudn't get the program to compile despite trying to debug the program.