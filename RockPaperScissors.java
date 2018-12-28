//
// Rock Paper Scissor
//
// Alexander Dent
//
// 11/13/18
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors
{
public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    
   
    
    
    int UserWins = 0;
    int CompWins = 0;
    int Ties = 0;
    
    System.out.println("Enter Q to quit the game ");
     
     

    while (true) {
      
        System.out.println("Enter your choice (R, P, S):");
        
        String choice = input.nextLine();
        // user terminates game and program prints number of wins, losses and ties.
        if (choice.equals("Q")) {
            
            System.out.println("Game Over");
            
            System.out.print("User won " + UserWins + " games,");
            System.out.print("Computer won " + CompWins + " games,");
            System.out.println("ties " + Ties );
            break;
         
            }

        
        else {
            
            
           
     
            // random number generator producing integer values between 0 to 2 for computer's choices.
            // 0 is for Rock, 1 is for Paper and 2 is for Scissors.
            int num = (int)(Math.random() *  (2-0) + 1);
            
            switch (num) {

                // Computer picks Rock
                case 1:
                    if (choice.equals("R")) {
                    System.out.println("Computer picks R ");
                     System.out.println("Tie");
                    Ties++;
                } else if (choice.equals("P")) {
                    System.out.println("Computer picks R ");
                    System.out.println("User Wins!");  
                    UserWins++;
                } else if (choice.equals("S")) {
                    System.out.println("Computer picks R");
                    System.out.println("Computer Wins! ");
                    CompWins++;
                } else {
                    System.out.println("Choice must be R, P, or S ");
                }
                break;
                case 2:
                    // computer picks Paper
                    if (choice.equals("R")) {
                    System.out.println("Computer picks P");
                    System.out.println("Computer Wins! ");
                    CompWins++;
                } else if (choice.equals("P")) {
                    System.out.println("Computer picks P ");
                    System.out.println("Tie ");
                    Ties++;
                } else if (choice.equals("S")) {
                    System.out.println("Computer picks P ");
                    System.out.println("User Wins! ");
                    UserWins++;
                } else {
                    System.out.println("Choice must be R, P, or S ");
                }
                break;
                case 3:
                    // computer picks Scissors
                    if (choice.equals("R")) {
                    System.out.println("Computer picks S ");
                    System.out.println("User Wins! ");
                    UserWins++;
                } else if (choice.equals("P")) {
                    System.out.println("Computer picks S ");
                    System.out.println("Computer Wins! ");
                    CompWins++;
                } else if (choice.equals("S")) {
                    System.out.println("Computer picks S ");
                    System.out.println("Tie ");
                    Ties++;
                } else {
                    System.out.println("Choice must be R, P, or S ");
                }
                break;

                
            } 
        }
    }
}
}