import java.util.Scanner;
public class iva {

    public static void main(String[] args) {

        // Crear un objeto Scanner para leer datos desde el teclado
        Scanner scanner = new Scanner(System.in);

        // Solicitar y leer el nombre
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        // Solicitar y leer el primer apellido
        System.out.print("Ingrese su primer apellido: ");
        String primerApellido = scanner.nextLine();


        // Solicitar y leer el segundo apellido
        System.out.print("Ingrese su segundo apellido: ");
        String segundoApellido = scanner.nextLine();

        // Mostrar en pantalla los datos ingresados en el orden correspondiente
        System.out.println("Nombre completo: " + nombre + " " + primerApellido + " " + segundoApellido);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}


