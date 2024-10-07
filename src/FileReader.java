import java.io.*;

public class FileReader {
    public static void main(String[] args) throws IOException{ // der SKAl stå det her hvis du ska læse en fil

        FileWriter fil = new FileWriter("src//FindMig.txt");
        PrintWriter ud = new PrintWriter(fil);

        ud.println("her kommer et tal: ");
        ud.println(500);
        ud.println();


        for(int i=0; i<5; i++){

            String navn = "person"+i;
            String køn;
            if (Math.random()>0.5) køn = "m";
            else køn = "k";
            int alder = 10+(int) (Math.random()*60);

            ud.println(navn+" "+køn+" "+alder);

        }
        ud.close();







    }
}
