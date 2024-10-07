public class MathRandom {
    public static void main(String[] args) {


        int tal1 = (int)(Math.random()*101);//den her kommando gir tal fra 0-99(100 er ikke inkluderet)
        int tal2 = (int)(Math.random()*101);
        int tal3 = (int)(Math.random()*101);


        int sum = tal1+tal2+tal3;
        double gennemsnit = (tal1+tal2+tal3)/3;


        System.out.println(tal1+" "+tal2+" "+tal3);
        System.out.println("Sum: "+sum);
        System.out.println("Gennemsnit: "+gennemsnit);




    }
}
