import java.util.Scanner;

public class ProjectAverage {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        double a1 = s.nextDouble();
        double b1 =s.nextDouble();
        double c1 =s.nextDouble();

        System.out.println((a1+b1+c1)/3);
    }
}