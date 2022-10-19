package Stream;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI {


    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1","0", "4","1", "2","3","9", "6", "5");

       
        // numerosAleatorios.stream().forEach(new Consumer<String>() {
        //     @Override
        //     public void accept(String s){
        //         System.out.println();
        //     }
        // }
        // );

        //use lambda
        // numerosAleatorios.stream().forEach(
        //     s->System.out.println(s));

        // use reference method 
    //     numerosAleatorios.stream().forEach(
    //         System.out::println);
            
            // System.out.println("Pegue os 5 primeirios numeros ec coloque dentro de um set");

            // numerosAleatorios.stream()
            // .limit(5)
            // .collect(Collectors.toSet())
            // .forEach(  System.out::println);;


        // System.out.println("Transforme uma lista de strings em numeros inteiros: ");

        // List<Integer> collectList = numerosAleatorios.stream()
        // .map(Integer::parseInt)
        // .collect(Collectors.toList());


        // System.out.println("Numeros pares maiores que 2");
        // List<Integer> collectList = numerosAleatorios.stream()
        // .map(Integer::parseInt)
        // .filter(t -> (t %2 ==0 && t>2))
        // .collect(Collectors.toList());
        

        // System.out.println(collectList);


        // System.out.println("Mostre amedia dos numeros: ");

        // numerosAleatorios.stream()
        // .mapToInt(s-> Integer.parseInt(s))
        // .average()
        // .ifPresent(d -> System.out.println(d));


        System.out.println("remova os numeros impares");

        
        List<Integer> collectList = numerosAleatorios.stream()
        .map(Integer::parseInt)
        .collect(Collectors.toList());

        collectList.removeIf(i -> (i%2 == 1 ));

        System.out.println(collectList);




            
        

    }


    
}



class Pecas {
    
    private int codigo, n;
    private double valor;
    public Pecas(int codigo, int n, double valor) {
        this.codigo = codigo;
        this.n = n;
        this.valor = valor;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getN() {
        return n;
    }
    public void setN(int n) {
        this.n = n;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    

    
    
    
  }
