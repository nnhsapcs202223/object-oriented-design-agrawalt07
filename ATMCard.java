
/**
 * Write a description of class ATMCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ATMCard extends Card
{
   private String cardNumber, pin;
    public ATMCard(String cardNumber, String pin, String n){
        super(n);
        this.pin = pin;
        this.cardNumber = cardNumber;
    }
    
    @Override
    public String toString(){
        return super.toString() + " Card Number: " + this.cardNumber + "PIN: " + pin;
    }
    
    
}
