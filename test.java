/*class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;

    }

}
*/

class Square
{
    int side;
    int Area(int side){
        return side*side;
    }
    int perimeter(int side){
        return 4*side;
    }

}


public class test
{
    public static void main(String[] str) {

       /*  Employee Sankalp= new Employee();

        Sankalp.salary=1000;
        Sankalp.setName("Sankalp");

        System.out.println(Sankalp.getSalary());
        System.out.println("The name is  " +Sankalp.getName()); */


        Square s= new Square();
        System.out.println("The Area of the square is: " +s.Area(10));
        System.out.println("The Perimeter of the square is: " + s.perimeter(10));
        
    }
}