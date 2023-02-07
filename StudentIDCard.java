public class StudentIDCard extends Card
{
    private String idNumber;
   
    public StudentIDCard(String n, String id)
    {
        super(n);
        idNumber = id;
    }
   
    @Override
    public String toString(){
        return super.toString() + " ID: " + idNumber;
    }
}