public class Boks2 {


    private double length;
    private double height;
    private double width;

    public void measurements (double lHW, double w, double h){


        /*
        den her if statement sørger for du indtaster gyldige dimensioner
        til boksen altså de skal allesammen være positive tal
        en boks kan ikke have negativ højde bredde osv
         */
        if (lHW>0 && w>0 && h>0){

            length = lHW;
            width = w;
            height = h;

        }else{
/*
her fortæller den at hvis du skriver ugyldigt tal alt ligemed eller
under 0 så får du det der print tilbage.
 */
            System.out.println("Ugyldige mål. Bruger standartmål.");
            length = 10.0;
            height = 10.0;
            width = 10.0;
            //skriv det her så det ik printer den tidligere måling ud
        }
    }

    public double volume(){
        // den her måler bare boksens volume

        double vol;
        vol = length*width*height;
        return vol;
    }
}
