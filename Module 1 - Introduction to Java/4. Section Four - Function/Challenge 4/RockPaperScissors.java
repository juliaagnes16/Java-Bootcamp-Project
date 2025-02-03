import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");

        String userChoice = scan.nextLine();

        if (userChoice.equals("yes")) {
            System.out.println("Great!");
            System.out.println("\nRock - Paper - Scissors, shoot!");
            String yourChoice = scan.nextLine();
            String computerChoice = computerChoice();
            printResult(yourChoice, computerChoice, result(yourChoice, computerChoice));
        } else {
            System.out.println("Darn, some other time...!");
        }

        scan.close();
    }

    public static String computerChoice() {
        double randomNum = (int) (Math.random() * 2 + 1);
        String choice = "";

        if (randomNum == 0) {
            choice = "rock";
        } else if (randomNum == 1) {
            choice = "paper";
        } else if (randomNum == 2) {
            choice = "scissors";
        }
        return choice;
    }

    public static String result(String yourChoice, String computerChoice) {
        String result = "";
        if ((yourChoice.equals("rock") && computerChoice.equals("scissors"))
                || (yourChoice.equals("paper") && computerChoice.equals("rock")
                || (yourChoice.equals("scissors") && computerChoice.equals("paper")))) {
            result = "You Win!";
        } else if ((yourChoice.equals("rock") && computerChoice.equals("paper"))
                || (yourChoice.equals("paper") && computerChoice.equals("scissors"))
                || (yourChoice.equals("scissors") && computerChoice.equals("rock"))) {
            result = "You lose";
        } else if ((yourChoice.equals("rock") && computerChoice.equals("rock"))
                || (yourChoice.equals("paper") && computerChoice.equals("paper"))
                || (yourChoice.equals("scissors") && computerChoice.equals("scissors"))) {
            result = "It's a tie";
        } else {
            result = "INVALID CHOICE";
        }

        return result;
    }

    public static void printResult(String yourChoice, String computerChoice, String result) {
        System.out.println("\nYou chose: " + yourChoice);
        System.out.println("The computer chose: " + computerChoice);
        System.out.println(result);
    }

}
