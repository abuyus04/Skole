public class invitation {
    public static void main(String[] args) {


        inv("Emil");
        inv("Jamal");
        inv("Abdo");

        System.out.println();

        sum(1,2,3);
        //man kan gøre sårn eller
        System.out.println(sum(1,2,3));

        int ialt;
        ialt = sum(4,5,6);
        // eller sårn så behøver man ik skrive manuelt i ( )
        System.out.println(ialt);

        // eller sårn
        int a=6;
        int b=8;
        int c=4;

        ialt = sum(a,b,c);
        System.out.println(ialt);


                // her blir 4,5 til a og 11 er b værdien så (7,11) i princippet
        int maxTal=max(max(4,5),11);

        System.out.println("max="+maxTal);


    }
// hvis du ik gir den en specifik værdi tror jeg ik du behøver skrive det over MÅSKE
    static void inv(String navn){ // hvis der står void skal der ikke stå return;


        System.out.println("Kære " +navn);
        System.out.println("Vil du komme til min fødselsdag");
        System.out.println("Fredag 13/9-2024");
        System.out.println("Kærlig hilsen Abuyus");
        System.out.println();


    }
    // den SKAL returnere den data type metoden er, her er den int
    static int sum(int x, int y, int z){ // her skal der stå return; fordi det ikke er void


        int resultat= x+y+z;
        return resultat;

    }

    static int max(int a, int b){

        if (a>b)
            return a;
        else
            return b;

    }
}
