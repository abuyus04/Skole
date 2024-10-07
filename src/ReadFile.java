import java.io.*;
import java.io.FileReader;

public class ReadFile {
    public static void main(String[] args) throws IOException {

        // Fil --> FileReader --> BufferedReader
        // FileReader er langsoms og tager et stykke data af gangen
        // derfor  ligger man det ind i buffered reader som tager store bider af data
        // og gøre at progammet læser filen hurtigere

        FileReader file = new FileReader("Poem.txt");
        BufferedReader ind = new BufferedReader(file);


        String linje;

        linje = ind.readLine(); // readline læser linje efter linje når den så er færdig-
        // har den en værdi af "null" som også betyder færdig med læse


        while (linje != null) {

            System.out.println(linje);
            linje = ind.readLine();
            // den looper igennem hver linje indtil den sidst og der bliver ReadLine = null og stopper loopet

        }





    }
}
