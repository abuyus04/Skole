import java.util.Random;

public class DiceMan {
    public static void main(String[] args) {

        Random gen=new Random();
        int tal= gen.nextInt(6);

        System.out.println(tal);


        String actvity=" "; //du SKAL give den værdi


        if (tal==0){
            actvity="Breakfast";
        } else // man behøver ik skriver else men det gør at der bliver sprunget steps over hvis du allerede
        if (tal==1){// har tallet så det hurtigere
            actvity="Study";
        } else
        if (tal==2){
            actvity="Swim";
        } else
        if (tal==3){
            actvity="Fishing";
        } else
        if (tal==4){
            actvity="Call mom";
        } else
        if (tal==5){
            actvity="Bed";
        }
        System.out.println(actvity);


    }
}
