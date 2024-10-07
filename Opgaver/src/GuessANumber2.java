import java.util.Random;
import java.util.Scanner;


public class GuessANumber2 {
    public static void main(String[] args) {


        System.out.println("guess a number from 1-100: ");

        int guessNumber = oneToHundred();

        System.out.println(guessNumber);




    }

    static int oneToHundred(){


        Scanner keyboard = new Scanner(System.in);

        Random gen = new Random();

        int number = gen.nextInt(100)+1;

        int count = 0;

        while (true) {

            int guess = keyboard.nextInt();

            if (guess == number) {

                System.out.println("CORRECT! ");
                System.out.println("tries: " + count);
                break;


            } else if (guess > number) {
                System.out.println("your guess is BIGGER than the number \ntry again!");
            } else if (guess < number) {
                System.out.println("your guess is SMALLER than the number \ntry again!");

            }

            count++;

        }

        return number;













    }
}
