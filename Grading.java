import java.util.Scanner;

class Grading{
  private static double quizzes_Percent, midterm_Percent, final_Percent, total_Percent;
  private static char letter;

  //Set methds
  public void set_Quizzes(double q){
   quizzes_Percent = q;
  }
  public void set_Midterm(double m){
   midterm_Percent = m;
  }
  public void set_Final(double f){
   final_Percent = f;
  }
  public void set_Total(double t){
   total_Percent = t;
  }

  public static double calcQuizzes(double q1, double q2, double q3){
   double total = 0, percent = 0, possibleTotal = 30;
   total = (q1 + q2 + q3)/possibleTotal;
   percent = total * 25;
   return percent;
  }

  public static double calcMidterm(double m){
   double total = 0, percent = 0, possibleTotal = 100;
   total = m / possibleTotal;
   percent = total * 35;
   return percent;
  }

  public static double calcFinal(double f){
   double total = 0, percent = 0, possibleTotal = 100;
   total = f / possibleTotal;
   percent = total * 40;
   return percent;
  }

  public static char grade_Letter(double q, double m, double f){
   char l = ' '; 
   total_Percent = q + m + f;
    if(total_Percent >= 90) l = 'A';
    else if(total_Percent >= 80 && total_Percent < 90) l = 'B';
    else if(total_Percent >= 70 && total_Percent < 80) l = 'C';
    else if(total_Percent >= 60 && total_Percent < 70) l = 'D';
    else l = 'F';
    return l;
  }

  public String toString(){ //Method toString() need to be non-static
   return ("The Student Total grade is '" + letter + "', the Percentage of final score is " +  (int)total_Percent + "%.");
  }

  public static void main(String [] args){
   Scanner input = new Scanner(System.in); 
   double quiz1_Score, quiz2_Score, quiz3_Score, midterm_Score, final_Score; 
   Grading g = new Grading();//Create an object so that can call out toString() method
 
   System.out.print("Enter the Quiz 1 score(1-10): ");
   quiz1_Score = input.nextDouble();
   System.out.print("Enter the Quiz 2 score(1-10): ");   
   quiz2_Score = input.nextDouble();
   System.out.print("Enter the Quiz 3 score(1-10): ");
   quiz3_Score = input.nextDouble();
   quizzes_Percent = calcQuizzes(quiz1_Score, quiz2_Score, quiz3_Score);
   
   System.out.println("The percentage for 3 Quizzes is " + (int)quizzes_Percent + "%");

   System.out.print("Enter the Midterm score(1-100): ");
   midterm_Score = input.nextDouble();
   midterm_Percent = calcMidterm(midterm_Score);
   
   System.out.println("The percentage for Midterm is " + (int)midterm_Percent + "%");

   System.out.print("Enter the Final score(1-100): ");
   final_Score = input.nextDouble();
   final_Percent = calcFinal(final_Score);

   System.out.println("The percentage for Final is " + (int)final_Percent + "%");
    
   letter = grade_Letter(quizzes_Percent, midterm_Percent, final_Percent);//Getting letter grade
   total_Percent = quizzes_Percent + midterm_Percent + final_Percent;//Getting Total percentage

   System.out.println(g.toString());
  }
}
