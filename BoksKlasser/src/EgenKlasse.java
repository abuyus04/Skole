public class EgenKlasse {
    public static void main(String[] args) {


        Triangle trekant = new Triangle();

        trekant.tMeasurements(2, 4);
        System.out.println(trekant);

    }
}

    class Triangle{ // den her "{" skal encapsule HELE metoden

        double base;
        double height;

    public void tMeasurements(double b, double h){

        if (b>0 && h>0){


            base = b;
            height = h;

        }else {

            System.out.println("invalid numbers");
            base = 0.0;
            height = 0.0;

        }

    }

    double Areal(){

        double a;
        a = base*height/0.5;
        return a;

    }

    public String toString(){

        return "trekantens areal er: "+Areal();

    }
}
