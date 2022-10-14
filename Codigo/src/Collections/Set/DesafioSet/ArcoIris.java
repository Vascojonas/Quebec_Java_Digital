package Set.DesafioSet;

import java.util.*;


public class ArcoIris {
    public static void main(String[] args) {

        Set<String> cores = new LinkedHashSet<String>(
            Arrays.asList("Vermelho", "Laranja", "amarelo", "verde", "azul", "anil", "violeta"));

        System.out.println("Exiba todas as cores uma abaixo da outra ");
        for (String core : cores) {
            System.out.println(core);
        }

        System.out.println("___________________________________________________________________________________");

            
        System.out.println(" A quantidade de cores que o arco-íris tem R: "+ cores.size());

        System.out.println("___________________________________________________________________________________");

         Set<String> cores2 = new TreeSet<String>(cores);

         System.out.println("Exiba as cores em ordem alfabética");
         for (String core : cores2) {
             System.out.println(core);
         }

         System.out.println("Exiba as cores na ordem inversa da que foi informada ");
         Set<String> coresArcoIris3 = new LinkedHashSet<>(
                 Arrays.asList("violeta", "anil", "azul", "verde", "amarelo", "laranja", "vermelho"));
         System.out.println(coresArcoIris3);
         List<String> coresArcoIrisList = new ArrayList<>(coresArcoIris3);
        
         Collections.reverse(coresArcoIrisList);
         System.out.println(coresArcoIrisList);
 
         System.out.println("Exiba todas as cores que começam com a letra ”v”: ");
         for (String cor: cores) {
             if(cor.startsWith("v")) System.out.println(cor);
         }
 
         System.out.println("Remova todas as cores que não começam com a letra “v”: ");
         Iterator<String> iterator2 = cores.iterator();
         while (iterator2.hasNext()) {
             if (!iterator2.next().startsWith("v")) iterator2.remove();
         }
         System.out.println(cores);
 
         System.out.println("Limpe o conjunto: ");
         cores.clear();
 
         System.out.println("Confira se o conjunto está vazio: " + cores.isEmpty());


    }
    


}


class CompareCore implements Comparator<String>{

    @Override
    public int compare(String c1, String c2) {
       
        return c1.compareTo(c2);
    }

}

// Crie um conjunto contendo as cores do arco-íris e:

// Exiba todas as cores uma abaixo da outra

// A quantidade de cores que o arco-íris tem

// Exiba as cores em ordem alfabética

// Exiba as cores na ordem inversa da que foi informada

// Exiba todas as cores que começam com a letra ”v”

// Remova todas as cores que não começam com a letra “v”

// Limpe o conjunto

// Confira se o conjunto está vazio
