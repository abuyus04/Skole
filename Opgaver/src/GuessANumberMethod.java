import java.util.Random;
import java.util.Scanner;

public class GuessANumberMethod {
    public static void main(String[] args) {

        System.out.println("Gæt et tal fra 1-100:");

        int guess = etTilHundrede();

        System.out.println(guess);






    } // du behøver ik skrive noget ind her
    static int etTilHundrede(){

        Scanner keyboard = new Scanner(System.in);
        Random gen = new Random();

        String resultat;

        int tal = gen.nextInt(100)+1;
        int forsøg = 0;


        while(true) {
        // hvis jeg ligger scanner ind i loop gør den det ikke uendeligt
            int gæt = keyboard.nextInt();
            forsøg++;
        if (gæt==tal){

            System.out.println("KORREKT");
            System.out.println("total antal gæt: "+forsøg);
            break;

        } else if (gæt<tal) {

            System.out.println("Dit tal er for lille");

        } else if (gæt>tal) {

            System.out.println("dit tal er for stort");

        }


        }

        return tal;













    }



}
