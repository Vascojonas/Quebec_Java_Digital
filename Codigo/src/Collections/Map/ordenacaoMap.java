package Map;
import java.util.*;
import java.util.Map.Entry;
public class ordenacaoMap {
    

    public static void main(String[] args) {
        
        Map<String, Livro> meusLivros = new HashMap<String, Livro>(){{
            put("Haking, Stephen", new Livro("Uma breve Historia do tempo", 256));
            put("Dubigg, Chales", new Livro("O poder do habito", 408));
            put("Herari, Yuval Noah", new Livro("21 Lições para o seculo 21", 432));
        }};


        System.out.println("Imprima na ordem aleatoria: ");
        System.out.println();
        for (Map.Entry<String, Livro> livro:meusLivros.entrySet()){
            System.out.println(livro.getKey()+" - "+ livro.getValue().getNome());
        } 

        System.out.println();
        System.out.println("Imprima na ordem de insercao: ");
        System.out.println();

        Map<String, Livro> meusLivros1 = new LinkedHashMap<String, Livro>(){{
            put("Haking, Stephen", new Livro("Uma breve Historia do tempo", 256));
            put("Dubigg, Chales", new Livro("O poder do habito", 408));
            put("Herari, Yuval Noah", new Livro("21 Lições para o seculo 21", 432));
        }};

        for (Map.Entry<String, Livro> livro:meusLivros1.entrySet()){
            System.out.println(livro.getKey()+" - "+ livro.getValue().getNome());
        } 

        System.out.println();
        System.out.println("Ordena segundo a ordem alfabetica dos autores");
        System.out.println();

        Map<String, Livro> meusLivros2 = new TreeMap<String, Livro>(){{
            put("Haking, Stephen", new Livro("Uma breve Historia do tempo", 256));
            put("Dubigg, Chales", new Livro("O poder do habito", 408));
            put("Herari, Yuval Noah", new Livro("21 Lições para o seculo 21", 432));
        }};

        for (Map.Entry<String, Livro> livro:meusLivros2.entrySet()){
            System.out.println(livro.getKey()+" - "+ livro.getValue().getNome());
        } 

        System.out.println();
        System.out.println("Ordem alfabetica dos nomes e dos livros: ");
        System.out.println();

        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<Map.Entry<String, Livro>>(new ComparatorNome());
        
        meusLivros3.addAll(meusLivros.entrySet());
       
        for (Map.Entry<String, Livro> livro:meusLivros3){
            System.out.println(livro.getKey()+" - "+ livro.getValue().getNome());
        } 


        System.out.println();
        System.out.println("Ordem numero de paginas: ");
        System.out.println();

        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<Map.Entry<String, Livro>>(new ComparatorPagina());
        
        meusLivros4.addAll(meusLivros.entrySet());
       
        for (Map.Entry<String, Livro> livro:meusLivros4){
            System.out.println(livro.getKey()+" - "+ livro.getValue().getNome()+" paginas "+ livro.getValue().getPaginas());
        } 

    }
}


class ComparatorPagina implements Comparator <Map.Entry<String, Livro>>{

    @Override
    public int compare(Entry<String, Livro> l1, Entry<String, Livro> l2) {
        return Integer.compare(l1.getValue().getPaginas(), l2.getValue().getPaginas());
    }

}
class ComparatorNome implements Comparator <Map.Entry<String, Livro>>{

    @Override
    public int compare(Entry<String, Livro> l1, Entry<String, Livro> l2) {


        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }

}


class Livro{
    private String nome;
    private Integer paginas;

    

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getPaginas() {
        return paginas;
    }
    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((paginas == null) ? 0 : paginas.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Livro other = (Livro) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (paginas == null) {
            if (other.paginas != null)
                return false;
        } else if (!paginas.equals(other.paginas))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Livro [nome=" + nome + ", paginas=" + paginas + "]";
    }

    

    
}
