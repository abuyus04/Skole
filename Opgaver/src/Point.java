public class Point {
    public static void main(String[] args) {

        //d=√((x2 – x1)² + (y2 – y1)²)

        Points p1 = new Points(4, 7);
        Points p2 = new Points(8, 4);

        System.out.println(p1.distance(p2));
        System.out.println(p1+" "+p2);


    }
}
class Points{

    double x;
    double y;

    Points(double x,double y){
        this.x = x;
        this.y = y;
    }

    double distance(Points p){

        //d=√((x2 – x1)² + (y2 – y1)²)

        double d;
        d = Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));

        return d;


    }

    @Override
    public String toString() {
        return "dine er punkter er "+x+" "+y+" ";
    }
}
