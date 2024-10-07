import java.time.LocalDate;
import java.util.ArrayList;

public class BankAppKonto {
    public static void main(String[] args) {// alt i (...) er parametere

        // alt der hedder .etEllerAndet er en metode


        Account a1 = new Account("Joe pass", 2.5);

        //a1.accountNo = 1;
        //a1.owner = "Joe Pass";
        //a1.balance = 500;
        //a1.interestRate = 2.5;
        Account a2 = new Account("Jimmy", 2.5);

        a1.deposit(200);
        a1.deposit(1000);
        a1.withdraw(400);




        a1.annualInterest();

        //System.out.println(a1.toString());//behøves ikke kaldes men du kan. den gør det automatisk);

        a1.printTransaction();
        a2.printTransaction();


    }
}


    class Account{

        private int accountNo;
        protected String owner;// protected gør at under klasse godt kan access altså extends
        protected double balance; // indestående i kr
        protected double interestRate; // indestående i %
        private ArrayList<Transaction> transaction = new ArrayList<>();
        static private int noOfAccounts = 0;


    // constructor... og den skal være inden i klassen inden for { }
    Account(String ow, double rate) {


        noOfAccounts++;
        accountNo = noOfAccounts;
        owner = ow;
        balance = 0;
        interestRate = rate;

    }


    public void deposit(double amount){
        balance=balance+amount;

        transaction.add(new Transaction("Indsat", amount, balance));

    }

    public void withdraw(double amount){
        balance=balance-amount;
        transaction.add(new Transaction("Hævet", amount, balance));
    }

    public void annualInterest(){

        double interest = balance*interestRate/100;
        balance = balance+interest;

        transaction.add(new Transaction("Renter", interest, balance));


    }

    public void printTransaction(){

        System.out.println(this);
        System.out.println("Tekst\tDato\t\tBeløb\tSaldo");
        for (Transaction t: transaction){
            System.out.println(t);
        }
        System.out.println();

    }



    public String toString(){
            return "Kontonr " +accountNo+ ": " +owner+" "+balance;
        }

    }

class Transaction {

    String text;
    LocalDate date;
    double amount;
    double newBalance;
                //behøver ik hedde text det gør at du ska skrive "this."
    Transaction(String text, double amount, double newBalance){//parameter overførelser...

        this.text = text; // når du skriver this referer den til text ovenpå og ikke i (...)
        date=LocalDate.now();
        this.amount = amount;
        this.newBalance = newBalance;


    }

    public String toString(){
        return text+"\t"+date+"\t"+amount+"\t"+newBalance;
    }


}