package fila;

public interface Ifila<T>{

    public void incluir (T valor) throws FilaCheiaException;
    public T remover () throws FilaVaziaException;
    public int getQtd();
    public int getQtdMaxSuportada();
    public boolean estaVazia();
    public void limpar();
    public T visusalizarProximo() throws FilaVaziaException;




}
