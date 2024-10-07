public class ArrayOfObjects {
    public static void main(String[] args) {

        //data type(i det her tilfælde et objekt)
        // og i [] er det hvor meget arrayen kan indeholde

        Food[] fridge = new Food[5];

        // du kan også skrive Food[] fridge = {food1, food2...};
        // og så behøver du ik skrive det her under
        Food food1 = new Food("salsa");
        Food food2 = new Food("humus");
        Food food3 = new Food("pizza");
        Food food4 = new Food("banana");
        Food food5 = new Food("apple");

        //assign food1 til index 0 i listen
        //index tal i listen og så assign det du gerne vil have tager indexens plads
        fridge[0] = food1;
        fridge[1] = food2;
        fridge[2] = food3;
        fridge[3] = food4;
        fridge[4] = food5;

        //og så skal du to string det nede i klassen eller du kan skriver fridge[0].name
        System.out.println(fridge[0].name);
        System.out.println(fridge[4]);

    }
}
class Food{

    String name;

    Food(String pName){

        name = pName;

    }

    public String toString(){
        return name;
    }

}
