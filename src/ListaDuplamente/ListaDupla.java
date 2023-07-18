package ListaDuplamente;

import lista.Listas;
import listaencadeada.no;

public class ListaDupla<T extends Comparable<T>>  extends Listas<T> {

    private No<T> inicio;
    private No<T> fim;
    private int tamanho;

    public ListaDupla() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
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

    public void inserirInicio(T valor) throws Exception{
        No<T> no = new No<>(valor);

        no.setProximo(inicio);
        no.setAnterior(null);

        if(inicio == null){
            no.setProximo(null);
        }

        inicio = no;
        tamanho++;
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

     //aplicavel no papel
    public void incluir(T elemento, int posicao) throws Exception{
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

    //retorna o valor
    public  T get(int posicao) throws Exception{
        No<T> aux;

        aux = inicio;

        if(inicio != null){
            for(int i = 0; i < posicao; i++){

                aux = aux.getProximo();

            }
            if(posicao == 0){

                return inicio.getValor();

            }else{
                return aux.getValor();
            }
        }else{

            throw new Exception("Sem valor para acessar!");

        }
    }

    //retorna a posicao

    public int getPosicao(T elemento) {
        int count = 0;
        No<T> aux = inicio;

        while (aux != null) {
            if (aux.getValor().equals(elemento)) {
                return count;

            }

            aux = aux.getProximo();
            count++;
        }

        // Elemento não encontrado na lista
        return -1;
    }

    public void remover(int posicao){
        No<T> aux = inicio;

        if(posicao == 0) {

            inicio = inicio.getProximo();

        }else{

            for(int i=0; i < posicao; i++){
                aux = aux.getProximo();
            }
            if(aux.getProximo() == null){
                fim = fim.getAnterior();
                fim.setProximo(null);
            }else {
                aux.getProximo().setAnterior(aux.getAnterior());
                aux.getAnterior().setProximo(aux.getProximo());
            }
        }

        tamanho--;
    }

    public void limpar() throws Exception{
        if(tamanho == 0){
            throw new Exception("Lista vazia: Já está vazia");
        }else {
            inicio.setProximo(null);
            inicio.setAnterior(null);
            inicio = null;
            tamanho = 0;
        }
    }

    public boolean contem(T elemento){
        No<T> aux = inicio;

        while( aux != null){
            if(aux.getValor().equals(elemento)){
                return true;
            }
            aux = aux.getProximo();

        }
        return false;
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