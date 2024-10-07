import java.util.ArrayList;

public class Arraylisten {
    public static void main(String[] args) {



       ArrayList<String> liste;
       liste = new ArrayList<String>();

       liste.add("hey");
       liste.add(0, "there");
       liste.add("Abuyus");
        //vi indsætte "there" i index tal nummer 0
        System.out.println(liste);


        String item = liste.get(1);
        System.out.println(item); // den tager hey fordi jeg har sat there i plads nummer 0

        liste.remove(1); // her er index heller ik hver bogstav men hver objekt der bliver sat ind

        System.out.println(liste);




    }
}
