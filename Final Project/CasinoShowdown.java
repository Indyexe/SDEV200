
import java util.Scanner;

        
    public class CasinoShowdown {

            //first class
      public class LoginScreen {
        private String userName;
        private String userPassowrd;
      
    

        //constructor
    public LoginScreen() {
        //Will fill out this constructor with more information if need be in the future
    }
            //This is the method to set the username and password at the sametime I decided to set them at the sametime which is different from my UML Diagram
    public void setCredentials(String userName, String userPassword) {
        this.userName = userName;
        this.userPassword = userPassword;
    }

    // Uses the setter method to get the credentials
    public String[] getCredentials() {
        return new String[] { userName, userPassword };
    }

    // Checks the credentials to see if they are correct
    public boolean isCredentialsSet() {
        return userName != null && userPassword != null;
    }

    // Updates the username with the users username
    public void updateUsername(String newUserName) {
        if (newUserName != null && !newUserName.isEmpty()) {
            this.userName = newUserName;
        } else {
            System.out.println("You have entered a invalid username");
        }
    }

    // Updates the password with the users password
    public void updatePassword(String newUserPassword) {
        if (newUserPassword != null && !newUserPassword.isEmpty()) {
            this.userPassword = newUserPassword;
        } else {
            System.out.println("You have entered a invalid password");
        }
    }
}



        public class WelcomeScreen {
            private string landingPageWelcome = 
        }








    }