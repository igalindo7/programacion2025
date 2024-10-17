import java.util.Scanner;

public class ejercicioMenuCalculadora {
    public static void main(String[] args) {
        // pedir por teclado dos menu
        //1.mostrar un menu con las siguientes opciones
        //1.sumar pide dos numeros y sumalos
        //2.restar pide dos numeros y restalos
        //3.multiplicar pide dos numeros y multiplicalos
        //4.dividir pide dos numeros y divides
        //5.resto division pide dos numeros y muestra el resto de la division
        //6.elevar el primero al segundo pide dos numeros y eleva el primero al segundo
        //7.salir

        double numero;
        double numero2;
        int numero3=0;
        Scanner sc = new Scanner(System.in);

        while (numero3 != 7) {

            System.out.println("1. sumar dos numeros ");
            System.out.println("2. restar dos numeros");
            System.out.println("3. multiplica dos numeros");
            System.out.println("4. divide dos numeros");
            System.out.println("5. resto de la division");
            System.out.println("6. elevar el primero al segundo");
            System.out.println("7. salir");
            System.out.println("Introduce opción elegida:");
             numero3=sc.nextInt();

            System.out.println("introducenumero");
            numero=sc.nextDouble();
            System.out.println("introducenumero");
            numero2=sc.nextDouble();


            switch (numero3) {
                case 1:
                    System.out.println("Has elegido la opción suma " +( numero2+numero));

                    break;
                case 2:
                    System.out.println("Has elegido la opción resta" + (numero-numero2));

                    break;
                case 3:
                    System.out.println("Has elegido la opción division "+(numero/numero2));

                    break;
                case 4:
                    System.out.println("Has elegido la opción resto "+(numero%numero2));

                    break;
                case 5:
                    System.out.println("multiplica "+ numero*numero2);
                    break;
                case 6:
                    System.out.println("Has elegido la opción elevado"+(Math.pow(numero,numero2)));

                    break;
                case 7:
                    System.out.println("salir");
                    break;
                default:
                    System.out.println("Error, opción incorrecta");
            }
        }
    }
}
