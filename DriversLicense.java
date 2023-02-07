
/**
 * Write a description of class DriversLicense here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DriversLicense extends Card
{
    private int exp;
    public DriversLicense(String n, int exp){
        super(n);
        this.exp = exp;
    }
    @Override
    public String toString(){
        return super.toString() + " Expiration date: "+ this.exp; 
    }
}
