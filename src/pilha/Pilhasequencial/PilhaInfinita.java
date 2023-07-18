package pilha.Pilhasequencial;

import pilha.IPilha;
import pilha.PilhaCheiaException;
import pilha.PilhaVaziaException;

import java.util.Arrays;

public class PilhaInfinita<T> implements IPilha {

    private int tamanho;
    private T[] lista;

    private int topo;
    private int count;

    public PilhaInfinita(int tamanho){
        this.tamanho = tamanho;
        this.lista = (T[]) new Object[tamanho];
        topo = 0;
        count = 0;

    }

    @Override
    public void empilhar(Object valor) throws PilhaCheiaException {

        if(count == lista.length ){
            aumentarPilha(lista.length);
        }

        lista[topo] = (T) valor;
        count++;
        topo++;

    }

    @Override
    public Object desempilhar() throws PilhaVaziaException {
        return null;
    }

    @Override
    public Object getTopo() throws PilhaVaziaException {
        return null;
    }

    @Override
    public int getQtd() {
        return count;
    }

    @Override
    public boolean estahVazia() {
        return false;
    }

    public void aumentarPilha(int quantidade){
        this.lista = Arrays.copyOf(this.lista,(2*quantidade));
    }


}
