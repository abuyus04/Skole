public class variables {
    public static void main(String[]arg ){

        //alt det til højre hedder en data type
        int x = 123;
        long y = 54823948923084L; //der skal stå "L"
        //du kan bruge byte men det kun op til 127
        double z = 3.14; //du kan ogs bruge "float" men så skriv "f" til sidst
        boolean a = false; // kan kun sige true eller false
        char symbol = '@'; // kan kun skrive en character ned
        String name = "abuyus";

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
        System.out.println(symbol);
        System.out.println("hej mit navn er "+name);

        System.out.println(" ");
        System.out.println(" ");



        String b = "water";
        String c = "kool-aid";
        String temp;

        temp =b; // det starter med temp er tom og så fylder du med vand
        b = c; // så tager du vandet og fylder det i "c" så nu temp tom
        c = temp; // så nu siger du at c og temp er det samme så både c og temp har vand
        // fordi der står længere op at temp er = b som har vand

        System.out.println("b: "+b);
        System.out.println("c: "+c);


        System.out.println();
        System.out.println();
        System.out.println();


        int x1;
        double y1;

        y1 = 3.6;
        x1 = (int) y1;

        System.out.println(x1);


        System.out.println();

        String s = "ude godt";

        int stringLængde;

        stringLængde = s.length();// fortæller hvor lang din string er
        System.out.println(stringLængde);
        System.out.println(s.toUpperCase()); // gør stringen til stor
        System.out.println(s.toLowerCase()); // gøt den til lille
        System.out.println(s.indexOf("o"));







    }
}
