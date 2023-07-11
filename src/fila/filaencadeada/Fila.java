package fila.filaencadeada;
import fila.FilaCheiaException;
import fila.FilaVaziaException;
import fila.Ifila;

public class Fila<T> implements Ifila {

    private No<T> inicio;
    private No<T> fim;
    private int count;
    private int posicoes;

    public Fila(int posicoes) {
        this.count = posicoes;
        this.posicoes = posicoes;

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
    @Override
    public void incluir(Object elemento) throws FilaCheiaException{
         No<T> no = (No<T>) new No<>(elemento);

        if(count != 0){
            if(inicio == null){
                inicio = no;
                fim = no;
                count--;
            }else{
                fim.setProximo(no);
                fim = fim.getProximo();
                count --;
            }

        }else{
            throw new FilaCheiaException("Fila Cheia");
        }
    }
    public void consultar () throws FilaVaziaException{

        if(inicio == null){
            throw new FilaVaziaException("Fila Vazia");

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

    @Override
    public T remover ()  throws FilaVaziaException{

        No<T> excluir = inicio;
        if(inicio == null ){
            throw new FilaVaziaException("Fila Vazia");
        }else{
            inicio = inicio.getProximo();

        }
        count++;
        return (T) excluir;
    }
    @Override
    public int getQtd() {
        return posicoes - count;
    }

    @Override
    public int getQtdMaxSuportada() {
        return posicoes;
    }

    @Override
    public boolean estaVazia() {
        if(count == posicoes){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Object visualizarProximo() throws FilaVaziaException {
       No<T> proximo = inicio.getProximo();
        if(count == posicoes){
            throw new FilaVaziaException("Fila Vazia");
        }else{
            return proximo.getValor();
        }
    }

    @Override
    public void limpar(){
        if(inicio == null){
            System.out.println("A lista já está vazia!");
        }else{
            inicio = null;
            fim = null;

        }
    }
}
