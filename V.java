class Volume{
    int length,radius,breadth,height;
    void vol(){
        System.out.println("Calculating the Volumes:");
    }
    double vol(int length){
        System.out.println("Calculating Volume of cube:");
        return Math.pow(length,3);
    }
    double vol(int length,int breadth,int height){
        System.out.println("Calculating Volume of Rectangle:");
        return length*breadth*height;
    }
    double vol(int radius,int length){
        System.out.println("Calculating Volume of Cylinder:");
        return 3.14*radius*radius*length;
    }
}



public class V {
    public static void main(String[] args){
        Volume v1=new Volume();
        System.out.println(v1.vol(10));
        System.out.println(v1.vol(10,20,20));
        System.out.println(v1.vol(10,20));


    }
    
}
