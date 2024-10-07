public class FilmOpg {
    public static void main(String[] args) {



        Film film = new Film("The Matrix", 1996);
        Film film2 = new Film("Superman"); // hvis du har to constructors ka du lave en der ikke
        // skal have den anden værdi den ka fx stå inde i metoden men tror ik det behæves




    }
}
class Film{

    String filmTitel;
    int udgivelsesAar;

    Film(String filmTitel, int udgivelsesAar){

        this.filmTitel = filmTitel;
        this.udgivelsesAar = udgivelsesAar;
        System.out.println(filmTitel+" "+udgivelsesAar);
    }
    Film(String filmTitel){

        this.filmTitel = filmTitel;
        int now = java.time.Year.now().getValue();
        System.out.println(filmTitel +" "+now);
    }

}
//abuyus04
