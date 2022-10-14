import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class ListApp {
    public static void main(String[] args) {
     // List notas = new ArrayList<>() //antes do java 5;

     List<Gato> meusGatos = new ArrayList<Gato>(){{
        add(new Gato("John", "tigrado", 18 ));
        add(new Gato("Simba", "Black", 6 ));
        add(new Gato("John", "Marron", 12 ));
    }};

    /*Ordenacao de elementos de um array list*/
    System.out.println("Ordem de insercao");
    System.out.println(meusGatos);

    System.out.println("Ordem natural (Nome)");
    Collections.sort(meusGatos);
    System.out.println(meusGatos);

    //EXIBIR NA ORDEM ALEATORIA
    Collections.shuffle(meusGatos);
    System.out.println("---\tBaguçado\t---");
    System.out.println(meusGatos);


    //Comprar por idade
    System.out.println("---\tComparar por idade\t---");
    // Collections.sort(meusGatos, new ComparatorIdade());
    meusGatos.sort(new ComparatorIdade());
    System.out.println(meusGatos);

     //Comprar por cor
     System.out.println("---\tComparar por cor\t---");
     // Collections.sort(meusGatos, new ComparatorCor());
     meusGatos.sort(new ComparatorCor());
     System.out.println(meusGatos);


    //Comprar por Nome, cor e idade
    System.out.println("---\tComparar por Nome, cor e idade\t---");
    // Collections.sort(meusGatos, new ComparatorNomeCorIdade());
    meusGatos.sort(new ComparatorNomeCorIdade());
    System.out.println(meusGatos);
    
}
}



class Gato implements Comparable<Gato>{

private String nome;
private String cor;
private int idade;

public Gato(String nome, String cor, int idade) {
    this.nome = nome;
    this.cor = cor;
    this.idade = idade;
}

public String getNome() {
    return nome;
}

public String getCor() {
    return cor;
}

public int getIdade() {
    return idade;
}

@Override
public String toString() {
    return "{ nome=" + nome + ", cor=" + cor + ", idade=" + idade + "}";
}

@Override
public int compareTo(Gato gato) {
    return this.getNome().compareToIgnoreCase(gato.getNome());
}



}

class ComparatorIdade implements Comparator<Gato>{

@Override
public int compare(Gato g1, Gato g2) {
    return Integer.compare(g1.getIdade(), g2.getIdade());
}

}

class ComparatorCor implements Comparator<Gato>{

@Override
public int compare(Gato g1, Gato g2) {
    return (g1.getCor()).compareToIgnoreCase(g2.getCor());   
 }

}

class ComparatorNomeCorIdade implements Comparator<Gato>{

@Override
public int compare(Gato g1, Gato g2) {
    int nome =  g1.getNome().compareToIgnoreCase(g2.getNome());  
    if(nome != 0) return nome; 

    int cor =  g1.getCor().compareToIgnoreCase(g2.getCor());  
    if(cor != 0) return cor; 

    return Integer.compare(g1.getIdade(), g2.getIdade());

}

}