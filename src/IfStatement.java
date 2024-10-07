import java.util.Random;

public class IfStatement {
    public static void main(String[] args) {


        Random gen=new Random(); //
        int tal= gen.nextInt(2); // 2 fordi 2 gælder ik med så det 0-1
        System.out.println(tal); // siger hvad tallet er om det krone eller plat



        if(tal==0) {
            System.out.println("Plat"); // de der { gør jeg ka skrive mere i blokken
            System.out.println("Tillykke");// så du skal bruge dem hvis du vil skrive mere
        }
        else {
            System.out.println("Krone");
            System.out.println("Desværre");
        }


        int alder = 18;

        if (alder >=18)
            System.out.println("du er myndig!");


        }

    }
