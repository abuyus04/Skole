public class BenytBoks {
    public static void main(String[] args) {
// her benytter du den klasse som du har oprettet tidligere
        double rumfang;

        Boks boksobjekt;
        boksobjekt = new Boks();


        boksobjekt.længde = 2.0;
        boksobjekt.højde = 2.5;
        boksobjekt.bredde = 1.5;

        rumfang = boksobjekt.volumen();
        System.out.println("boksens volume: "+rumfang);


        Boks boks1, boks2;

        boks1 = new Boks();
        boks2 = new Boks();

        boks1.længde = 2.0;
        boks1.højde = 5.0;
        boks1.bredde = 3.0;

        boks2.længde = 4.0;
        boks2.højde = 5.0;
        boks2.bredde =1.0;

        double v1, v2;

        v1 = boks1.volumen();
        v2 = boks2.volumen();

        System.out.println("begge bokses volume til sammen er: "+(v1+v2));



    }
}
