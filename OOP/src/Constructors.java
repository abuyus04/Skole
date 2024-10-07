public class Constructors {
    public static void main(String[] args) {

        // constructor = special method that is called when an object is created (instantiated)

        // det hedder constructor fordi du kan construct din egne værdier til hver attribute
        // fx attrbiutet name kan have forskellige værdier baseret på hva du indskriver i parameteren

        Human human = new Human("Husam", 53, 90);
        Human human2 = new Human("Abdul", 23, 70);
        System.out.println(human.name);
        System.out.println(human2.name);

        // du behøver ik skrive sout her for der allerede in print statement i metoden
        human2.eat();
        human.drink();
        human.myLove();

    }
}

class Human{

    String name; // her er attributes
    int age;
    double weight;

    /* her nede er constructoren hvor du definere attributerne
    oppe i Human human = new Human("definer her")
     */
    Human(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight; // du kan også bare kalde dem noget andet som pName
        // så behøver du ikke skrive this.
    }

    void eat(){  // den her kalder attributens name og ikke constructerens
        System.out.println(this.name+" is eating");
        System.out.println();
    }
    void drink(){
        System.out.println(this.name+" is drinking");
        System.out.println();
    }
    void myLove(){
        System.out.println(this.name+" you are my حبيبي");
    }
}
