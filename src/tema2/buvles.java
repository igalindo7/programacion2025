package tema2;

import java.awt.*;
import java.util.Scanner;

public class buvles {
    public static void main(String[] args) {
       /* //ejercicio 1
        int numero = 1;
        while (numero <= 5) {
            System.out.println(numero);
        }

        numero = numero + 1;

        //pinta los numeros pares del 1 al 20
        numero=2;
        while (numero <= 20) {

            System.out.println(numero);
            numero = 2;//numero=numero+2;
        }
        // cuenta regresiva
         numero = 10;
        while (numero >= 1) {
            System.out.println(numero);
            numero--;
        }//muestra los numero que son decenas del 1 al100
         numero=10;
        while (numero<=100){
            System.out.println(numero);
            numero+=10;//numero=numero+10

            int numero_=1;
            while (numero<=100){
                if (numero %10==0){ //comprobar si el numero es multiplo de 10
                    System.out.println(numero);
                }
                numero++;//numero=numero+1


            }
            // del 1 al 200 muestra los numeros impares que no sean multiplos de 7
              int numero=1;
              while (numero<=200) {
                  if (numero % 2 != 0 && numero % 7 != 0) {
                      System.out.println(numero);
                  }
                  numero += 2;
              }
              */

        //pide por teclado una contraseña mientras la longitud sea menor de 8 caracteres//passwor.length _ devuelve la longitud del strig password
/*
        String password = "1234567";
        Scanner sc = new Scanner(System.in);
        while (password.length() < 8) {
            System.out.println(password);
            password = sc.nextLine();
        }

        //pide por teclado una contraseña mientras la longitud sea menor de 10 caracteres//passwor.length _ y tenga al menos una letra mayuscula
        // devuelve la longitud del strig password
        //password.toUpperCase()pasa la cadena a mayuscualas.
        //password.toLowerCase()pasa la cadena a minuscula.

       /* String password = "hola";
        Scanner sc = new Scanner(System.in);// minetras pass es igual passMinuscula y pass menor 10
        while (password.equals(password.toLowerCase()) ) || (password.length()<10) {
            System.out.println("introduce contraseña");
            password = sc.nextLine();//lo que nos acerca a que se cumpla es pedir de teclado

        }
        System.out.println("tu contraeña valida es "+password);

        // lo que to quiero  que el bucle termine cuando es un  password .length()>= 10 && ! passwor.equals(password.toLowerCase.
        //lo contrario del de eso que es lo que pongo en el while password.length()>10 ||passwor.equals(passwor.toLowerCase

       Scanner sc= new Scanner(System.in);
       // mismo del pasword>=8
        String password;
        do {
            System.out.println("dime contraseña");
            password=sc.nextLine();

        }while (password.length()<8);
        System.out.println( " tu contraseña es "+ password);

        //muestra  los numeros del 1 al 10 usando do -while
        int numero=1;
        do {
            System.out.println(numero);
            numero++
        }while (numero<=10);
        }

*/
        }

    }
