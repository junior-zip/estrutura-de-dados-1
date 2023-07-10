package filaDuplamente;

public class FilaDuplamente<T> {

    private No<T> inicio;
    private No<T> fim;
    private int tamanho;

    public FilaDuplamente() {

    }

    public FilaDuplamente(No<T> inicio, No<T> fim, int tamanho) {
        this.inicio = inicio;
        this.fim = fim;
        this.tamanho = tamanho;
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

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void inserir(T elemento){

        No<T> no = new No<>(elemento);

        if(inicio == null){

            System.out.println("A Fila está vazia: Primeiro elemento inserido!");
            inicio = no;
            no.setProximo(null);
            no.setAnterior(null);
            fim = no;


        }else{
            fim.setProximo(no);
            fim.setAnterior(fim);
            fim = fim.getProximo();

        }

        System.out.println(" Elemento inserido na fila");

    }


    public void remover (){

        if(inicio == null ){

            System.out.println("A lista está vazia");
        }else{
            inicio = inicio.getProximo();


        }

    }


}
