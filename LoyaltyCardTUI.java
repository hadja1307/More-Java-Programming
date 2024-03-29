import java.util.Scanner;
/**
 *  LoyaltyCardTUI provides a text-based user interface.
 *
 * @author (Hadja Diallo/ w18016571)
 * @version (01/12/2018)
 */
public class LoyaltyCardTUI
{
    private LoyaltyCardList loyaltyCardList; 
    Scanner myScanner;

    /**
     * Constructor for objects of class LoayltyCardTUI
     */   
    public LoyaltyCardTUI() 
    {
        // initialization of objects
        myScanner = new Scanner( System.in);
        loyaltyCardList = new LoyaltyCardList ();
    }

    /**
     * provides the main user interface with the program
     */
    public void menu()
    {
        // while loop
        int command = -1;
        while ( command != 0 )
        { 
            displayMenu();
            command = getCommand();
            execute( command );
        }
    }

    /**
     * displays the menu string on the terminal display
     */

    private void displayMenu()
    {
        System.out.println ("Please select one of the following options:");
        System.out.println ("To Add a loyalty card press  1 \n");
        System.out.println ("To Get the number of loyalty cards in the class press 2 \n");
        System.out.println ("To Remove a loyaltycard press  3 \n");
        System.out.println ("To Display all loyalty cards press  4 \n");
        System.out.println ("To Find a specific loyalty card press  5 \n");
        System.out.println ("To Quit the program press   0 \n");
        System.out.println( "Enter option number : ");

    }

    /**
     *  obtains the user's command
     *  one command per line
     *  @return the user command
     */
    private int getCommand()
    {
        System.out.println("Enter command: \n");
        int command = myScanner.nextInt();
        myScanner.nextLine();
        return command;
    }

    /**
     * processes the legal commands
     * @param command the command entered by the user
     */
    private void execute(int command)
    {

        if (command == 1)
        {
            addLoyaltyCard(); 
        }
        else if (command == 2)
        {
            getNumberOfLoyaltyCards(); 
        }
        else if (command == 3)
        {
            removeLoyaltyCard(); 
        }
        else if (command == 4)
        {
            showAllLoyaltyCards();
        }
        else if (command == 5)
        {   
            showLoyaltyCard();
        }   
        else if (command == 0)
        {
            quitCommand();
            System.exit(0);

        }
        else
        {
            unknownCommand(command); 
        }  

    }

    /**
     * Remove a loyalty card with the given card number. 
     * If successful output 
     * “Loyalty card with card number [cardNumber] removed.” 
     * If not then:“Could not find loyalty card number [cardNumber]” 
     */

    private void removeLoyaltyCard()
    {     
        System.out.print("Enter a cardnumber : ");
        String cardNumber = myScanner.nextLine();
        if (loyaltyCardList.removeLoyaltyCard(cardNumber))
            System.out.println("LoyaltyCard with cardnumber: " + cardNumber + " removed ");
        else
            System.out.println("Could not find loyalty card number: " + cardNumber);
    }

    /**
     * Creates a new loyalty card object. 
     */
    private void addLoyaltyCard()
    {   
        System.out.print("Enter a Title : ");
        String loyaltycardTitle = myScanner.nextLine();
        System.out.print("Enter your lastname : ");
        String loyaltycardLastName = myScanner.nextLine();
        System.out.print("Enter your firstname : ");
        String loyaltycardFirstName = myScanner.nextLine();
        System.out.print("Enter your street : ");
        String loyaltycardStreet = myScanner.nextLine();
        System.out.print("Enter your Postcode : ");
        String loyaltycardPostcode = myScanner.nextLine();
        System.out.print("Enter your Town: ");
        String loyaltycardTown = myScanner.nextLine();
        System.out.print("Enter your card number : ");
        String loyaltycardCardNumber = myScanner.nextLine();

        loyaltyCardList.addLoyaltyCard(new LoyaltyCard (loyaltycardTitle, loyaltycardFirstName, loyaltycardLastName, 
                loyaltycardStreet, loyaltycardTown,
                loyaltycardPostcode, loyaltycardCardNumber));

        // allows the user to enter the following: title, firstname, lastname, street, town, postcode and cardnumber

    }

    /**
     *    Return the number of loyalty cards in a formatted String 
     *    e.g. “We have 7 loyalty cards.”
     */
    private void getNumberOfLoyaltyCards()
    {
        System.out.println("You have : " + loyaltyCardList.getNumberOfLoyaltyCards() + "Loyalty cards \n");
    }

    /**
     * Produce a message that application is closing 
     * then call System.exit(0) 
     */
    private void quitCommand()
    {
        System.out.println(" Program closing down");
        System.exit(0);
    }

    /**
     * Prints out “Unknown command.”
     * if option is not between 0 – 5. 
     */
    private void unknownCommand(int command)
    {
        System.out.println("Unknown command: " + command);
    }   

    /**
     * print out details of all loyalty cards. 
     * space should be left between each to make it easier to read
     */
    private void showAllLoyaltyCards()
    {

        loyaltyCardList.getAllLoyaltyCards();
        System.out.println();

    }   

    /**
     * Print out loyalty card with chosen card number. 
     * If method is unsuccessful then a message “Could not find loyalty card for number [cardNumber].”
     * should be output.
     */

    private void showLoyaltyCard()
    {
        System.out.print("Enter a card number : ");
        String cardNumber = myScanner.nextLine();
        if(loyaltyCardList.getLoyaltyCard(cardNumber))
        {
            System.out.println("LoyaltyCard with the cardnumber:" + cardNumber + "has been found \n");

        } 
        else
        {
            System.out.println("Unsuccessful LoyaltyCard with the cardnumber:" + cardNumber + "has  not been found \n");
        }   

    }    
}  // end of LoyaltyCardTUI class

