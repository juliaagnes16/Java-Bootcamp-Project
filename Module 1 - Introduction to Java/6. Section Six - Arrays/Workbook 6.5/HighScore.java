public class HighScore {
    public static void main(String[] args) {
        int[] number = {randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber()};

        int highScore = 0;

        System.out.print("Here are the scores: ");
        for(int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
            if (number[i] > highScore ) {
                highScore = number[i];
            }
        }

        System.out.println("\n\nThe highest score is: " + highScore + ". Give that man a cookie!");
    }    

    public static int randomNumber() {
        double random = Math.random() * 50000;
        return (int) random;
    }
}
