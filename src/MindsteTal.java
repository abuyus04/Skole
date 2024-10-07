import java.util.Random;


public class MindsteTal {
    public static void main(String[] args) {


        Random gen = new Random();

        int tal1 = gen.nextInt(100)+1;
        int tal2 = gen.nextInt(100)+1;
        int tal3 = gen.nextInt(100)+1;


        System.out.println(tal1+" "+tal2+" "+tal3);

        if (tal1<tal2 && tal1<tal3) {

            System.out.println("mindste tal: " + tal1);
        }else if (tal2<tal1 && tal2<tal3) {

            System.out.println("mindste tal: " + tal2);
        }else if (tal3<tal1 && tal3<tal2) {
            System.out.println("mindste tal: " + tal3);
        }


        if (tal1>tal2 && tal1>tal3) {

            System.out.println("største tal: " + tal1);
        }else if (tal2>tal1 && tal2>tal3) {

            System.out.println("største tal: " + tal2);
        }else if (tal3>tal1 && tal3>tal2) {
            System.out.println("største tal: " + tal3);
        }



    }
}
