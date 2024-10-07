package dicegameB;

public class OneHundredB {
    PlayerB p1 = new PlayerB("Jill");
    PlayerB p2 = new PlayerB("Bobby");

    void play(){

        System.out.println(p1+"\t"+p2);
        int count=0;

        while (p1.point<100 && p2.point <100){
            p1.turn();
            p2.turn();
            System.out.println(p1.point+"\t\t"+p2.point);
            count++;

        }

        if(p1.point >= 100){
            System.out.println("tillykke du har vundet "+p1+" du har brugt " +count+" forsøg");
        } else if (p2.point >= 100){
            System.out.println("tillykke du har vundet "+p2+" du har brugt " +count+" forsøg");
        }
    }

    public static void main(String[] args) {

        OneHundredB game = new OneHundredB();

        game.play();

    }
}
