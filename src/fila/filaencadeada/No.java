package fila.filaencadeada;

public class No <T>{
        private T valor;
        private No<T> proximo;

        public No(T novoValor) {
            this.valor = novoValor;
        }

        public T getValor() {
            return valor;
        }

        public void setValor(T valor) {
            this.valor = valor;
        }

        public No<T> getProximo() {
            return proximo;
        }

        public void setProximo(No<T> proximo) {
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
