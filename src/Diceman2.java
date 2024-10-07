import javax.swing.JOptionPane;
import java.util.Random;

public class Diceman2 {
    public static void main(String[] args) {

        Random gen=new Random();
        int tal = gen.nextInt(6)+1;
        String activity="";


        switch (tal) {
            case 1:
                activity = "breakfast";
                break;
            case 2:
                activity = "study";
                break;
            case 3:
                activity = "fishing";
                break;
            case 4:
                activity = "call mom";
                break;
            case 5:
                activity = "swim";
                break;
            case 6:
                activity = "bed";
                break;
        }
        JOptionPane.showMessageDialog(null, activity); // den gør der popper en besked op











    }
}
