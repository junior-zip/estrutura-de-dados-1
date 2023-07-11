package pilha.Pilhasequencial;

import pilha.IPilha;
import pilha.PilhaCheiaException;
import pilha.PilhaVaziaException;

public class PilhaSequencial <T> implements IPilha<T> {

    private T[] lista;
    private int topo;

    private T num;
    private int qtd;

    private int tamanho;

    public PilhaSequencial(int tamanho) {
        this.tamanho = tamanho;
        this.lista = (T[]) new Object[tamanho];
        topo = 0;
    }

    public T[] getLista() {
        return lista;
    }

    public void setLista(T[] lista) {
        this.lista = lista;
    }

    @Override
    public T getTopo() throws PilhaVaziaException{

        if(topo == 0){
            throw new PilhaVaziaException("Pilha Vazia");
        }
        return lista[topo -1];

    }

    @Override
    public int getQtd() {
        return 0;
    }

    @Override
    public void empilhar(Object num) throws PilhaCheiaException {
            lista[topo] = (T) num;
            if( topo == tamanho ){
            throw new PilhaCheiaException("Pilha cheia");
            }
        topo ++;
    }

    @Override
    public T desempilhar() throws PilhaVaziaException{

        T var1 = lista[topo - 1];
        if(topo - 1 == 0){

            throw new PilhaVaziaException("Pilha vazia");

        }else{
            lista[topo - 1] = null;
            topo -=1;
        }

        return var1;
    }
    @Override
    public boolean estahVazia(){

        if(topo == 0){
            return true;

        }else{

            return false;

        }

    }

}