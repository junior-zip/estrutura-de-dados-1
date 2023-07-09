package pilha.pilhaencadeada;

import pilha.PilhaCheiaException;
import pilha.PilhaVaziaException;

public class PilhaEncadeada<T> {

    private no<T> topo;
    private no<T> num;
    private int count;

    public PilhaEncadeada() {
        topo = null;
        count = 0;
    }
    public no<T> getTopo() {
        return topo;
    }

    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }

    public void setTopo(no<T> topo) {
        this.topo = topo;
    }

    public void Empilhar(T item) {

        no<T> No = new no<T>(item);
        if (count < 4) {
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
        }
    }
    public void Desempilhar(){

        if(topo == null){
            System.out.println("Pilha vazia");
        }else{
            topo = topo.getProximo();
        }
    }

    public void Estacheia() throws PilhaCheiaException, PilhaVaziaException {
        if (count >= 12) {
            throw new PilhaCheiaException("Pilha está cheia");
        }else if (topo == null) {
            throw new PilhaVaziaException("Pilha vazia");
        }else{
            System.out.println("Pilha safe!");
        }
    }

}