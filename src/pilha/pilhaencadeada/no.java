package pilha.pilhaencadeada;
public class no <T>{

        private T valor;
        private no<T> proximo;

        public no(T novoValor) {
            this.valor = novoValor;
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

