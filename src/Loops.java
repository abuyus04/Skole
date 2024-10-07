public class Loops {
    public static void main(String[] args) {


        int alder;
        alder = 16;

        while (alder < 18){
            System.out.println("du er "+alder+" år. vent til du er blevet ældre.");
            alder = alder + 1;
            System.out.println("tillykke du er fyldt "+alder);
        }
        // du skal slutte loop med den her under ellers tilføjer den bare alder uden at
        // print så den siger plus 1 indtil du er fyldt 18 og så printer det
        System.out.println("nu er du "+alder+" år");

        System.out.println("");
        System.out.println("");


        int n;
        n = 0;


        while (n <= 10) {
            System.out.println("kvadratroden af " + n + " er "+Math.sqrt(n));
            n = n + 1;
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");



        int m;
        m = 1;

        while (m <= 10) {// du skriver til 10 for så fortsætter den til 7*10 altså 70 så tabllen færdig
            System.out.println(m + " : " + 7 * m);
            m = m + 1;// det her gør at m blir + med 1 så 7 tabllen fortsltter 2*7 3*7 osv...
        }


        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");


        // for loop looper en finite nummer af gange og ikke uendelig
        // først index og så så længe det er 10 eller under og så det der plus er så den stiger med en hvergang
        for (int i = 0; i<=10; i ++) {
            System.out.println(i);

        }
        System.out.println("happy birthday");
        // for at gå ud af loopet ska du skriver noget uden for


        for (int i2 =10; i2>=0;) {
            System.out.println(i2);
            i2 -= 2; // du ka ogs skrive det her

        }


        System.out.println("nice");


        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");



       for (int num1 = 1; num1 <= 10; num1 ++) {

           if (num1 == 6)
               System.out.println("nu blir det svært");
           if (num1 < 8)
               System.out.println(num1 + " : " + num1 * 7);
           else
               System.out.println("ved ikke");
       }


           System.out.println("");
           System.out.println("");
           System.out.println("");
           System.out.println("");




           for (int num2=1; num2<=10; num2=num2+1){// 1 talet sætter 1 mere på num2 i loopet

               int sum = 0;
               for (int j=0; j<num2; j++){// altid { efter loop sætning
                   sum = sum + 7;
                   System.out.print(sum+".");// lig mærke til der står print og ik println så du ungår linje skift

               }
               System.out.println(" syg gange "+num2+" giver: "+sum);
           }


        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");

















    }
}
