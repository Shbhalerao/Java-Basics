
import java.util.Scanner;

public class RockPaperScissors {
    public static void main (String[] args){
          Scanner input = new Scanner(System.in);
        System.out.println("Does player one choose Rock Paper or Scissors?");
          String playerOne = input.next();
        System.out.println("Does player two choose Rock Paper or Scissors?");
          String playerTwo = input.next();
          //Condition-1
          if(playerOne.equalsIgnoreCase("rock")) {
              if (playerTwo.equalsIgnoreCase("scissors")) {
                  System.out.println("Player 1 wins!!");


              } else if (playerTwo.equalsIgnoreCase("paper")) {
                  System.out.println("Player 2 wins!!");
              } else {
                  System.out.println("It's a tie!!");
              }
          }
          //Condition-2
             else if (playerOne.equalsIgnoreCase("Paper")) {
              if (playerTwo.equalsIgnoreCase("Rock")) {
                  System.out.println("Player 1 wins!!");

              } else if (playerTwo.equalsIgnoreCase("Scissors")) {
                  System.out.println("Player 2 wins!!");
              } else {
                  System.out.println("It's a tie!!");
              }
          }

          //Condition-3
        else if (playerOne.equalsIgnoreCase("Scissors")){
            if (playerTwo.equalsIgnoreCase("Paper")){
                System.out.println("Player 1 wins!!");
            }
        }
        else if (playerTwo.equalsIgnoreCase("Rock")){
            System.out.println("Player 2 wins!!");
        }
        else {
            System.out.println("It's a tie!!");
        }
    }

}
