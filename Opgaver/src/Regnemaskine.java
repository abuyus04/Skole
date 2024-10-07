import java.util.InputMismatchException;
import java.util.Scanner;

public class Regnemaskine {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {




        double tal1=0;
        double tal2=0;
        char op;
        double res;
        boolean keepGoing = true;
        // while (keepGoing)

        while (true){

            System.out.println("Velkommen til regnemaskinen");
            System.out.println("  + for addition");
            System.out.println("  - for subtraktion");
            System.out.println("  * for multiplikation");
            System.out.println("  / for division");
            System.out.println("  q i operator for quit");

            tal1=readDouble();
            tal2=readDouble();

            System.out.println("Indtast tal: ");
            tal1 = keyboard.nextDouble();

            System.out.println("Indtast operator: ");
            op = keyboard.next().charAt(0); // sådan du inuptter char

            if (op == 'q') break;



            System.out.println("Indtast tal: ");
            tal2 = keyboard.nextDouble();



            System.out.println("Resultat: ");

            switch (op){
                case '+':
                    res = tal1+tal2; break;
                case '-':
                    res = tal1-tal2; break;
                case '*':
                    res = tal1*tal2; break;
                case '/':
                    res = tal1/tal2; break;

                default:
                    System.out.println("Ugyldig operator");
                    continue; // den starter loopet om igen


            }

            System.out.println("Resultat: "+res);

        }





    }

    static double readDouble(){


        double n = 0;
        boolean ok = false;


        while (!ok) {
            try {
                System.out.println("Indtast tal: ");
                n = keyboard.nextDouble();
                ok=true;

            }
            catch (InputMismatchException e) {

                System.out.println("Ulovligt input. Prøv igen");
                n = keyboard.nextDouble();

            }
        }


        return n;

    }


}
