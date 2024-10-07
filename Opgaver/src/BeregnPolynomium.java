public class BeregnPolynomium {
    public static void main(String[] args) {


        FoesteGradsPolynomium førsteGrad = new FoesteGradsPolynomium(8, 7, 9);

        AndenGradsPolynomium andengrad = new AndenGradsPolynomium(2, 4, 2, 3);


    }
}


class FoesteGradsPolynomium{

    double a;
    double b;
    double x;

    FoesteGradsPolynomium(double pX, double pA, double pB){

        a = pA;
        b = pB;
        x = pX;

        double result = pA*pX+pB;
        System.out.println("f("+pX+") = "+pA+" * "+pX+" + "+pB+" = "+result);
        System.out.println();
    }

}

class AndenGradsPolynomium{

    double a;
    double b;
    double c;
    double x;

    AndenGradsPolynomium(double a, double x, double b, double c){

        this.a = a;
        this.x = x;
        this.b = b;
        this.c = c;

        double result = a*Math.pow(x, 2)+b*x+c;

        System.out.println("f("+x+") = "+a+" * "+x+"^2 "+b+" * "+x+" + "+c+" = "+result);
        System.out.println();
    }


}