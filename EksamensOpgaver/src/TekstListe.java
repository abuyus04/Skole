import java.util.ArrayList;

public class TekstListe {

        public static void main(String[] args) {


            Tekst tekst = new Tekst();
            tekst.tilfoej("hey");
            tekst.tilfoej("hey du");
            tekst.tilfoej("hey der");
            tekst.tilfoej("hey hey");
            tekst.tilfoej("hey brother");

            tekst.findAntalUnikke();

        }
    }
    class Tekst{

        ArrayList<String> tekstLinjer = new ArrayList<>();

        void tilfoej(String tekst){

            tekstLinjer.add(tekst);

        }
        void findAntalUnikke(){

            for (String tekst : tekstLinjer){
                System.out.println(tekst);
            }
        }


}
