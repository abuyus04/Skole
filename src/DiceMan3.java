import java.util.Random;
import java.util.Scanner;


public class DiceMan3 {
    public static void main(String[] args) {



        Random gen=new Random();
        String actvity=" ";

        int tal=0;
        boolean keepGoing = true;
        Scanner keyboard=new Scanner(System.in);



        while (keepGoing) {
            tal = gen.nextInt(6) + 1; // ik stå int betyder der ikke kommer nogen ny variabel

            if (tal == 0) {
                actvity = "Breakfast";
                } else if (tal == 1) {
                    actvity = "Study";
                } else if (tal == 2) {
                    actvity = "Swim";
                } else if (tal == 3) {
                    actvity = "Fishing";
                } else if (tal == 4) {
                    actvity = "Call mom";
                } else if (tal == 5) {
                    actvity = "Bed";
                }
            System.out.println(actvity);
            //if (tal==6) keepGoing = false;
            System.out.println("Vil du stoppe? (y/n)");
            String ans= keyboard.next();

            if (ans.equals("y")) keepGoing=false;


            }
        System.out.println("bye bye");






    }
}
