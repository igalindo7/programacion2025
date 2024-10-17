import com.sun.tools.javac.Main;

import java.util.Scanner;

public class ejerciciowhile {
    public static void main(String[] args) {

        /*simula lanzar un dado de seis caras hasta que te salga un seis
        //generar un numero aleatorio del 1 al 6.

        int dado=-1;
        while (dado !=6 ) {
            dado=(int) (Math.random()*(6+1+1)+1);

            System.out.println(dado);

            //simula lanzar un dado de seis caras hasta que te salga un seis
            //cuenta el numero de tiradas que has necesitado hasta sacar un seis
            // necesito una variable que se incremente cada vez  que entro en el while

            int tirada= 0;

            int contador=0;

            while (tirada !=6){
                contador++;
                tirada= (int)(Math.random()*(6-1+1))+1;

               System.out.println("dado " + tirada+" contador "+contador);
         */

                //simula tirar un dado de 20 caras hasta que salga  el 1 o el 20
               // tambien se puede  negar toda la accion !(numero ==1 || numero==00)

                int dado=7;
                while (dado !=1 && dado!=20) {
                    dado=(int) (Math.random()*(20-1+1)+1);

                    System.out.println("dado "+ dado);

                }

//        }
    }
}
