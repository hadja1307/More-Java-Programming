
/**
 * Write a description of class LoyaltyCardArrayClass here.
 * 
 * @author (Hadja Diallo/ w18016571) 
 * @version (14/12/2018)
 */
public class LoyaltyCardArrayClass
{
    // initialisation of variables
    private  LoyaltyCard []   loyaltyCards; 
    private int currentIndex;
    /**
     * The constructor should set the size of the array at runtime and initialise the variable currentIndex.
     */
    public LoyaltyCardArrayClass( int maxNoOfLoyaltyCards)
    {
        currentIndex = 0;
        loyaltyCards = new LoyaltyCard[maxNoOfLoyaltyCards];

    }

    /**
     * check that there is space for a new loyalty card to be added to the array and, if so, add it utilising the LoyaltyCard class. 
     * Otherwise it should produce an error message “Membership full. Could not add LoyaltyCard!"
     * @param LoyaltyCard loyaltyCard the loyaltyCard
     */

    public void addLoyaltyCard( LoyaltyCard loyaltyCard)   
    {
        if (currentIndex < loyaltyCards.length) {

            loyaltyCards[currentIndex] = loyaltyCard;
            currentIndex++;

        }
        else
        {
            System.out.println(" Sorry.. Membership full. Could not add LoyaltyCard!");
        }

    }

    /**
     * should return the size of the array and the number of loyalty cards known as the currentIndex.
     */
    public int getNumberOfLoyaltyCards()    
    {
        return currentIndex;
    }

    /**
     * should return the size of the array and the number of loyalty cards known as the currentIndex.
     */
    public int getCapacity()    
    {
        return currentIndex;

    }

    /**
     * This should print all loyalty cards utilising a method of the LoyaltyCard class.
     */
    public void printAllLoyaltyCards()    
    {
        for (int index = 0; index < currentIndex; index++) {
            loyaltyCards[index].printCustomerDetails();
            System.out.println();

        }    
    }

    /**
     * Should search for a library card with the given card number and return the index utilising a method of the LoyaltyCardclass. 
     * If invalid it should return -1.
     * @return index    index
     * @return index++  index +1 each time an index has been found
     * @return -1       only if cardnumber is invalid
     */

    public int search(String cardNumber)    
    {
        for ( int index = 0; index < currentIndex ; index++)
        {
            if (cardNumber.equals(loyaltyCards[index].getCardNumber()))

            {
                return index;
            }
        }
        return -1;
    }  

    /**
     * This should print a single loyalty card given a card number utilising a method of the LoyaltyCard class. 
     * If this is invalid it should output "Loyalty card with card number: [cardNumber]   not found."
     * @return true - loyaltycard with card number has been found
     *  @return false - loyaltycard with card number has not been found
     */
    public boolean printLoyaltyCard(String cardNumber)    
    {
        int index = search (cardNumber); 
        if (index > -1) 
        {
            loyaltyCards[index].printCustomerDetails();
            System.out.println("Loyalty card with card number:"  + cardNumber +   " has been found.");
            return true;

        }
        else
        {
            System.out.println("Loyalty card with card number:"  + cardNumber +   " has not been found.");
            return false;    
        }    
    }

    /**
     * This should remove a loyalty card given a valid card number
     * utilising a method of the LoyaltyCardclass and reoganise the remaining elements of the array. 
     */

    public boolean removeLoyaltyCard (String cardNumber)    
    {
        int index = search (cardNumber); 

        if ( index < currentIndex && index > -1)
        {
            loyaltyCards[index] = null;
            squash( index );
            return true;

        }
        else
        {
            return false;    
        }    
    }

    private void squash(int index) 
    // private mehtod, comments are not necessary
    // private service method therefore no
    //javadoc commenting.
    {
        loyaltyCards[ currentIndex - 1] = null;
        currentIndex--;
        if ( index >= 0 )
        {
            for ( int i = index ; i < currentIndex ; i++)
            {
                loyaltyCards[i]= loyaltyCards[i+1];
            }

        }
    }
}//end of LoyaltyCardArrayClass
