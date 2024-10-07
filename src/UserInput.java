import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

// husk at importere scanner det her er ikke efter bogen men brocode

        Scanner scanner = new Scanner(System.in); // den der sørger for user input

        System.out.println("skriv din alder: ");
        int alder = scanner.nextInt(); //her du skriver userinput

        if (alder >= 18) {
            System.out.println("du er myndig!");
        } else if (alder>=13){
            System.out.println("du er teenager!");
        } else if (alder>=9) {
            System.out.println("du er et barn!");
        }





        
    }
}
