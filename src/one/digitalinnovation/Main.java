package one.digitalinnovation;

public class Main {

    public static void main(String[] args) {
        ListaCircular<String> minhaLista = new ListaCircular<>();


        minhaLista.add("teste1");
        minhaLista.add("teste2");
        minhaLista.add("teste3");
        minhaLista.add("teste4");
        minhaLista.add("teste5");


        minhaLista.remove(2);

        minhaLista.remove(0);
        minhaLista.remove(0);
        minhaLista.remove(0);
        minhaLista.remove(0);

        minhaLista.add("teste5");
        minhaLista.add("teste4");
        minhaLista.add("teste3");
        minhaLista.add("teste2");
        minhaLista.add("teste1");

        

        System.out.println(minhaLista);


        
        System.out.println(minhaLista.get(99));
    }

}
