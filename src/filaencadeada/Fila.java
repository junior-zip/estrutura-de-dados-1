package filaencadeada;

public class Fila<T> {

    private No<T> inicio;
    private No<T> fim;


    public Fila() {
    }


    public Fila(No<T> inicio, No<T> fim) {
        this.inicio = inicio;
        this.fim = fim;
    }

    public No<T> getInicio() {
        return inicio;
    }

    public void setInicio(No<T> inicio) {
        this.inicio = inicio;
    }

    public No<T> getFim() {
        return fim;
    }

    public void setFim(No<T> fim) {
        this.fim = fim;
    }

    public void inserir(T elemento){
        No<T> no = new No<>(elemento);

        if(inicio == null){

            System.out.println("A Fila está vazia!");

            inicio = no;
            fim = no;


        }else{
            fim.setProximo(no);
            fim = fim.getProximo();

        }

        System.out.println(" Elemento inserido na fila");

    }

    public void consultar (){

        if(inicio == null){
            System.out.println("A fila está vazia");

        }else{
            No<T> aux = inicio;
            System.out.print("Fila:");
            System.out.println();
            while (aux != null){

                System.out.print("(" +aux.getValor() + "), ");
                System.out.print("");
                aux = aux.getProximo();

            }

        }

    }


    public void remover (){

        if(inicio == null ){

            System.out.println("A lista está vazia");
        }else{
            inicio = inicio.getProximo();

        }

    }

    public void Esvaziar(){
        if(inicio == null){

            System.out.println("A lista já está vazia!");


        }else{

            inicio = null;
            fim = null;

        }

    }

    @Override
    public String toString() {
        if(inicio == null){
            System.out.println("A lista está vazia");
        }
            No<T> atual = inicio;

            while (atual.getProximo() != null) {
                atual = atual.getProximo();
                System.out.print(atual.getValor() + ", ");
            }

            return "Lista{" +
                    "primeiro=" + atual +
                    '}';

    }

}
