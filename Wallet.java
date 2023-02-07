
/**
 * Write a description of class Wallet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Wallet
{
    // instance variables - replace the example below with your own
    private Card card1;
    private Card card2; 

    /**
     * Constructor for objects of class Wallet
     */
    public Wallet(Card card1, Card card2)
    {
        this.card1 = card1;
        this.card2 = card2;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void addCard(Card card){
     if(this.card1==null){
         this.card1 = card;
     }
     else if(this.card2 == null){
        this.card2 = card;
     }
    }
     
    public String toString(){
        if(card1!= null && card2 != null){
            return card1.toString() + " " + card2.toString();
        }
        else if (card1 == null && card2 != null){
            return card2.toString();
        }
        else if(card1 != null){
            return card1.toString();
        }
            return null;
    }
}
