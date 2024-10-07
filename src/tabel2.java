import java.awt.print.Printable;

public class tabel2 {
    public static void main(String[] args) {


        for (int tabel = 1; tabel <= 10; tabel++) {

            PrintTabel(tabel);
        }
    }



        // et styk kode du kan kalde her op over

        static void PrintTabel(int n){ // variabel n fordi den ikke har variabel "tabel" så det
                                        // det er også det indre loop så der ik behov for det ska vide
                                        // kun det ydre der skal have informationer
            for (int tabel2 = 1; tabel2 <= 10; tabel2++) {
                System.out.print(n * tabel2 + "\t ");
            }
            System.out.println();
            // for hvergang den hart udførst 1-10 så laver den den nye linje




    }


}
