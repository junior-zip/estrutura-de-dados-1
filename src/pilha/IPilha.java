package pilha;

public interface IPilha <T>{

    public void empilhar(T valor) throws PilhaCheiaException;

    public T desempilhar() throws PilhaVaziaException;

    public T getTopo() throws PilhaVaziaException;
    public int getQtd();
    public boolean estahVazia();




}
