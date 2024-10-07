public class Abstract {
    public static void main(String[] args) {

        // abstract = abstract class cant be instantiated but they can have a subclass
        //            abstract methods are declared without an implementation

        //Koeretoej køretøj = new Koeretoej();


        Koeretoej motorcykel = new Motorcykel();
        motorcykel.go();
        Motorcykel cykelMoter = new Motorcykel();
        cykelMoter.go(); // begge de her metoder virker


    }
} //brug abstract når overklassen er alt for vague fx hvad er et køretæj det ka være en bil motorcykel osv
abstract class Koeretoej{

    abstract void go(); // skal ikke have en krop når den er abstract så du skal kalde den i sub-klassen

}
class Motorcykel extends Koeretoej{
    void go(){
        System.out.println("the driver is driving the bike");
        System.out.println();
    }

}
