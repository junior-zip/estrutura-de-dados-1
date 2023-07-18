package ListaDuplamente;

public class Main {

    public static void main(String[] args) throws Exception {

        ListaDupla<String> lista = new ListaDupla<>();


        lista.inserir("AC");
        lista.inserir("BA");
        lista.inserir("RJ");
        lista.inserir("TO");
         lista.remover(1);
         System.out.println(lista);
        lista.incluir("Ms", 2);
        System.out.println(lista.getPosicao("TO"));
        System.out.println(lista);
        System.out.println("A lista tem: " + lista.getTamanho() + " itens");
        System.out.println(lista);
        System.out.println(lista.subLista(1, 3));



    }


}
