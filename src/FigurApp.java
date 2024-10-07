import javax.lang.model.type.ArrayType;
import java.util.ArrayList;


public class FigurApp {
    public static void main(String[] args) {


        //Figur f= new Figur(); // det virker ikke når det abstract

//        Figur c = new Cirkel(2);
//        Figur c2 = new Cirkel(3);
//        System.out.println(c);
//        System.out.println(c2);


        ArrayList<Figur> list = new ArrayList<>();
        list.add(new Rektangel(3, 7));
        list.add(new Punkt());
        list.add(new Cirkel(3));
        list.add(new Cirkel(7));
        list.add(new Linje(5));



        for (Figur f:list){
            System.out.println(f);
            System.out.println("\t areal = "+f.beregnAreal()+"\n\t omkreds = "+f.beregnOmkreds());
        }


    }
}

abstract class Figur{
    abstract double beregnAreal();
    abstract double beregnOmkreds();
}

class Punkt extends Figur{
    double beregnAreal(){
        return 0;
    }

    double beregnOmkreds(){
        return 0;
    }
    public String toString(){
        return "punkt";
    }
}

class Linje extends Figur{

    double length;

    Linje (double l){
        length = l;
    }

    double beregnAreal(){
        return 0;
    }
    double beregnOmkreds(){
        return 2*length;
    }

    public String toString(){
        return "Linje længde = "+length;
    }

}

class Cirkel extends Figur{

    double radius;

    Cirkel(double radius){

        this.radius = radius;
    }

    double beregnAreal(){
        return Math.PI*radius*radius;
    }
    double beregnOmkreds(){
        return 2*Math.PI*radius;
    }
    public String toString(){
        return "Cirkel r="+radius;
    }
}

class Rektangel extends Figur{

    double h;
    double b;

    Rektangel(double h, double b){
        this.h = h;
        this.b = b;
    }
    double beregnAreal(){
        return h*b;
    }
    double beregnOmkreds(){
        return 2*(h+b);
    }

    public String toString(){
        return "Rektangel ("+h+","+b+")";
    }
}