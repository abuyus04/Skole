package dicegameB;

public class PlayerB {
    CupB cup = new CupB(); // spilleren har et kop objekt
    String name;
    int point=0;

    PlayerB(String name){
        this.name = name;
    }

    void turn(){
        cup.roll();
        point+= cup.getSum();
    }
    public String toString(){
        return name;
    }

    public static void main(String[] args) {

        PlayerB p=new PlayerB("Bob");
        System.out.println(p);

        while (p.point < 100){

            p.turn();
            System.out.println(p.point);
        }


    }
}
