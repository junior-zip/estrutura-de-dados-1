package filaencadeada;

public class Main {
    public static void main(String[] args) {

        Fila<String> fila = new Fila<String>();

        fila.inserir("joao");
        fila.inserir("gabriel");
        fila.inserir("matheus");
        fila.inserir("tiago");
        fila.consultar();
        fila.remover();
        System.out.println();
        fila.consultar();
        System.out.println();
        System.out.print("valor do primeiro item da lista: " + fila.getInicio().getValor());

        fila.remover();
        System.out.println();
        fila.consultar();

        System.out.println();
        fila.Esvaziar();
        fila.consultar();














    }
}
