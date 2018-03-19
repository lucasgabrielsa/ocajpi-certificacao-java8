import java.util.*;

class TesteIterator {
    public static void main(String[] args) 
    {   
        List<String> nomes = new ArrayList<String>();
        nomes.add("Lucas");
        nomes.add("Thiago");
        nomes.add("Tálita");
        nomes.add("Maria Eddy");

        for(Iterator<String> iterator = nomes.iterator(); iterator.hasNext();) {
            String nome = iterator.next();
            System.out.println(nome);
        }

    }
}
