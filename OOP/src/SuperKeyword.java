public class SuperKeyword {
    public static void main(String[] args) {

        // super = refers to super class (parent/main class) of an object
        //         similar to the "this" keyword

        Hero hero1 = new Hero("Batman", 42, "$$$");
        Hero hero2 = new Hero("Superman", 52, "Everything");

        System.out.println(hero1.name);
        System.out.println(hero1.age);
        System.out.println(hero1.power);
        System.out.println();
        System.out.println(hero2.toSring());


    }
}
class Person{

    String name;
    int age;

    Person(String name,int age){
        this.name = name;
        this.age = age;

    }

    public String toString(){
        return this.name + "\n" +this.age+"\n";
    }
}
class Hero extends Person{

    String power;

    Hero(String name, int age, String power){

        super(name, age);
        this.power=power;

    }

    public String toSring(){
        return super.toString()+power;
    }

}
