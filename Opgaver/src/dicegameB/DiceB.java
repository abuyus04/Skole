package dicegameB;

import java.util.Random;

public class DiceB {

    static Random gen = new Random();
    // lig her så den ik blir kaldt 10 gange men kun en

    int roll(){
        int result;
        result = gen.nextInt(6)+1;
        return result;
    }



    public static void main(String[] args) {
        DiceB d = new DiceB();
        int x = d.roll();

        for (int i=1; i<=10; i++) {
            System.out.println(d.roll());

        }
    }
}
