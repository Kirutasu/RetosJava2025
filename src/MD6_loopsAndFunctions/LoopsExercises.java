package MD6_loopsAndFunctions;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LoopsExercises {

    public static void main(String[] args) {

        // 1. Imprime los números del 1 al 10 usando while.
        int index = 1;
        while (index <= 10) {
            System.out.println(index);
            index++;
        }

        // 2. Usa do-while para mostrar todos los valores de un ArrayList.
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);
        int i = 0;

        do {
            System.out.println(numeros.get(i));
            i++;
        } while (i < numeros.size());

        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.
        for (int in = 1; in <= 50; in++) {
            if (in % 5 == 0 ) {
                System.out.println(in);
            }
        }

        // 4. Recorre un Array de 5 números e imprime la suma total.
        int[] numbers = {1,2,3,4,5};
        int suma = 0;
        for (int j = 0; j <= numbers.length; j++) {
            suma += j;
        }
        System.out.println(suma);

        // 5. Usa un for para recorrer un Array y mostrar sus valores.
        String[] names = {"Nia", "I", "Love", "you", "this", "much"};
        for (int j = 0; j < names.length; j++) {
            System.out.println(names[j]);
        }
        // 6. Usa for-each para recorrer un HashSet y un HashMap.
        HashSet<String> pilotos = new HashSet<>();
        pilotos.add("Alonso");
        pilotos.add("Verstappen");
        pilotos.add("Sainz");
        pilotos.add("Leclerc");
        pilotos.add("Russell");
        pilotos.add("Hamilton");

        HashMap<String, Integer> pilotosDorsal = new HashMap<>();
        pilotosDorsal.put("Alonso", 14);
        pilotosDorsal.put("Verstappen", 1);
        pilotosDorsal.put("Sainz", 55);
        pilotosDorsal.put("Leclerc", 16);
        pilotosDorsal.put("Russell", 63);
        pilotosDorsal.put("Hamilton", 44);

        for (String piloto:pilotos) {
            System.out.println(piloto);
        }

        for (Map.Entry<String,Integer> dorsales : pilotosDorsal.entrySet()) {
            System.out.println(dorsales.getKey());
            System.out.println(dorsales.getValue());
            System.out.println(dorsales);
        }
        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.
        for (int j = 10; j > 0; j--) {
            System.out.println(j);
        }

        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.
        for (int j = 1; j <= 20; j++) {
            if (j % 3 == 0) {
                continue;
            }
            System.out.println(j);
        }
        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un array.
        int[] enteros = {1, 4,-56,231,-3123, 1234};
        for (int j = 0; j < enteros.length; j++) {
            if (enteros[j] < 0) {
                System.out.println("Se ha encontrado un numero negativo. Se detiene la ejecucion del bucle");
                break;
            }
            System.out.println(enteros[j]);
        }

        // 10. Crea un programa que calcule el factorial de un número dado.
        long factorial =Integer.parseInt(JOptionPane.showInputDialog("Dame un entero:"));
        long resultado=1;
        if (factorial < 0) {
            System.out.println("No existe factorial de números negativos");
        }
        for (long j = factorial; j > 1;  j--) {
            resultado *= j;
        }
        System.out.println("El factorial de: " + factorial + " es: " +resultado);
    }
}
