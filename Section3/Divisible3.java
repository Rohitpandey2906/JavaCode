import java.util.Scanner;

public class Divisible3 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int number =s.nextInt();

        if(number%3==0){
            System.out.println("Divisible by 3");
        }else{
            System.out.println("Not divisible by 3");
        }
    }
}