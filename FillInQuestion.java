import java.util.Scanner; 
/**
 * Write a description of class FillInQuestion here.
 *A fill in question is constructed with a string that contains the answer surrounded by _. For example, "The Inventer of Java is _James Gosling_". The question 
 *  should be displayed as: "The inventor of Java is _______"
 * @author (your name)
 * @version (a version number or a date)
 */
/*
 * The FillInQuestion class extends (i.e, is a subclass of, is derived from) the Question class
 */
public class FillInQuestion extends Question 
{
    /*
     * DO NOT DECLARE THE INSTANCE VARIABLES text AND answer!
     * 
     * Text and answer instance variables are inherited from the Question class
     */
    // instance variables - replace the example below with your own


    /**
     * Constructs a FillInQuestion object with the specified text that contains the answer. 
     * 
     * @param question the specified question text with embedded answer
     */
    public FillInQuestion(String question)
    {
        /*
         * Explicitly call the Question class's constructor that takes a single paramater. 
         *      Calling a superclass's constructor *must* be the first line of code in 
         *      the subclass's constructor
         * 
         * If we don't explicitly call a superclass's constructor, Java will automatically 
         *      call the superclass's default (i.e. no paramaters) constructor if it can.
         */    
        // initialise instance variables
        
        super(question); 
    }

    /**
     *This method overrides the setText method in the setText method in the Question class. 
     *
     *Sets the question text and answer
     *
     * @param  questionText the text of the question, including the answer
     */
    
    /*
     * Use the @Override annotation when overriding a method to signal to the compiler
     *      to verify that you are in fact overriding and not overloading by mistake
     */
    @Override
    public void setText(String questionText){
        Scanner parser = new Scanner(questionText);
        parser.useDelimiter("_");
        String question = parser.next();
        String answer = parser.next();
        question += "______" + parser.next();
        
        super.setText(question);
        
        
        /*
         * We should use the "this" reserved word to call the setAnswer method. If the 
         *      subclass doesn't override the setAnswer method, the superclass's method 
         *      will be called. 
         *      
         * We don't want to use the "super" reserved word in this case, because if we
         *      later override setAnswer, the overriden method would not be called. 
         */
        this.setAnswer(answer);
    }
  /*
   * Use the "super" reserved word to call the setText method as defined in 
   *        the superclass (e.g., Question)
   */
}
