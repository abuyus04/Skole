import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {

        //to dice i en kop
        // lav en userinpur "r" der gir spilleren lov til at rulle
        //lav en memory der husker hver spillers point
        //play.Play

        //Cup cup = new Cup();
        //cup.cupRoll();
        //lav så de tidligere cup rolls bliver sat sammen med en ny vairabel
        Player player = new Player("Mohammed");
        player.turn();





    }
}

class OneHundred{

}
class Player{

    String name;
    int points;

    Player(String name){
        this.name = name;
    }

    void turn(){

        Cup cup = new Cup();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("press \"1\" to roll the dice");
        //String roll = keyboard.nextLine();

        //add previous cup rolls

        int cupResult1 = cup.cupRoll();

        int cupSammensat1 = cupResult1;
        int cupSammensat2;

        int roll = keyboard.nextInt();

        while(true) {

            roll = keyboard.nextInt();

            if (roll == 1) {
                for(int i = 0; i<=100; cupSammensat1++){
                    roll = keyboard.nextInt();
                    System.out.println(cupSammensat1);
                    i++;

                }

            }

        }


    }


}
class Cup{

    int result1;
    int result2;

    int cupRoll(){

        Dice cup = new Dice();

        int dice1;
        int dice2;
        dice1 = cup.diceRoll();
        dice2 = cup.diceRoll();

        result1 = dice1+dice2;
        result2 = dice1+dice2;

        return result1;

    }

}
class Dice{

    int diceRoll(){

        Random gen = new Random();
        int result;
        result = gen.nextInt(6)+1;

        return result;
    }

}
