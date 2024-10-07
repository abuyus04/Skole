public class ObjectPassing {
    public static void main(String[] args) {



        //det her hedder en instance
        Garage garage = new Garage();
        NyBil nybil = new NyBil("BMW");
        NyBil nybil2 = new NyBil("Audi");

        garage.park(nybil);
        garage.park(nybil2);





    }
}
class Garage{

//datatypen er klassen under og du skal have en bil
    //du kan kalder bil her under lige hvad du vil ik nødvendigvis bil
    //og så kalder du klassen under til at blive indtastet her under plus det der skal printes
    // så bil.name + er parkeret i garagen
    void park(NyBil bil){
        System.out.println(bil.name+" er parkeret i garagen");

    }
}
class NyBil{

    String name;

    //husk constructer gør du kan skrive attributes ind i parameter ovenpå
    //da de ikke allerede er beskrevet
    NyBil(String pName){
        name = pName;
    }

}