import java.util.*; 
/**
 * An exam has a list of questions; an exam is not a question
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Exam
{
    // instance variables - replace the example below with your own
    private int x;
    private ArrayList<Question> questions;
    /**
     * Constructor for objects of class Exam
     */
    public Exam()
    {
        this.questions = new ArrayList<Question>(); 
        
    }
    
    public void addQuestion(Question question){
        this.questions.add(question);
    }
    
    public void askQuestions(){
        Scanner in = new Scanner(System.in);
        
        for(Question q:questions){
            System.out.println(q.toString());
            
            System.out.print("Your answer: ");
            String response = in.nextLine(); 
            
            System.out.println(q.checkAnswer(response));
            
        }
    }

}
