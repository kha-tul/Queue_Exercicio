package dio.queue.exercicio;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class exercicio_Queue {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();
            fila.add("Juliana");
            fila.add("Pedro");
            fila.add("Carlos");
            fila.add("Larissa");
            fila.add("João");
            fila.add("Daniel");

        System.out.println(fila);

        for (String client : fila){
            System.out.println(client);
        }

        Iterator<String> iteratorFila = fila.iterator();
        while (iteratorFila.hasNext()){
            System.out.println("-->" + iteratorFila.next());
        }

        System.out.println(fila.size());

        System.out.println(fila.isEmpty());

        String primeiroCliente = fila.peek();
        System.out.println(primeiroCliente);

        String clientePrimeiro = fila.poll();
        System.out.println(clientePrimeiro);

        System.out.println(fila.isEmpty());

        boolean temCarlos = fila.contains("Carlos");
        System.out.println(temCarlos);


    }
}
