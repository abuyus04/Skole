public class OverloadedMethods {
    public static void main(String[] args) {
        //overloaded methods = metoder der har det samme navm men forskellige parametere (...)
        //metode navn + parameter = method siganture


        int x = add(1,5);
        System.out.println(x);
        int y = add(2, 4, 8);
        System.out.println(y);
        int z = add(2, 7, 4, 7);
        System.out.println(z);
        double x2 =add(2.35, 2.6436);
        System.out.println(x2);



    }
     // arguments er det der inde i parameteren (...)
    static int add(int a, int b){
        System.out.println("this is overloaded method #1");
        return a+b;
    }
    static int add(int a, int b, int c){
        System.out.println("this is overloaded method #2");
        return a+b+c;
    }
    static int add(int a, int b, int c, int d){
        System.out.println("this is overloaded method #3");
        return a+b+c+d;
    }
    static double add(double a, double b){
        System.out.println("this is overloaded method #4");
        return a+b;
    }
    static double add(double a, double b, double c){
        System.out.println("this is overloaded method #5");
        return a+b+c;
    }
    static double add(double a, double b, double c, double d){
        System.out.println("this is overloaded method #6");
        return a+b+c+d;
    }
}
