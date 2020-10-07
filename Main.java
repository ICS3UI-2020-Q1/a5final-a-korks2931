import java.util.Scanner;
/**
 *This program will print out "black","white" the number of times the user entered.
 * @author Sevde
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input 
    Scanner input = new Scanner(System.in);
    // ask the user for the length of the line 
    System.out.println("Please enter the length of the line:");
    // prompt the user for the length
    int userLength = input.nextInt();
    // make a for loop 
    for(int count = 1; userLength > count; count = count + 1 ){ 
       // create a variable that will show if the count is odd or even 
       int evenNumber = count % 2;
       // make an if statement to print black at the start
       if( count == 1){
         System.out.print("black,");
       }
       // make an if statement to print black if the count is even
      if (evenNumber == 0 ){
      System.out.print("black");
      // make an else statement for odd numbers to print out white 
      }else {
      System.out.print("white");
      }
      // make an if statement to print out a comma next to the count
      if(count < userLength){
        // print out the comma 
      System.out.print(",");
      }
      

    }
  }
}


    
  


