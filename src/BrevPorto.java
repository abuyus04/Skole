import java.util.Scanner;

public class BrevPorto {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("indtast brevets vægt: ");
        int BrevGram = scanner.nextInt();


        if (BrevGram <= 50){
            System.out.println("Dit brev sendes for 14DKK");//14
        } else if(BrevGram <= 100){
            System.out.println("Dit brev sendes for 28DKK");//28
        } else if(BrevGram <= 250){
            System.out.println("Dit brev sendes for 42DKK");//42
        } else if(BrevGram <=500){
            System.out.println("Dit brev sendes for 56DKK");//56
        } else if(BrevGram <=1000){
            System.out.println("Dit brev sendes for 70DKK");//70
        } else if(BrevGram <=2000){
            System.out.println("Dit brev sendes for 84DKK");//84
        }





    }
}
