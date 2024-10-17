import java.util.Scanner;

public class Acumulador1 {
    public static void main(String[] args) {
        //Pide 5 precios por teclado y pinta la suma total
        int total = 0;
        int precio;
        Scanner sc = new Scanner(System.in);

        for(int i=0; i < 5; i++) {
            precio = sc.nextInt();
            total = total + precio;
        }

        System.out.println("El total es " + total);
    }
}
