import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int totalGames = 0;
        int playerWins = 0;
        int computerWins = 0;
        int draws = 0;
        while (true) {
            String[] rsp = {"r", "p", "s"};

            String computerMove = rsp[random.nextInt(rsp.length)];

            String playerMove;

            while (true) {
                System.out.println("Please enter your move (r, p, or s)");
                playerMove = scanner.nextLine();

                if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
                    break;
                }
                System.out.println(playerMove + "is not a valid move!");
            }
            System.out.println("You played "+ playerMove);

            System.out.println("Computer played " + computerMove);



             if (playerMove.equals("r")) {
                if (computerMove.equals("p")) {
                    computerWins++;
                    System.out.println("You lose!");
                } else if (computerMove.equals("s")) {
                    playerWins++;
                    System.out.println("You win!");
                }
            } else if (playerMove.equals("p")) {
                if (computerMove.equals("r")) {
                    playerWins++;
                    System.out.println("You win!");
                } else if (computerMove.equals("s")) {
                    computerWins++;
                    System.out.println("You lose!");
                }
            } else if (playerMove.equals("s")) {
                if (computerMove.equals("p")) {
                    playerWins++;
                    System.out.println("You win!");
                } else if (computerMove.equals("r")) {
                    computerWins++;
                    System.out.println("You lose!");
                }
            }else if (playerMove.equals(computerMove)) {
                 draws++;
                 System.out.println("It is a draw!");

            totalGames++;
            System.out.println("Do you want to play again? (y/n)");
            String playAgain = scanner.nextLine();
            if (!playAgain.equals("y")) {
                break;
            }

        }
        System.out.println("Total games played : " + totalGames);
        System.out.println("Draws : " + draws);
        System.out.println("Player wins : " + playerWins);
        System.out.println("Computer wins : " + computerWins);
    }
}
