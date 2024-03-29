import java.util.Scanner;

/**
   This program shows a simple quiz with one question.
*/
public class QuestionDemo
{
   public static void main(String[] args)
   {
      
    Scanner in = new Scanner(System.in);

      Question q = new FillInQuestion("The inventor of Java is _James Gosling_.");
/*
      System.out.println( q );
      System.out.print("Your answer: ");
      String response = in.nextLine();
      System.out.println(q.checkAnswer(response));
      */
      
      ChoiceQuestion q2 = new ChoiceQuestion("Who founded Apple? ");
      q2.addChoice("Bill Gates", false);
      q2.addChoice("Steve Jobs", true);
      
      /*
      System.out.println( q2 );
      System.out.print("Your answer: ");
      response = in.nextLine();
      System.out.println(q2.checkAnswer(response));
       */

      Exam exam = new Exam();
      
      exam.addQuestion(q);
      exam.addQuestion(q2);
      exam.askQuestions(); 
   }
}

