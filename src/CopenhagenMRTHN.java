import java.util.Random;

public class CopenhagenMRTHN {

 // den du kalder er startnumber (og det her er det du skriver i den)
    public static int startNumber(String number){

        Random gen = new Random();



        int nmbr;
        nmbr = gen.nextInt(2000)+1;
        System.out.println(number);

        return nmbr;


    }

    public static String group(String x){


        Random gen2 = new Random();
        int groupNumber = gen2.nextInt(4)+1;
        String groupName = "";

        if (groupNumber == 1){
            groupName="A";

        } else if (groupNumber == 2) {
            groupName="B";


        } else if (groupNumber==3) {
            groupName="C";


        } else if (groupNumber==4) {
            groupName="D";

        }


        return groupName; // hvis return er et nummer så skal public static int
                            // hvis det string så public static string
    }



    public static void main(String[] args) {


        System.out.println();
        System.out.print("Dear Peter Adams !\nWe are happy to recieve your Registration.");
        System.out.println("Your start number is: "+startNumber(""));
        System.out.println("You start in start group: "+group(""));
        System.out.println("Please check in 10 minutes before start.");

        System.out.println();
        System.out.println();

        System.out.print("Dear Omar Farooq !\nWe are happy to recieve your Registration.");
        System.out.println("Your start number is: "+startNumber(""));
        System.out.println("You start in start group: "+group(""));
        System.out.println("Please check in 10 minutes before start.");

        System.out.println();
        System.out.println();

        System.out.print("Dear Lotte Nybo !\nWe are happy to recieve your Registration.");
        System.out.println("Your start number is: "+startNumber(""));
        System.out.println("You start in start group: "+group(""));
        System.out.println("Please check in 10 minutes before start.");

        System.out.println();




    }
}
