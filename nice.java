package pack;

class cone{
    int radius;
    int height;
    void cone(){
        System.out.println("Calculating the volume of cone");
    }

    double cone(int radius, int height){
        return Math.PI*radius*radius*height/3;
    }
}




public class nice {
    public static void main(String[] args){
        cone c= new cone();
        System.out.println(c.cone(10,20));

    }
}
