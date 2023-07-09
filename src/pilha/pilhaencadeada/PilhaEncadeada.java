package pilha.pilhaencadeada;

import pilha.IPilha;
import pilha.PilhaCheiaException;
import pilha.PilhaVaziaException;

public class PilhaEncadeada<T> implements IPilha {

    private no<T> topo;
    private no<T> num;
    private int count;

    public PilhaEncadeada() {
        topo = null;
        count = 0;
    }


    @Override
    public no<T> getTopo() throws PilhaVaziaException {
        if(topo == null ){

            throw new PilhaVaziaException("Pilha vazia");

        }else{
            return (no<T>) topo;
        }

    }

    @Override
    public int getQtd() {
        return count;
    }

    @Override
    public boolean estahVazia() {
        if(topo == null){

            return true;

        }else{

            return false;

        }
    }

    @Override
    public void empilhar(Object item) throws PilhaCheiaException {

        no<T> No = new no<T>((T) item);
        if (count <= 4) {
            if (topo == null) {

                No.setProximo(null);
                topo = No;
                num = No;
            } else {
                topo = No;
                No.setProximo(num);
                num = No;
            }
            count ++;
        }else{
            throw new PilhaCheiaException("Pilha cheia");
        }
    }

    @Override
    public Object desempilhar() throws PilhaVaziaException {

        no<T> item = num;
        if (topo == null) {
            throw new PilhaVaziaException("Pilha vazia");
        } else {
            topo = topo.getProximo();
        }

        return (T) item;
    }


    public void Estacheia() throws PilhaCheiaException, PilhaVaziaException {
        if (count > 4) {
            throw new PilhaCheiaException("Pilha está cheia");
        }else if (topo == null) {
            throw new PilhaVaziaException("Pilha vazia");
        }else{
            System.out.println("Pilha safe!");
        }
    }

}