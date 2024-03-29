import java.util.*;
/**
 * LoyaltyCardList represents a collection of loyalty cards.
 * 
 * @author (Hadja Diallo/ w18016571) 
 * @version (03/12/2018)
 */
public class LoyaltyCardList
{
    private ArrayList<LoyaltyCard> loyaltyCards;   
    //Arraylist

    /**
     * Constructor for objects of class LoyaltyCardList
     */
    public LoyaltyCardList()
    {
        loyaltyCards = new ArrayList<LoyaltyCard>();
    }

    /**
     * @ param LoyaltyCard  the LoyaltyCard
     * @param LoyaltyCard   the LoyaltyCard
     * Allows a LoyaltyCard to be added to the collection. 
     */
    public void addLoyaltyCard(LoyaltyCard loyaltyCard)
    {
        loyaltyCards.add(loyaltyCard);
    }

    /**
     * Should return the current number of cards using the function size(). 
     * held via a BlueJ ‘method result’ dialog box. 
     */
    public int getNumberOfLoyaltyCards()
    {
        return loyaltyCards.size();
    }

    /**
     * Outputs details of the LoyaltyCard at the given index position to the terminal window.
     * If the index value is invalid (less than zero or too high for the number of cards held) 
     * an appropriate message should be output instead. 
     */
    public void getLoyaltyCard(int loyaltyCardEntry)
    //if loyaltyCardEntry is less than 0, the message of "Negative entry!" and the loyaltyCardEntry will be the output on the screen.
    {
        if (loyaltyCardEntry < 0)
        {
            System.out.println("Negative entry: " + loyaltyCardEntry);
        }
        else if (loyaltyCardEntry < getNumberOfLoyaltyCards())
        { 
            LoyaltyCard loyaltyCard = loyaltyCards.get(loyaltyCardEntry);
            loyaltyCard.printCustomerDetails();
        }
        else
        {
            System.out.println("No such entry: " + loyaltyCardEntry);
        }
    }

    /**
     * Outputs all details of all cards to the terminal window including the following:
     * Title, Firstname, Lastname, postcode, street, town, cardnumber and number of points. 
     * 
     */
    public void getAllLoyaltyCards()
    {
        for(LoyaltyCard loyaltyCard : loyaltyCards)
        {
            loyaltyCard.printCustomerDetails();
            System.out.println();
        }
    }

    /**
     * Should remove the LoyaltyCard at the
     * index position specified as a parameter. 
     * via BlueJ 'method result ' dialog box.
     */
    public void removeLoyaltyCard(int loyaltyCardEntry)
    {
        if(loyaltyCardEntry < 0)
        {
            System.out.println("Negative entry :" + loyaltyCardEntry);
        }
        else if(loyaltyCardEntry < getNumberOfLoyaltyCards())
        {
            loyaltyCards.remove(loyaltyCardEntry);
        }
        else
        {
            System.out.println("No such entry :" + loyaltyCardEntry);
        }
    }

    /**
     * 
     * Should remove the LoyaltyCard with the card number specified as a parameter if it the LoyaltyCard exists. 
     * The appropriate boolean value should then be returned via a BlueJ ‘method result’ dialog box. 
     * */
    public boolean removeLoyaltyCard(String cardNumber)
    {
        int index = 0;
        for (LoyaltyCard loyaltyCard: loyaltyCards)
        {
            if (cardNumber.equals(loyaltyCard.getCardNumber()))
            {
                loyaltyCards.remove(index);
                return true;
            }
            index++;
        }
        return false;
    }

    /**
     * should receive a string representing the loyalty card’s card number and should print details of a loyalty card with the given card number to the console window via the printCustomerDetails method defined in LoyaltyCard. 
     * If the number is found then it should then return true. However if the loyalty card is not found it should return false.
     * 
     */
    public boolean getLoyaltyCard(String cardNumber)
    {
        int index = 0;
        for (LoyaltyCard loyaltyCard: loyaltyCards)
        {
            if (cardNumber.equals(loyaltyCard.getCardNumber()))
            {

                loyaltyCard.printCustomerDetails();
                return true;
            }
            index++;
        }
        return false;
    }

    /**
     * Should search the ArrayList for a LoyaltyCard with the card number specified as a parameter. 
     * The appropriate index value should then be returned via a BlueJ ‘method result’ dialog box.
     * If not found ‘-1’ should be returned instead. 
     * 
     * 
     */ 
    public int search(String cardNumber)
    {
        int index = 0;
        for (LoyaltyCard loyaltyCard : loyaltyCards)
        {
            if (cardNumber.equals(loyaltyCard.getCardNumber()))
            {
                return index;
            }
            else
            {
                index++;
            }
        }
        return -1;
    }   

}//end of LoyaltyCardList class
