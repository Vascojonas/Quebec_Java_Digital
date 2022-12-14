package Set;

import java.util.Set;
import java.util.HashSet;
import java.util.Objects;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Comparator;
public class OrdenacaoSet {

    public static void main(final String[] args) {
        System.out.println("Ordenacao aletatoria");

        final Set<Serie> minhasSeries = new HashSet<Serie>(){{
            add(new Serie("got","fantasia", 60));
            add(new Serie("dark","drama", 60));
            add(new Serie("that  70s show","comedia", 25));
        }};


        for (final Serie serie : minhasSeries) {
            System.out.println(serie.getNome() +" - "+ serie.getGenero() +" - "+serie.getTempoEpisodio());        
        }
        System.out.println("___________________________________________________________________________________");
       
        System.out.println("Ordenacao de Natural");

        final Set<Serie> minhasSeries1 = new LinkedHashSet<Serie>(){{
            add(new Serie("got","fantasia", 60));
            add(new Serie("dark","drama", 60));
            add(new Serie("that  70s show","comedia", 25));
        }};


        for (final Serie serie : minhasSeries1) {
            System.out.println(serie.getNome() +" - "+ serie.getGenero() +" - "+serie.getTempoEpisodio());        
        }

        System.out.println("___________________________________________________________________________________");
       
        System.out.println("Ordenacao de Natural (Tempo episodio)");

        final Set<Serie> minhasSeries2 = new TreeSet<Serie>(minhasSeries1);

        for (final Serie serie : minhasSeries2) System.out.println(serie.getNome() +" - "+
         serie.getGenero() +" - "+serie.getTempoEpisodio());        
        

         System.out.println("___________________________________________________________________________________");
       
         System.out.println("Ordem Nome/Genero/TempoEpisodio");
 
         final Set<Serie> minhasSeries3 = new TreeSet<Serie>(new ComparatoNomeGeneroTempoEpisodio());
            
          minhasSeries3.addAll(minhasSeries); 
         for (final Serie serie : minhasSeries3) {
             System.out.println(serie.getNome() +" - "+ serie.getGenero() +" - "+serie.getTempoEpisodio());        
         }

        
    }

    
}

class ComparatoNomeGeneroTempoEpisodio implements Comparator<Serie>{

    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if(nome != 0) return nome;
        
        int genero = s1.getGenero().compareTo(s2.getGenero());
        if(genero != 0) return genero;

        return  Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }

    
} 



class Serie implements Comparable<Serie>  {
    private String nome;
    private String genero;
    private Integer tempoEpisodio;


    public Serie(final String nome, final String genero, final Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(final String nome) {
        this.nome = nome;
    }


    public String getGenero() {
        return genero;
    }


    public void setGenero(final String genero) {
        this.genero = genero;
    }


    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }


    public void setTempoEpisodio(final Integer tempoEpisodio) {
        this.tempoEpisodio = tempoEpisodio;
    }


    @Override
    public String toString() {
        return "Serie [nome=" + nome + ", genero=" + genero + ", tempoEpisodio=" + tempoEpisodio + "]";
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((genero == null) ? 0 : genero.hashCode());
        result = prime * result + ((tempoEpisodio == null) ? 0 : tempoEpisodio.hashCode());
        return result;
    }


    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Serie other = (Serie) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (genero == null) {
            if (other.genero != null)
                return false;
        } else if (!genero.equals(other.genero))
            return false;
        if (tempoEpisodio == null) {
            if (other.tempoEpisodio != null)
                return false;
        } else if (!tempoEpisodio.equals(other.tempoEpisodio))
            return false;
        return true;
    }


    @Override
    public int compareTo(final Serie serie) {
        final int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
   
        if(tempoEpisodio != 0) return tempoEpisodio;
        
        return  this.getGenero().compareTo(serie.getGenero());
    }


    
    
    
}
