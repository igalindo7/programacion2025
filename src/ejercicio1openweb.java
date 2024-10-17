import java.util.Scanner;

public class ejercicio1openweb {// pedimos por teclado el coste de fabricacion d
    // de un product,queremos pintar por pantalla el precio que le vamos a poner al producto
    //al coste de fabricaion hay que sumarle la ganancia p 30 %
    // al precio reusltante le tengo que sumar el iva 21%

    public static void main(String[] args) {

        // declaracion de variables siemrpe
        double costeFabricacion;
        double precioIva;
        double precioFinal;
        // leer de reclado el coste de fabricaion
        Scanner sc = new Scanner(System.in);
        System.out.println("dime el coste de fabricacion de un porducto");
        costeFabricacion = sc.nextDouble();
        // sumarle el margen queyo me quiero quedar es un 30% ( coste+30/100)
        costeFabricacion = costeFabricacion + (costeFabricacion / 100);
        System.out.println("el coste de fabricacion mas el margen es : costeFabricacion");

        //sumarle un 21% de iva que tengo que darle a hacienda
        precioFinal = costeFabricacion + (costeFabricacion * 21 / 100);

        //imprimo el recio para el cliente
        System.out.println(precioFinal);


        double nota1 = 5.7;
        double nota2 = 7.3;
        double nota3 = 6.2;
        double notaFinal = 0;
        double notaTrabajofinal = 0;
        double notaParciales = 0;
        notaParciales = (5.7 + 7.3 + 6.2) / 3;


    }
}