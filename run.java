package pack;


class rectangle{
    int length,breadth;
    int area(int length, int breadth) {
        return length*breadth;
    }
    int perimeter(int length, int breadth) {
        return 2*length+2*breadth;
    }
}

public class run {
    public static void main(String[] args){
        rectangle r = new rectangle();
        System.out.println("The area of rectangle is"+r.area(10,20));
        System.out.println("The perimeter of rectangle is"+r.perimeter(10,20));
    }
}
