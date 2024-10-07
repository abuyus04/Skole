//import java.io.*; // hel pakke
//import java.util.ArrayList;
//
//public class StudentList {
//
//
//    public static void main(String[] arg) throws IOException
//    {                               //skriv src hvis filen ligger i src eller hvor end den er i computeren
//       // FileReader fil = new FileReader("src//StudentList.txt");
//        //BufferedReader ind = new BufferedReader(fil);
//        ArrayList<String>list=new ArrayList<>();
//
//
//        String linje = ind.readLine();
//        while (linje != null)
//        {
//
//            String[] bidder = linje.split(",");//[] er array, opdel i bidder efter ,
//            String navn = bidder[1];
//            list.add(navn);
//            linje = ind.readLine();
//
//        }
//
//
//        System.out.println(list);// den her er alt sammen en linje
//
//        list.sort(null);
//        for (String s:list){
//            System.out.println(s);
//        }
//        // den her loop gør der bliver udskrevet navne på hver sin linje
//
//        save(list);
//
//    }
//
//    static void save(ArrayList<String> l)throws IOException{// gør de der expeptions bare bliver smidt videre
//
//        FileWriter fil = new FileWriter("src//StudentListSorted.txt");
//        PrintWriter ud = new PrintWriter(fil);
//
//        for (String s:l){
//            ud.println(s);
//        }
//
//        ud.close();
//
//    }
//}
//
