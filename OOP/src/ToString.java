public class ToString {
    public static void main(String[] args) {

        // toString = textually represents an object
        //            alle objekter har en toString behind the scenes

        Car2 myCar = new Car2();

        System.out.println(myCar);
        System.out.println();
        System.out.println(myCar.toString());

    }
}

class Car2{

    String make = "Ford";
    String model = "Mustang";
    int year = 2024;
    String color = "Red";

    public String toString(){
        return make + "\n"+model+"\n"+color+"\n"+year;
    }
}