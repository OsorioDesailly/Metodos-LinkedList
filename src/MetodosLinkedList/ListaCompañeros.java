
package MetodosLinkedList;

import java.util.LinkedList;

public class ListaCompañeros {
    public static void main(String[] args) {
        LinkedList<String> alumnos = new LinkedList<>();
        alumnos.add("ALEJANDREZ CORONA DIEGO ALEZANDRO");
        alumnos.add("ALVAREZ PERALES HARUMI REGINA");
        alumnos.add("CARRIZALES SANCHEZ ARMANDO SAUL");
        alumnos.add("CINTO GONZALEZ MIGUEL ANGEL");
        alumnos.add("GONZALEZ HERNANDEZ VICTOR DANIEL");
        alumnos.add("HIGUERA JIMENEZ LUIS ANTONIO");
        alumnos.add("LIRA HERNANDEZ ERICK");
        alumnos.add("MARTINEZ ALVAREZ ANGEL ADRIAN");
        alumnos.add("MARTINEZ DIAZ MISAID MICHEL");
        alumnos.add("MORENO CORREA JOHAN ALESSANDRO");
        alumnos.add("OROPEZA SANTIAGO EDUARDO");
        alumnos.add("OSORIO GOMEZ DESAILLY");
        alumnos.add("VALDEZ ARROYO JACK DONALDO");
        System.out.println("=== LISTA INICIAL DE COMPAÑEROS ===");
        System.out.println(alumnos);
        System.out.println("Total de alumnos: " + alumnos.size());
        System.out.println("Primer alumno: " + alumnos.getFirst());
        System.out.println("Ultimo alumno: " + alumnos.getLast());
        System.out.println("Alumno en la posicion 2: " + alumnos.get(2));
        String buscando = "LIRA HERNANDEZ ERICK";
        System.out.println("¿Esta " + buscando + "? " + alumnos.contains(buscando));
        alumnos.addFirst("Pedrito");
        System.out.println("Se agrego un alumno al inicio:");
        System.out.println(alumnos);
        alumnos.addLast("Paquito");
        System.out.println("Se agrego un alumno al final:");
        System.out.println(alumnos);
        alumnos.set(1, "Luisito");
        System.out.println("Se modifico el elemento de la posicion 1:");
        System.out.println(alumnos);
        String alumnoPolled = alumnos.poll();
        System.out.println("Elemento eliminado: " + alumnoPolled);
        String eliminadoPrimero = alumnos.removeFirst();
        System.out.println("Alumno eliminado: " + eliminadoPrimero);
        String eliminadoUltimo = alumnos.removeLast();
        System.out.println("Alumno eliminado: " + eliminadoUltimo);
        System.out.println("Lista despues de las eliminaciones:");
        System.out.println(alumnos);
        System.out.println("Tamaño actual: " + alumnos.size());
        alumnos.clear();
        System.out.println("Se limpio la lista.");
        System.out.println("¿La lista esta vacia? " + alumnos.isEmpty());
        System.out.println("Estado final de la lista: " + alumnos);
    }
}
