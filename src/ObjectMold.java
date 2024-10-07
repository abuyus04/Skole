import java.awt.*;

public class ObjectMold {
    public static void main(String[] args) {

        System.out.println();

        String s;
        s = "Ude godt";

        System.out.println("strengen s indeholder: "+s);
        System.out.println();

        int stringLength = s.length(); // længde af stringen
        System.out.println("strengen er "+stringLength+" lang");

        System.out.println("strengen er "+s.length()+" lang"); // du ka skrive det uden en ny variabel
        System.out.println("s med store bogstaver er "+ s.toUpperCase());
        System.out.println("s med små bogstaver er "+ s.toLowerCase());
        System.out.println("Tekst på plads nummer 4 of frem er "+s.substring(4));// fra det 4ere index
        System.out.println("det første g er på plads/index nummer: "+ s.indexOf("g"));
        System.out.println();
        System.out.println();

        String test = "test";
                            //ligesom (x, y) replace x med y
        System.out.println(s.replace(s, test));

        System.out.println("Tekst fra index 0-3: "+s.substring(0 , 3));
        System.out.println();


        String s1;
        s1 = s.replace("godt", "fint");

        System.out.println(s1);
        System.out.println();


        String s2, s3, s4, s5;
        s2 = "Ude godt, men hjemme bedst";
        s2.toUpperCase();

        s3 = s2.toUpperCase();
        s4 = s3.replace("E", "X");
        s5 = s4.substring(4, 16);


        System.out.println("s2: "+s2);
        System.out.println("s3: "+s3);
        System.out.println("s4: "+s4);
        System.out.println("s5: "+s5);


        System.out.println();

        Point p = new Point(0, 0);
        System.out.println(p);

        int x, y, H, W;

        Rectangle rec = new Rectangle(2, 2, 10, 10);
        System.out.println("Rectangle: "+rec);
        System.out.println();


        Object myObject = new Object();

        myObject = "ObjectX";


        System.out.println(myObject.toString());// viser default label på objektet som java bruger før du selv
        //uddeler et navn til den så i starten er en string tilfædlig tal indtil du giver den en værdi
        // som her er objectX så det giv fra object4y3285""tilfældig ting" til objectX




    }
}
