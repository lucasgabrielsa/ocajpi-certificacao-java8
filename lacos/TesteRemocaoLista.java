import java.util.*;

class TesteRemocaoLista {
    public static void main(String[] args) 
    {   
        List<String> nomes = new ArrayList<String>();
        nomes.add("Lucas");
        nomes.add("Thiago");
        nomes.add("Tálita");
        nomes.add("Maria Eddy");


        //tentando remover nomes da lista
        for (String name : nomes) {
            name = null;
        }
        //o que imprime abaixo?
        for (String name : nomes) {
            System.out.println(name);
        }
        


    }
}
