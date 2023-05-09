package listaencadeada;

public class no <T>{

    private T valor;
    private no<T> proximo;

    public no() {
    }

    public no(T valor) {
        this.valor = valor;
        this.proximo = null;
    }

    public no(T valor, no<T> proximo) {
        this.valor = valor;
        this.proximo = proximo;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public no<T> getProximo() {
        return proximo;
    }

    public void setProximo(no<T> proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "no{" +
                "valor=" + valor +
                ", proximo=" + proximo +
                '}';
    }
}
