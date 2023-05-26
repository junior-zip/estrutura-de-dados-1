package ListaDuplamente;


import listaencadeada.no;

public class ListaDupla<T> {

    private No<T> inicio;
    private No<T> fim;
    private int tamanho;

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

    public ListaDupla() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }


    public void inserir(T valor){

        No<T> no  = new No<>(valor);

        no.setProximo(null);
        no.setAnterior(fim);

        if(inicio == null){
            inicio = no;

        }

        if(fim != null){
            fim.setProximo(no);

        }

        fim = no;
        tamanho ++;
    }

    public ListaDupla<T> subLista(int inicioLista, int fimLista){

        ListaDupla<T> lista2 = new ListaDupla<T>();

        No<T> local = inicio;


        for(int i = 0; i < fimLista; i ++){

            if(i > inicioLista){

                lista2.inserir(local.getValor());

            }

            local = local.getProximo();

        }


        return lista2;

    }

    public void incluir(T elemento, int posicao){

        No<T> local = new No<T>();

        for(int i = 0; i < posicao && local != null; i ++ ){

            local = local.getProximo();

        }

        No<T> no = new No<T>(elemento);

        no.setProximo(local);

        if(no.getProximo() != null){
            no.setAnterior(local.getAnterior());
            no.getProximo().setAnterior(no);
        }else{
            no.setAnterior(fim);
            fim = no;
        }


        if(posicao == 0 ){
            inicio = no;

        }else{
            no.getAnterior().setProximo(no);
        }

        tamanho ++;

    }

    @Override
    public String toString() {

        No<T> no = inicio;
        String strbuf = "";

        for(int i = 0; i < this.tamanho; i++){

            if(no != null){
                strbuf += "(" + no.getValor() + "), ";
                no = no.getProximo();

            }

        }

        return strbuf;
    }







}
