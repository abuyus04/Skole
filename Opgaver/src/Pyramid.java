public class Pyramid {

    private double side;
    private double height;


    public void pMeasurements(double s, double h){


        if (s>0 && h>0){
            side = s;
            height = h;

        } else{
            System.out.println("Invalid input");
            side = 0.0;
            height = 0.0;
        }

    }

    double pVolume(){

        double vol;
        vol = side*side*height/4;
        return vol;
    }
}


