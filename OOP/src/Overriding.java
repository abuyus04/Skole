public class Overriding {
    public static void main(String[] args) {

        // method overriding = Declaring a method in a subclass,
        //                     Which is already present in the main class
        //                     done sp that a subclass can give its own implementation

        Dog dog = new Dog();
        Animal animal = new Animal();
        Fox fox = new Fox();

        animal.speak();
        dog.speak();
        fox.speak();

    }
}
class Animal{

    void speak(){
        System.out.println("the animal speaks");
    }
}

class Dog extends Animal{

    @Override //behøves ikke skrives men er godt så man kan holde styr
    void speak(){
        System.out.println("the dog goes *bark*");
    }
}
class Fox extends Animal{

    @Override
    void speak() {
        System.out.println("the fox goes *ring ding ding*");
    }
}