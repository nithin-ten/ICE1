package exercise1;
import java.util.*;
/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Nithin Tenson jan 25
 * 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        Card[] hand = new Card[7];
        
        for (int i = 0; i < hand.length; i++) {
            
            Card card = new Card();
            
            card.setValue((int)(1+Math.random()*13));
            
            card.setSuit(Card.SUITS[random.nextInt(4)]);
            
            hand[i] = card;
            
            
            System.out.println(hand[i]);

        }
        
        Card usrCard = new Card();
        
        System.out.print("Enter the card value (1-13, 1 for Ace, 11 for Jack, 12 for Queen, 13 for King: ");
        
        usrCard.setValue((in.nextInt()));
        
        System.out.print("Enter the card suit (1 for Hearts, 2 for Diamonds, 3 for Spades, 4 for Clubs):");
        
        usrCard.setSuit(Card.SUITS[(in.nextInt()-1)]);
        
        System.out.println(usrCard);
        
        boolean a = false;
        for (int i=0; i<hand.length; i++)
        {
            if(usrCard.getValue() == hand[i].getValue() && usrCard.getSuit() == hand[i].getSuit()){
                a = true;
            }
            else
                continue;
        }
        
        if (a){
            
            System.out.println("Match Found");
            printInfo();
        }
        else{
            System.out.println("No Match Found");
        }
        
       
        
        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Nithin Pinky Tenson");
        System.out.println();
        
        System.out.println("My career ambitions: To become Programmer");
        System.out.println("Be more active on LinkedIn");
        System.out.println("Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies: ");
        System.out.println("-- Music");
        System.out.println("-- gaming");
        System.out.println("-- Reading/Watching Art");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
        
    
    }

}
