package MD6_loopsAndFunctions;

import javax.swing.*;
import java.lang.reflect.Array;

public class FunctionsExercises {

    public static void main(String[] args) {
        //1
        holaJava();

        //2
        saludo(JOptionPane.showInputDialog("Como te llamas? Quiero saludarte"));

        //3
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Dame un numero"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Dame otro numero"));
        resta(n1, n2);

        //4
        cuadrado(n1);

        //5
        int n3 = Integer.parseInt(JOptionPane.showInputDialog("Dame un numero y te diré si es par o impar"));
        parImpar(n3);

        //6
        int n4 = Integer.parseInt(JOptionPane.showInputDialog("Qué edad tienes?"));
        System.out.println("¿Eres mayor de edad? " + mayorEdad(n4));

        //7
        String texto = JOptionPane.showInputDialog("Dame una cadena y te diré su longitud");
        System.out.println("Esta cadena tiene longitud: " + longitudCadena(texto));

        //8
        int largoArray = Integer.parseInt(JOptionPane.showInputDialog("Introduce varios enteros para calcular su media. ¿Cuantos quieres introducir?"));
        int[] enteros = new int[largoArray];
        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = Integer.parseInt(JOptionPane.showInputDialog("Estas introduciendo otro entero para el array"));
        }
        System.out.println("La media de este array es: " + mediaArray(enteros));

    }


    // 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde cero!".
    public static void holaJava() {
        System.out.println("¡Te doy la bienvenida a esta funcion!");
    }

    // 2. Escribe una función que reciba un nombre como parámetro y salude a esa persona.
    public static void saludo(String name) {
        System.out.println("Hola " + name + "!! Encantad@");
    }

    // 3. Haz un método que reciba dos números enteros y devuelva su resta.
    public static void resta(int num1, int num2) {
        System.out.println("la resta entre: " + num1 + " y " + num2 + " es: " + (num1 - num2));
    }


    // 4. Crea un método que calcule el cuadrado de un número (n * n).
    public static void cuadrado(int num1) {
        System.out.println("El cuadrado del primer numero que introdujiste es: " + num1 + " * " + num1 + " : " + num1 * num1);
    }

    // 5. Escribe una función que reciba un número y diga si es par o impar.
    public static void parImpar(int num3) {
        if (num3 % 2 == 0) {
            System.out.println("Este es un numero par");
        } else {
            System.out.println("Este es un numero impar");
        }
    }

    // 6. Crea un método que reciba una edad y retorne true si es mayor de edad (y false en caso contrario).
    public static boolean mayorEdad(int num4) {
        if (num4 < 18) {
            return false;
        } else {
            return true;
        }
    }

    // 7. Implementa una función que reciba una cadena y retorne su longitud.
    public static int longitudCadena(String cadena) {
        return cadena.length();
    }

    //  8. Crea un método que reciba un array de enteros, calcula su media y lo retorna.
    public static int mediaArray(int[] enteros) {
        int suma = 0;
        int contadorArray = 0;
        for (int i = 0; i < enteros.length; i++) {
            suma += enteros[i];
            contadorArray++;
        }
        return suma / contadorArray;

        // 9. Escribe un método que reciba un número y retorna su factorial.

        // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando cada elemento.
    }
}
