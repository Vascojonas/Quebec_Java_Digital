package Map;

import java.util.*;
public class AppMap {

    public static void main(String[] args) {
        
        Map<String, Double> carrosPopulares = new HashMap<String, Double>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};

        System.out.println(carrosPopulares.toString());
        System.out.println("");
        System.out.println("Substitua o consumo do gol por 15.2");

        System.out.println("");

        carrosPopulares.put("gol", 12.2);

        System.out.println(carrosPopulares.toString());

        System.out.println("");

        System.out.println("Confira se o modelo tucson esta no dicionario "+carrosPopulares.containsKey("tucson"));

        System.out.println("");

        System.out.println("Confira se o modelo uno esta no dicionario "+carrosPopulares.containsKey("uno"));
        
        System.out.println(""); 

        System.out.println("Exiba o consumo de uno "+carrosPopulares.get("uno"));

        System.out.println();

        System.out.println("Exibir modelos: ");

        Set<String> modelos = carrosPopulares.keySet();

        System.out.println(modelos);

        System.out.println();
        System.out.println("Exiba os consumos dos carros: ");

        Collection <Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println();
        System.out.print("Exiba o modelo que mais consome seu consumo: ");

        Double maximoConsumo=Collections.max(carrosPopulares.values());
 
        Set<Map.Entry<String, Double>> entries =carrosPopulares.entrySet();
        
        String modelosMaisEficiente = "";
        for (Map.Entry <String,Double> entry : entries) {
            if(entry.getValue().equals(maximoConsumo)) modelosMaisEficiente=entry.getKey();
        }
        System.out.println(modelosMaisEficiente +" => " +maximoConsumo);

        System.out.print("Exiba a soma dos consumos: ");

        Iterator<Double> iterator = carrosPopulares.values().iterator();

        Double soma = 0d;
        while(iterator.hasNext()){
            soma += iterator.next();
        }

        System.out.println(soma);

        System.out.println("remove o modelos com o consumo igual a 15.6: ");

        Iterator<Double> it1 = carrosPopulares.values().iterator();
       
        System.out.println(carrosPopulares);
        while(it1.hasNext()){
            if(it1.next().equals(15.6)) it1.remove();
        }
        System.out.println(carrosPopulares);

        System.out.println();
        System.out.println("Exiba os carros na ordem em que foram informados: ");

        Map<String, Double> carrosPopulares1 = new LinkedHashMap<String, Double>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};


        System.out.println(carrosPopulares1);

        System.out.println();
        System.out.println("Exiba o dicionario ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<String, Double>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};

        System.out.println(carrosPopulares2);


        System.out.println();
        System.out.println("Apage dicionarrio de carros: ");
        carrosPopulares.clear();

        System.out.println();

        System.out.println("confira que o dionario esta vazio: "+ carrosPopulares.isEmpty());
        
        
    }
    
}
