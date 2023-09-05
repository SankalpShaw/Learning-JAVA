class Rectangle1{
    int length,breadth;
    int Rectangle1(int length,  int breadth){
        System.out.println("Calculating the Area of Recatngle:");
        return this.length*this.breadth;
    }
}

class RectBox extends Rectangle1{
    int height;
    int volume(int length,int breadth,int height){
        this.height=height;
        System.out.println("Calculating the volume of RECTBOX:");
        int c=super.length* super.breadth *height;
        return c;
    }
}




public class Q10 {
    public static void main(String[] args) {
        Rectangle1 r= new Rectangle1();
        r.Rectangle1(10,20);

        
    }
    
}
