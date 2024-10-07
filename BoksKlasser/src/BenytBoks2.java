public class BenytBoks2 {
    public static void main(String[] args) {


        Boks2 enBoks;
        enBoks = new Boks2();

        enBoks.measurements(2, 3, 5);
        System.out.println("volumen er: " + enBoks.volume());

        enBoks.measurements(0.5, 0.5, 0.5);
        System.out.println("volumen er: " + enBoks.volume());

        enBoks.measurements(10.0, 0.0, 2.5);
        System.out.println("volumen er: " + enBoks.volume());


    }
}
