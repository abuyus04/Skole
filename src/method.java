public class method {

    // den her method skal stå over public main
    public static void hils (String navn){

        System.out.println("hej med dig "+navn);


    }

    public static int gangMedTi (int tal){


        int resultat;
        resultat = tal*10;
        return resultat;

    }

    public static double divider (double taeller, double naevner){

        return taeller/naevner;
    }


    public static boolean erPrimtal(int talDerSkalUndersoeges){

        int faktor = 2;

        while (talDerSkalUndersoeges % faktor > 0) faktor++;

        if (faktor < talDerSkalUndersoeges){

            System.out.println(talDerSkalUndersoeges + " har faktoren "+faktor);
            return false;
        } else {
            System.out.println(talDerSkalUndersoeges + " er et primtal");
            return true;
        }



    }


    public static void main(String[] args) {


        hils("bo");

        System.out.println();
        System.out.println();


        for (int x=1; x<=5; x++){

            int tidobbelt = gangMedTi(x); // fordi den ganger med 10 i metoden
            System.out.print("det 10x af x er :" +tidobbelt);// du skriver 10 dobbel for du har givet den
                                                 // samme værdi som metoden
            double tredjedel = divider(tidobbelt, 3);// fordi (double taeller, double naevner) ovenpå
            System.out.println("og tredjedel af x er : "+tredjedel);


        }

        System.out.println();
        System.out.println();
        System.out.println();


        int antalPrimtal = 0;

        int tal;

        for (tal=10; tal<20; tal++){

            boolean erPrim = erPrimtal(tal);
            if (erPrim) antalPrimtal = antalPrimtal+1;

        }

        System.out.println("antal primtal: "+antalPrimtal);










    }
}
