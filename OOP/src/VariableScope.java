import java.util.Random;

public class VariableScope {
    public static void main(String[] args) {

        //local variable/objects = declared inside method only visible to the method

        // global = declared outside method but available to whole class

        DiceRoller dice = new DiceRoller();
        // behøver ikke kaldes i dice.roll fordi
        // den kaldes i constructoren og ikke kun metoden


    }
}
class DiceRoller{

    Random gen;
    int num; // når du skriver variablerne her er de globale
    // og kan bruges i metoden der nede ellers skal du
    // lave dem om til parameter argumenter

    DiceRoller(){
        gen = new Random(); // behøver ikke skrive Random da den allerede er navngivet i attributes
        roll();
    }
    void roll(){
        num = gen.nextInt(6)+1;
        System.out.println(num);
    }
}
