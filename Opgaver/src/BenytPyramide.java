public class BenytPyramide {
    public static void main(String[] args) {



        Pyramid pyra = new Pyramid();

        pyra.pMeasurements(2.0, 4.0);
        System.out.println("Pyramidens volume er: "+pyra.pVolume());


        pyra.pMeasurements(5.0, 4.0);
        System.out.println("Pyramidens volume er: "+pyra.pVolume());

        pyra.pMeasurements(10.0, 2);
        System.out.println("Pyramidens volume er: "+pyra.pVolume());



    }
}
