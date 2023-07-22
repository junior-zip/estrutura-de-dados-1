package listaencadeada;

public class List<T> {

    private no<T> primeiro;
    private no<T> ultimo;
    private int tamanho;


    public List(){
        this.tamanho = 0;
    }


    public no<T> getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(no<T> primeiro) {
        this.primeiro = primeiro;
    }

    public no<T> getUltimo() {
        return ultimo;
    }

    public void setUltimo(no<T> ultimo) {
        this.ultimo = ultimo;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    //incluir sempre no final
    public void incluir(T valor){

        no<T> novoNo = new no<T>(valor);
        if(this.primeiro == null && this.ultimo == null){
            this.primeiro = novoNo;
            this.ultimo = novoNo;

        }else{
            this.ultimo.setProximo(novoNo);
            this.ultimo = novoNo;
        }
        //referenciando o nó
        this.tamanho ++;

    }
    // incluir em qualquer posição
    public void incluirNovo(int posicao,T valorAdicionado){
        no<T> anterior = null;
        no<T> atual = this.primeiro;

        no<T> novoNo = new no<T>(valorAdicionado);

        for(int i = 0; i < posicao; i++){

            if(atual.getProximo() != null){
                anterior.setValor(atual.getValor());
                atual = atual.getProximo();

            }

        }

        if(this.primeiro == null && this.ultimo == null){
            primeiro = atual;
            atual.setProximo(null);
            atual.setValor(novoNo.getValor());



        }else if (atual == ultimo ){
            anterior.setValor(atual.getValor());
            atual.setValor(novoNo.getValor());
            atual.setProximo(null);

        }else {

          anterior.setProximo(novoNo);
          novoNo.setProximo(atual);
           

        }

        this.tamanho ++;

    }



    public void remover(T valorProcurado){
        no<T> anterior = null;
        no<T> atual = this.primeiro;

        for(int i = 0; i < this.getTamanho(); i++){

            if(atual.getValor().equals(valorProcurado)){
                if (this.tamanho == 1){
                    this.primeiro = null;
                    this.ultimo = null;

                }else if(atual == primeiro){
                    this.primeiro = atual.getProximo();
                    atual.setProximo(null);

                }else if(atual == ultimo){
                    this.ultimo = anterior;
                    anterior.setProximo(null);

                }else{
                    anterior.setProximo(atual.getProximo());
                    atual = null;
                }

                this.tamanho --;
                break;

            }

            anterior = atual;
            atual = atual.getProximo();

        }
    }

    public no<T> get(int posicao){

        no<T> atual = this.primeiro;

        for(int i =0; i < posicao; i++){
            if(atual.getProximo() != null){

                atual = atual.getProximo();
            }

        }

        return atual;

    }

    public int getTamanho(){
        return this.tamanho;
    }

    public void limpa(){
        this.primeiro = null;
        this.ultimo = null;
        this.tamanho = 0;
    }


    @Override
    public String toString() {
        // [1, 2, 3, 4]

        if(this.tamanho == 0){
            return "[]";
        }

        no<T> atual = primeiro;
        System.out.print(atual.getValor() + ", ");

        while (atual.getProximo() != null) {
            atual = atual.getProximo();
            System.out.print(atual.getValor() + ", ");
        }

        return "Lista{" +
                "primeiro=" + primeiro +
                '}';
    }
}

