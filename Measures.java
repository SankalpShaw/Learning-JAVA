import java.security.PublicKey;

class Cylinder{
    public int radius, height;

    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius=radius;
    }

    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height=height;
    }

    public double SurfaceArea(){
        return ((2*3.14*radius*radius)+(2*3.14*radius*height)) ;
    }
    public double Volume(){
        return 3.14*radius*radius*height;
    }
}
public class Measures{
    public static void main(String[] str) {

        Cylinder c=new Cylinder();
        c.setHeight(10);
        c.setRadius(14);
        int r= c.getRadius();
        int h=c.getHeight();

        System.out.println("The surface area of cylinder is:" +c.SurfaceArea());
        System.out.println("The Volume of cylinder is:" +c.Volume());

        
    }
    
}
