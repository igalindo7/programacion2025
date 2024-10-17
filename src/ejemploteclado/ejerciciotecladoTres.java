package ejemploteclado;

import java.awt.*;
import java.util.Scanner;

public class ejerciciotecladoTres {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double precioproducto = 21.5;
        double iva = 21;
        double cantidad = 4;
        double precio = 0;
        System.out.println("precio total con iva" + (precioproducto + (precioproducto * iva / 100) * cantidad));
        precio = teclado.nextDouble();


    }
}

