import java.util.Scanner;

public class PythagoreanTheorem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter two values a and b:");
        int a = input.nextInt();
        int b = input.nextInt();
        double asq = Math.pow(a, 2);
        double bsq = Math.pow(b, 2);
        double c = Math.sqrt(asq + bsq);

        System.out.println("C = " +c);
    }
}
