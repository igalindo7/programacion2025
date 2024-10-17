import java.util.Scanner;

public class ejercicioif {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int dia;
        int mes;
        System.out.println("dime el  mes");
        mes=sc.nextInt();
        System.out.println("dime que dia ");
        dia= sc.nextInt();


        if( (mes == 12 && dia >= 22) || mes < 3 || (mes == 3 && dia <= 19)) {
            System.out.println("invierno");
        }






    }
}
