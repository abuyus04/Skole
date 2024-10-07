public class Polymorphism {
    public static void main(String[] args) {

        //polymorphism = poly "many" morph "form"
        //               the ability of an object to identify as more than one data type


        Bil bil = new Bil();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehicle[] racers = {bil, bicycle, boat};

        for(Vehicle x : racers){
            x.go();
        }

    }
}

class Vehicle{

    public void go() {
    }

}
class Bil extends Vehicle{

    public void go(){
        System.out.println("*The car is moving*");
    }
}
class Bicycle extends Vehicle{

    public void go(){
        System.out.println("*The bicycle is moving*");
    }
}
class Boat extends Vehicle{

    public void go(){
        System.out.println("*The boat is moving*");
    }
}