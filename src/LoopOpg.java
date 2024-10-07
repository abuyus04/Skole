import java.util.Scanner;
import java.util.Random;


public class LoopOpg {
    public static void main(String[] args) {


        //nedtælling fra 10-1

        for (int num1 = 10; num1 >= 1; ) {
            System.out.print(num1 + " ");
            num1--;
        }

        System.out.println("");
        System.out.println("");


        //lav et program der udregner 1+2+3+....20


        for (int sum = 1; sum <= 20; sum++) {

            int sum2 = sum * (sum + 1) / 2;
            System.out.println(sum + " : " + sum2);

        }


        System.out.println("");
        System.out.println("");


        //udskriv 2-10 tabellen/ multi tabel


        //start værdi, betingelse, opdatering

        for (int tabel=1; tabel<=10; tabel++){// den her gentager loopet ind i 10 gange

            for (int tabel2=1; tabel2 <=10; tabel2++){
                System.out.print(tabel2*tabel+"\t "); // \t gøt de står lige
                                        // gang den med øverste loop for at lav tabel
                                        // fordi den går igennem og ganger med tabel++
                                        // så den ganger med +1 ligesom den tæller op fra 1-10
            }
            System.out.println();  // den her laver mellemrum mellem loopet undet


        }





        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        // gæt et tal


        Random gen = new Random();
        Scanner scanner = new Scanner(System.in);






        int tal = gen.nextInt(20)+1;
        int forsøg = 10;


        for (int i = 0; i < forsøg; i++) {
            System.out.println("tag et gæt: ");

            int gæt = scanner.nextInt();


            if (tal == gæt) {
                System.out.println("KORREKT!");
                break;
            }
            else
                System.out.println("kom igen! ");

            

        }

        System.out.println("ikke flere forsøg  \""+tal+ "\" var det rigtige tal!");






















        }

}

