import java.util.Random;
import java.util.Scanner;

public class Numbergame {
    public static void main(String[] args) throws Exception {
    String playagain; 
    int score=0;
    System.out.println("Welcome to the Number Guessing Game!");
    Thread.sleep(1500);
    do{
        System.out.println("I'm thinking of a number between 1 and 20");
        Thread.sleep(1500);
        System.out.println("Can you guess what the number is?");
        Random rd= new Random();
        int randomnum = rd.nextInt(20)+1;
        Scanner sc=new Scanner(System.in);
        for(int attempts=4; attempts>=0;attempts--){
            int guess= sc.nextInt();
            if(guess==randomnum){
                System.out.println("Yes! You got it right!");
                score+=5;
                System.out.println("High Score: "+score);
                break;
            }
            else if(guess>randomnum){
                System.out.println("Too high!");
                if(attempts==0){
                    System.out.println("Game over! The number I was guessing is "+randomnum);
                    System.out.println("High Score: "+score);
                    break;
                }
                if(attempts>1){
                    System.out.println("You have "+attempts+" attempts left. Try again please.");
                }
                else{
                    System.out.println("You have "+attempts+" attempt left. This is your final chance!");
                }
            }
            else{
                System.out.println("Too low!");
                if(attempts==0){
                    System.out.println("Game over! The number I was guessing is "+randomnum);
                    System.out.println("High Score: "+score);
                    break;
                }
                if(attempts>1){
                    System.out.println("You have "+attempts+" attempts left. Try again please.");
                }
                else{
                    System.out.println("You have "+attempts+" attempt left. This is your final chance!");
                }
            }
        }
        System.out.println("Thanks for playing! Would you like to play another round? (yes/no)");
        playagain=sc.next();
        if(playagain.equals("no")){
            System.out.println("Alright! See you later!");
        }
    }
    while(playagain.equals("yes"));

    }
}
