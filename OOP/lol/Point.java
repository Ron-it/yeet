public class Point{

// attributes of fields
    char name;
    double x;
    double y;

    // behaviours or actions
    public void print(){
        System.out.println(name+"("+x+","+y+")");
    }
    public static void main(String[] args){

        Point a = new Point();
        a.name = 'A';
        a.x = 1.5;
        a.y = 0;
        a.print();

    }

}