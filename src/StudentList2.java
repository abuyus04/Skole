//import java.io.*;
//import java.util.ArrayList;
//
//public class StudentList2 {
//
//
//    public static void main(String[] arg) throws IOException
//    {                               //skriv src hvis filen ligger i src eller hvor end den er i computeren
//        FileReader fil = new FileReader("src//StudentList.txt");
//        BufferedReader ind = new BufferedReader(fil);
//        ArrayList<Student>list=new ArrayList<>();
//
//
//        String linje = ind.readLine();
//        while (linje != null)
//        {
//
//            String[] bidder = linje.split(",");//[] er array, opdel i bidder efter ,
//            Student s=new Student(); // objekt
//            s.name = bidder[1];
//            s.surName = bidder[2];
//            s.sNo = bidder[0].substring(0,8);
//            list.add(s);
//            linje = ind.readLine();
//
//        }
//
//
//        System.out.println(list);// den her er alt sammen en linje
//
//        list.sort(null);
//        for (Student e:list){
//            System.out.println(e);
//        }
//        // den her loop gør der bliver udskrevet navne på hver sin linje
//
//     //   save(list);
//
//    }
//
//    static void save(ArrayList<Student> l)throws IOException{// gør de der expeptions bare bliver smidt videre
//
//        FileWriter fil = new FileWriter("src//StudentListSorted.txt");
//        PrintWriter ud = new PrintWriter(fil);
//
//        for (Student s:l){
//            ud.println(s);
//        }
//
//        ud.close();
//
//    }
//}
//
//class Student implements Comparable<Student> {
//
//    String name;
//    String surName;
//    String sNo;
//
//    public String toString(){
//
//        return sNo+": "+name+" "+surName;
//    }
//
//
//    @Override
//    public int compareTo(Student o) {
//        return sNo.compareTo(o.sNo);
//    }
//}