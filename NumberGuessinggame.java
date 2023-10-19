import java.io.*;
import java.util.*;
class NumberGuessing{
    private int computernumber;
    private int usernumber;
    public void setComputernumber(){
        Random random=new random();
        computernumber=random.nextInt(100)+1;
    }
    public void SetUserNumber(int n){
        usernumber=n;
    }
    public int getUserNumber(){
        return usernumber;
    }
    public int getComputerNumber(){
        return computernumber;
    }
}
class NumberGuessinggame{
    public static void main(String args[]){
        int n,guesses=10;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        NumberGuessing obj=new NumberGuessing();
        while(guesses>0){
            n=sc.nextInt();
            obj.SetUserNumber(n);
            if(obj.getUserNumber()==obj.getComputerNumber()){
                System.out.println("Congratulations brother!!!");
            }
            else if(obj.getUserNumber()>obj.getComputerNumber()){
                System.out.println("The no. guessed is too high");
            }
            else{
                System.out.println("The no. guessed is too low");
            }
            guesses--;
        }
        if(guesses==0){
            System.out.println("U ran out of guesses");
        }
    }
}
