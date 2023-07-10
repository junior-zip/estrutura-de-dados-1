package fila.filaSequencial;

import fila.FilaCheiaException;
import fila.FilaVaziaException;
import fila.Ifila;


//Fila sequencial com posições ao contrário

public class FilaSequencial <T> implements Ifila <T> {
    private T[] lista;
    private int inicio;
    private int fim;
    private int posicoes;

    private int count;

    public FilaSequencial(int tamanho) {
        this.lista = (T[]) new Object[tamanho];
        this.fim = lista.length -1;
        this.inicio = fim;
        this.posicoes = tamanho;

    }
    public T[] getLista() {
        return lista;
    }

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public int getFim() {
        return fim;
    }

    public void setFim(int fim) {
        this.fim = fim;
    }

    @Override
    public void incluir(T valor ) throws FilaCheiaException{

        if(lista[fim] != null){
            throw new FilaCheiaException("Fila cheia");

        }

        lista[fim] = (T) valor;
        this.fim = (this.fim-1 +lista.length) % lista.length;
        count++;
    }

    //11 + 12  % 12 == 11
    //10 + 12 % 12 == 10
    //9 + 12 % 12 == 9
    public T remover() throws FilaVaziaException{
       T elemento =   lista[inicio];

        if(lista[inicio] == null){
            throw new FilaVaziaException("Fila Vazia");
        }

        lista[inicio] = null;
        this.inicio = (this.inicio -1 + lista.length) % lista.length;
        count--;
        return elemento;
    }

    @Override
    public int getQtd() {
        return count;
    }

    @Override
    public int getQtdMaxSuportada() {
        return posicoes;
    }

    @Override
    public boolean estaVazia() {
        if(count == 0){

            return true;

        }else{
            return false;
        }

    }

    @Override
    public void limpar() {

        for (int i = 0; i < lista.length; i++) {

            lista[i] = null;

        }
            count = 0;
    }

    @Override
    public T visusalizarProximo() throws FilaVaziaException {
        return lista[fim -1];
    }
}
