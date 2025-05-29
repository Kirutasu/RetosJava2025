package MD5_structures;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class StructuresExercises {

    public static void main(String[] args) {

        // 1. Crea un Array con 5 valores e imprime su longitud.
        int[] values = new int[5];
        System.out.println("La longitud del array creado es: " + values.length);

        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.
        System.out.println("El valor de la posicion 0 del array es: " + values[0]);
        values[0] = 2;
        System.out.println("El nuevo valor de la posicion 0 del array es: " + values[0]);

        // 3. Crea un ArrayList vacío.
        ArrayList<String> names = new ArrayList<>();
        System.out.println("¿Está el ArrayList names vacío?: " + names.isEmpty());

        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.
        names.add("Nia");
        names.add("Mitiko");
        names.add("Kiru");
        names.add("Fugaz");
        System.out.println("Ahora el Arraylist names tiene en su contenido: " + names);
        names.remove("Kiru");
        System.out.println("Kiru ha sido borrado del ArrayList names: " + names);

        // 5. Crea un HashSet con 2 valores diferentes.
        HashSet<String> weAreThis = new HashSet<>();
        weAreThis.add("MitikoYFugaz");
        weAreThis.add("I miss this");
        System.out.println("Mostrando el HashSet weAreThis: " + weAreThis);

        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.
        weAreThis.add("MitikoYFugaz");
        weAreThis.add("We will get through this");

        // 7. Elimina uno de los elementos del HashSet.
        weAreThis.remove("I miss this");
        System.out.println("weAreThis queda de la siguiente manera tras añadir un valor repetido, otro nuevo y borrar un elemento: " + weAreThis);

        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.
        HashMap<String, Integer> namesPhones = new HashMap<>();
        namesPhones.put("Kiru", 621123123);
        namesPhones.put("Nia", 641123123);
        namesPhones.put("MitiKoYFugaz", 651123123);
        System.out.println("HashMap de nombres y numeros de telefono: " + namesPhones);

        // 9. Modifica uno de los contactos y elimina otro.
        namesPhones.replace("Kiru", 611123123);
        namesPhones.remove("MitiKoYFugaz");
        System.out.println("HashMap namesPhones tras modificar un valor y borrar un contacto: " + namesPhones);

        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.
        //Transformando en ArrayList
        String[] frutas = {"manzana", "banana", "naranja", "manzana", "uva", "banana"};
        ArrayList<String> frutasList = new ArrayList<>();

        for (int i = 0; i < frutas.length; i++) {
            System.out.println("En la posicion " + i + " del array, el contenido es: " + frutas[i]); // para imprimir el array cada vez que el bucle lo recorre
            frutasList.add(frutas[i]);
        }

        System.out.println("El ArrayList queda creado y su contenido es: " + frutasList);

        //transformando el ArrayList en un HashShet
        HashSet<String> frutasHashSet = new HashSet<>();

        for (int i = 0; i < frutasList.size(); i++) {
            frutasHashSet.add(frutasList.get(i));
        }
        System.out.println("El HashSet queda de la siguiente manera: " + frutasHashSet);

        //transformando el HashSet en un HashMap
        HashMap<String, String> frutasMap = new HashMap<>();

        for (String fruta: frutasHashSet) { //no tenemos indices, pero lo recorre entero como si buscara en una bolsa, por tanto damos un "nombre" a cada elemento que "saque" y lo ponemos en el map
            frutasMap.put(fruta, fruta);
        }

        System.out.println("El HashMap quedará de la siguiente forma: " + frutasMap);

    }


}
