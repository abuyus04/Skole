import java.time.LocalDate;
import java.util.ArrayList;

public class BankAppKonto2 {
    public static void main(String[] args) {

        ArrayList<Account> list = new ArrayList<>();

        Indlaan a1 = new Indlaan("Jill", 3);


        a1.deposit(100);
        a1.withdraw(50);


                                 //navn, rente, penge i konto, udløbsdato
        Hoejrente a2 = new Hoejrente("Bob", 10, 100000, LocalDate.of(2023, 12, 24));
        a2.deposit(20);
        a2.withdraw(100000);
        System.out.println();


        Kredit a3 = new Kredit("Janus", 0);
        a3.withdraw(7000);


        BoerneOpsparing a4 = new BoerneOpsparing("Yahya",1000, LocalDate.of(2030, 10, 22));
        a4.withdraw(100);
        a4.printTransaction();



        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);

        for (Account a:list){ // løber listen igennem
            a.annualInterest();
            //a.deposit(100);
            a.printTransaction();
            System.out.println();

        }

    }
}

class Indlaan extends Account{

    Indlaan(String ow, double rate){// constructer har samme navn som class

        super(ow, rate); // super aktivere overklassens contructor
    }


    public void withdraw(double amount){

        if(amount>balance){
            System.out.println("Der er ikke penge nok på kontoen");
        }
        else {
            super.withdraw(amount); // kalder overklassens withdraw metode og printer transaktion
        }

    }
}

class Hoejrente extends Account {

    LocalDate releaseDate;

    Hoejrente(String ow, double rate, double startBalance, LocalDate date) {
        super(ow, rate);
        super.deposit(startBalance); // gør at man kan se de 100k transaktion
        releaseDate = date;
    }

    public void deposit(double amount) {
        System.out.println("Du kan ikke sættes penge ind på denne konto");
    }

    public void withdraw(double amount) {
        LocalDate today = LocalDate.now();
        if(today.isBefore(releaseDate)){
            System.out.println("Pengene er bundet indtil "+releaseDate);
        }
        else {

            super.withdraw(amount);
        }

    }
}
class Kredit extends Account {


    Kredit(String ow, double amount){
        super(ow, amount);
        super.withdraw(amount);
    }

    public void withdraw(double amount) {
        double konto;
        //konto = balance;
        konto = balance - amount;

        if(konto > -10000){
            super.withdraw(amount);

        }
        else{
            System.out.println("Din grænse er på -10.000");
        }

    }
}
class BoerneOpsparing extends Account{

    LocalDate barnTilVoksen;

    BoerneOpsparing(String ow, double amount, LocalDate slutdato){
        super(ow, amount);
        super.deposit(amount);
        barnTilVoksen = slutdato;

    }

    public void withdraw(double amount){
        LocalDate today = LocalDate.now();
        if (today.isBefore(barnTilVoksen)){
            System.out.println("pengene er bundet indtil "+barnTilVoksen);
        }
        else {
            super.withdraw(amount);
        }

    }




}