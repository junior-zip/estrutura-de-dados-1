package listaencadeada;

public class List<T> {

    private no<T> inicio;
    private no<T> ultimo;
    private int tamanho = 0;


    //incluir no final
    public void incluir(T valor){

        no<T> No = new no<T>(valor);

        if(this.tamanho == 0){

            this.inicio = No;

        }else{
            this.ultimo.setProximo(No);

        }
        //referenciando o nó
        this.ultimo = No;
        this.tamanho ++;

    }

    public int getTamanho(){
        return this.tamanho;
    }

    public void limpa(){
        this.inicio = null;
        this.ultimo = null;
        this.tamanho = 0;
    }





    @Override
    public String toString() {
        // [1, 2, 3, 4]

        if(this.tamanho == 0){
            return "[]";
        }else{

        }

        StringBuilder builder = new StringBuilder();
        no<T> atual = this.inicio;

        for(int i = 0; i< tamanho-1; i ++ ){

            builder.append(atual.getValor()).append(",");
            atual = atual.getProximo();

        }
        builder.append(atual.getValor());

        return builder.toString();
    }
}






