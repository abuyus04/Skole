import java.util.InputMismatchException;
import java.util.Scanner;




public class ValutaMenu {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {




        double dkk = 0; // dansk

        int indtast = 0;

        double sek = 0; // svensk
        double nok = 0; // norsk
        double eur = 0; // euro
        double isk = 0; // islandsk


        while (true){

            System.out.println();

            System.out.println("Velkommen til Valuta omregner.");
            System.out.println("Her kan du veksle fra danske kroner til SEK, NOK, EUR, ISK");

            System.out.println("indtast beløb i DKK (tast 0 for at afsluttet): ");

            dkk = keyboard.nextDouble();

            //dkk=readDouble();


            if (dkk == 0){
                System.out.println("Program lukkes");
                break;
            }

            System.out.println("tast 1 for svensk kroner");
            System.out.println("tast 2 for norske kroner");
            System.out.println("tast 3 for finske euro");
            System.out.println("tast 4 for islandske kroner");

            indtast = keyboard.nextInt();

            switch (indtast){

                case 1:
                    System.out.println("Til udebtaling: "+dkk*1.53+" SEK");
                    break;

                case 2:
                    System.out.println("Til udebtaling: "+dkk*1.60+" NOK");
                    break;

                case 3:
                    System.out.println("Til udebtaling: "+dkk*0.13+" EUR");
                    break;

                case 4:
                    System.out.println("Til udebtaling: "+dkk*20.41+" ISK");
                    break;


            }
        }



    }

    static double readDouble(){


        double n = 0;
        boolean ok = false;

        while (!ok);{

            try {

                n = keyboard.nextDouble();
                System.out.println("indtast beløb i DKK (tast 0 for at afsluttet):");
                ok = true;


            }
            catch (java.util.InputMismatchException e) {


                System.out.println("Ugyldigt input");
                n = keyboard.nextDouble();


            }

        }

        return n;



    }
}
