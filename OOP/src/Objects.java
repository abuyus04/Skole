public class Objects {
    public static void main(String[] args) {
        /* object = det en construter final result er
        atlså constructoren består af attributter som opgør objektet

        metode er objektets egenskaber fx kan er bil et objekt og dens egenskab er at køre
         */


       Car bil = new Car();
       Car bil2 = new Car();

       bil.drive();

        System.out.println(bil.brand);
        System.out.println(bil.year);

    }
}
// klassens navn er det objekt du ska arbejde med fx klassen hedder Car og dit objekt er
// en Car som du skal beskrive
class Car{

    String brand = "chevy";
    String model = "corvette";
    int year = 2020;
    String color = "black";
    double price = 50000.00;

    void drive(){
        System.out.println("you drive the car");
    }
    void brake(){
        System.out.println("you brake the car");
    }

}
