public class StaticKeyword {
    public static void main(String[] args) {

        //du kan tilføje static til både metoder variabler og klasser.
        //

        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Squidward");
        Friend friend4 = new Friend("Sandy");

        //System.out.println(Friend.numberOfFriends);

        System.out.println(friend3.name);

        Friend.displayFreinds(); // når du har en static metoden ska du bare kalde klassen
        // og så kalder den friends fordi hele klassen deler den variabel


        //static gør at alle de her venner dele variablen numberOfFriends
        //dvs at du ikke bare kan skrive Freind.numberOfFriends for at kalde metoden
        //men du skal friend1.numberOfFriends og så tæller den op med 1
        //hvilket er forkert da der er 3 venner så static gør at de allesammen
        //deler numberOffriends++ kommandoen og tæller op en efter en
        //istedet for individuel

    }
}
class Friend {

    String name;
    static int numberOfFriends;
    //static vil sige at er det delt med hele klassen og alle objekter
    // så alle kan access static metoden eller variable
    //fx her så gør det sårn at alle friend names deler numberOffriends så
    //de bliver allesammen talt op fra 1, 2, 3, 4... isetdet for at hver friend
    //tæller sig selv som 1

    Friend(String pName){
        name = pName;
        numberOfFriends++;
    }

    static void displayFreinds(){
        System.out.println("you have "+numberOfFriends+ " friends");
    }
}
