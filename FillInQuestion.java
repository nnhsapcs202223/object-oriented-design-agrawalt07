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
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here

    }
}
