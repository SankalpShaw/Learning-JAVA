import java.util.Random;
import java.util.Scanner;

class game1 {
    public int number;
    public int inputNumber;
    public int noOfGuess=0;
    
    public int getNoOfGuess(){
        return noOfGuess;
    }

    public void setNoOfGuess(int noOfGuess){
        this.noOfGuess=noOfGuess;
    }

    game1(){
        Random rand= new Random();
        this.number = rand.nextInt(100);
    }

    void takeUserInput(){
        System.out.println("Guess the number");
        Scanner sc =new Scanner(System.in);
        inputNumber= sc.nextInt();
    }

    boolean isCorrectNumber(){
        noOfGuess++;
        if(inputNumber==number){
            System.out.format("Yes You have guessed right, it was %d\n You guessed it in %d attempts", number,noOfGuess);
            return true;
        }
        else if(inputNumber<number){
            System.out.println("too low...");
        }
        else if(inputNumber>number){
            System.out.println("too high...");
        }
        return false;
    }
}

public class Game{
    public static void main(String[] str){
        game1 g=new game1();
        boolean b=false;
        while(!b){
            g.takeUserInput();
            b=g.isCorrectNumber();
        }
    }
}
