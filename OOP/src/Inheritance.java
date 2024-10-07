public class Inheritance {
    public static void main(String[] args) {



        Siara bil = new Siara();
        Darajeh cykel = new Darajeh();


        bil.drive();
        cykel.brake();

        System.out.println(bil.doors);
        System.out.println(Darajeh.pedals); //det her virker fordi du skriver static



    }
}
class Vehicle2{

    void drive(){
        System.out.println("you are driving");
        System.out.println();
    }

    void brake(){
        System.out.println("you are now braking");
        System.out.println();
    }
}

class Siara extends Vehicle2{
    int doors = 4;
}

class Darajeh extends Vehicle2{
    static int pedals = 2;
}