import java.util.ArrayList;
import java.util.Random;

public class PokerApp {
    public static void main(String[] args){

        PokerPlayer spiller = new PokerPlayer();
        spiller.kortTildeling("Yosef");

    }

}
class PokerPlayer{

    String name;

    void kortTildeling(String pName){
        Card tilDel = new Card();
        System.out.print(pName+ " dine kort er: ");
        tilDel.hand();
    }
//    public String highestCard(){
//
//        Card highCard = new Card();
//
//
//
//
//
//        return
//    }
}

class Card{

    ArrayList<String> suits;
    ArrayList<String> ranks;

    Card() {

        suits = new ArrayList<String>();


        suits.add("♥");
        suits.add("♦");
        suits.add("♣");
        suits.add("♠");

        ranks = new ArrayList<String>();
        ranks.add("Ace");
        ranks.add("2");
        ranks.add("3");
        ranks.add("4");
        ranks.add("5");
        ranks.add("6");
        ranks.add("7");
        ranks.add("8");
        ranks.add("9");
        ranks.add("10");
        ranks.add("J");
        ranks.add("Q");
        ranks.add("K");

    }

    public void hand(){
        Random gen = new Random();


            for (int i=1; i<=5; i++) {

                int randomIndex1 = gen.nextInt(suits.size());
                int randomIndex2 = gen.nextInt(ranks.size()); // husk at lave random index
                // til hver liste og ik kun en der tager fra begge 
                String randomSuit1 = suits.get(randomIndex1);
                String randomRank1 = ranks.get(randomIndex2);
                System.out.print(randomRank1 + randomSuit1 + " ");
            }
        System.out.println();
    }

}