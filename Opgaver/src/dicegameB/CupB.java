package dicegameB;

public class CupB {
    DiceB d1=new DiceB();
    DiceB d2=new DiceB();
    int result1;
    int result2;

    void roll(){
        result1=d1.roll();
        result2=d2.roll();

    }

    int getSum(){
        return result1+result2;
    }

    public static void main(String[] args) {


        CupB c = new CupB();


        for(int i=1; i<=10; i++){
            c.roll();
            System.out.println(c.getSum());


        }
    }
}
