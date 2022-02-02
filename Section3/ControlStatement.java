import java.util.Scanner;

public class ControlStatement {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to the Pub ");
        System.out.println("Enter your age please");
        int age = s.nextInt();

        if(age>=18){
            System.out.println("Have a chilled Beer");
        }
        else{
            System.out.println("Have a Soft Drink");
        }

        System.out.println("Thanks for coming");
    }
}