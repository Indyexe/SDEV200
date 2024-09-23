
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


        //Second Class which is the WelcomeScreen 
        public class WelcomeScreen {
            private String landingPageWelcome = "Welcome to the Casino Showdown App!";
            private String enterBlackjack = "To get to the Blackjack game press enter on your keyboard";

            public WelcomeScreen() {
                //simple constructor I will expand upon this later on.
            }

            // This just displays the welcome message
            public String loginToWelcome() {
                return landingPageWelcome;
            }
        }

            //This is the message that tells the user to enter to the Blackjack Game
        public String getToBlackjack() {
            return enterBlackjack;
        }

        //Third class for the actual blackjack game
public class BlackjackGame {

// Variables for blackjack Game
    private int userBet;
    private int userBalance = 1000; 
    private String dealerCards = "";
    private String userCards = "";

    //Standard Constructor will be modified later on
    public BlackjackGame() {
    }

    //This allows the user to place a bet
    public void placeBet(int bet) {
        if (bet <= userBalance) {
            this.userBet = bet;
            this.userBalance -= bet; //This deducts the users bet from the balance
        } else {
            // Will expand upon this later for handling errors I occur when testing
        }
    }

    //This method simply checks the users balance
    public int viewBalance() {
        return userBalance;
    }

    // User hits a card this is the action that will occur
    public void hit(String card) {
        userCards += card + " ";
    }

    // Very simple stay method I'm still figuring out the logic to add within the method
    public void stay() {
        // Logic that will be filled in later on
    }

    //Method for getting the current bet
    public int getUserBet() {
        return userBet;
    }

    //method for getting current cards
    public String getUserCards() {
        return userCards;
    }

    // method for getting the dealer cards
    public String getDealerCards() {
        return dealerCards;
    }

    // method for setting the dealer cards
    public void setDealerCards(String cards) {
        dealerCards = cards;
    }

    // method for setting the balance after a win or loss
    public void setBalance(int balance) {
        userBalance = balance;
    }

    // method for resseting the game
    public void resetGame() {
        userCards = "";
        dealerCards = "";
        userBet = 0;
    }
}

public static void main(String[] args) {
    //Test area
}






    }