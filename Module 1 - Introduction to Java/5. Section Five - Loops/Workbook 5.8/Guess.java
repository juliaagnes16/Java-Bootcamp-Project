import java.util.Scanner;

public class Guess  {
    public static void main(String[] args) {

       System.out.print("I chose a number between 1 and 5. Try to guess it: ");
        
       Scanner scan = new Scanner(System.in);
       int secretNumber = 4;
       int guessNumber = scan.nextInt();
       
       while (guessNumber != secretNumber) {
        System.out.print("Guess again: ");
        guessNumber = scan.nextInt();
       }

       System.out.println("You got it!");
        
        scan.close();
    }

}
