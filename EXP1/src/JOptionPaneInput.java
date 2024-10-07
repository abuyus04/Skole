import javax.swing.JOptionPane;
import java.util.Scanner;


public class JOptionPaneInput {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


         //String navn = JOptionPane.showInputDialog("indtast navn: ");

        // int alder = Integer.parseInt(JOptionPane.showInputDialog("indtast alder: "));
        // JOptionPane.showMessageDialog(null, "hej "+navn+" du er " + alder + " år gammel!");




        double dkk = 0; // dansk

        int indtast = 0;

        double sek = 0; // svensk
        double nok = 0; // norsk
        double eur = 0; // euro
        double isk = 0; // islandsk


        while (true){



            Double.parseDouble(JOptionPane.showInputDialog("Velkommen til Valuta omregner." +
                    "\nHer kan du veksle fra danske kroner til SE, NOK, EUR, ISK" +
                    "\nindtast beløb i DKK (tast 0 for at afsluttet): "));



            dkk = scanner.nextDouble();
            if (dkk == 0){
                JOptionPane.showMessageDialog(null, "Program lukkes...");
                break;
            }

            Double.parseDouble(JOptionPane.showInputDialog("tast 1 for svensk kroner"+
                    "\ntast 2 for norske kroner"+
                    "\ntast 3 for finske euro"+
                    "\ntast 4 for islandske kroner"));



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
}
