import java.util.Scanner;

public class Skak {
    public static void main(String[] args) {
//while loop der har spillet kørende

//      8  ♖ ♘ ♗ ♕ ♔ ♗ ♘ ♖
//      7  ♙ ♙ ♙ ♙ ♙ ♙ ♙ ♙
//      6  ⬜️⬛️⬜️ ⬛️⬜️⬛️⬜️ ⬛️
//      5  ⬛️⬜️⬛️ ⬜️⬛️⬜️⬛️ ⬜️
//      4  ⬜️⬛️⬜️ ⬛️⬜️⬛️⬜️ ⬛️
//      3  ⬛️⬜️⬛️ ⬜️⬛️⬜️⬛️ ⬜️
//      2  ♟ ♟ ♟ ♟ ♟ ♟ ♟ ♟
//      1  ♜ ♞ ♝ ♛ ♚ ♝ ♞ ♜
        // a  b c  d  e f  g  h
        //♜ ♞ ♝ ♛ ♚ ♝ ♞ ♜
        //♖ ♘ ♗ ♔ ♕ ♗ ♘ ♖



        ChessBoard chess = new ChessBoard();
        WhiteMove move = new WhiteMove();


        chess.board();

        move.pawn();


    }
}

class ChessBoard{

    String l8 = "8 ♖ ♘ ♗ ♕ ♔ ♗ ♘ ♖";
    String l7 = "7 ♙ ♙ ♙ ♙ ♙ ♙ ♙ ♙";
    String l6 = "6 ⬜⬛⬜ ⬛⬜⬛⬜ ⬛";
    String l5 = "5 ⬛️⬜️⬛️ ⬜️⬛️⬜️⬛️ ⬜️";
    String l4 = "4 ⬜⬛⬜ ⬛⬜⬛⬜ ⬛";
    String l3 = "3 ⬛️⬜️⬛️ ⬜️⬛️⬜️⬛️ ⬜️";
    String l2 = "2 ♟ ♟ ♟ ♟ ♟ ♟ ♟ ♟";
    String l1 = "1 ♜ ♞ ♝ ♛ ♚ ♝ ♞ ♜";
    String file ="  A  B C  D  E F  G H";

    void board(){
        System.out.println(l8);
        System.out.println(l7);
        System.out.println(l6);
        System.out.println(l5);
        System.out.println(l4);
        System.out.println(l3);
        System.out.println(l2);
        System.out.println(l1);
        System.out.println(file);
    }

}
class WhiteMove extends ChessBoard{

    void pawn(){

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Choose pawn from line 2 and what file");
        String movePawn = keyboard.next();



    }
    void king(){

    }
    void queen(){

    }
    void bishop(){

    }
    void knight(){

    }
    void rook(){

    }
}
class BlackMove extends ChessBoard{

    void pawn(){

        Scanner keyboard = new Scanner(System.in);
        String movePawn = keyboard.next();


    }
    void king(){

    }
    void queen(){

    }
    void bishop(){

    }
    void knight(){

    }
    void rook(){

    }
}
