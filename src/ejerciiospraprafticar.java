import java.util.AbstractMap;
import java.util.Scanner;

public class ejerciiospraprafticar {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        double a;
        System.out.println("Escribe el valor de a: ");
        a = sc.nextDouble();
        double b;
        System.out.println("Escribe el valor de b: ");
        b = sc.nextDouble();
        double c;
        System.out.println("Escribe el valor de c: ");
        c = sc.nextDouble();

        if (a==0) {
            System.out.println(("a==0 error"));

        } else {
            if ((Math.pow(b, 2) - 4 * a * c) >= 0) {
                System.out.println((-b + (Math.sqrt(Math.pow(b, 2) - 4 * a * c))) / (2 * a));
                System.out.println((-b - (Math.sqrt(Math.pow(b, 2) - 4 * a * c))) / (2 * a));
            }
        }
    }
}