import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class SetApp {

    public static void main(String[] args) {
        Set<Double> notas = new HashSet<>(Arrays.asList(7d,8.5,9.3,5d,0d, 7d,3.6));
        System.out.println(notas);
        System.out.println("Exiba a menor nota: "+ Collections.min(notas));
        System.out.println("Exiba a maior nota: "+ Collections.max(notas));



        Iterator<Double> iterator = notas.iterator();

        Double soma =0.0;
        while(iterator.hasNext()){
            soma += iterator.next();
        }

        System.out.println("A soma dos elementos e: "+ soma);
        System.out.println("A media dos elementos e: "+ soma/notas.size());

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);


        // para eliminar notas.clear();


        
    }
    
}
