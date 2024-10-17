import java.util.Scanner;

public class ejecicioclase {



    public static void main(String[] args) {

        Scanner sc=  new Scanner (System.in);
        double nota1 = 5.7;
        double nota2 = 7.3;
        double nota3 = 6.2;
        double notaFinal = 0;
        double notaTrabajofinal = 0;
        double notaParciales = 0;

        double notamediaParciales = (nota1+ nota2 +nota3) / 3;
        System.out.println(notamediaParciales);

        notamediaParciales = (notamediaParciales * 55) / 100;

        System.out.println(notaFinal);

        notaFinal = (notamediaParciales * 30) / 100;

        System.out.println(notamediaParciales);


        // declaracion de variables
        // double nota1=4, nota2=3,nota3=7;
        //double nota

        notaTrabajofinal = (notamediaParciales * 15) / 100;

        System.out.println(notamediaParciales);

         //intercambiar valor de dos variables
       
    }
}

