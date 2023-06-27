package pilhaencadeada;

public class pilha <T> {

    private no<T> topo;
    private no<T> num;

    public pilha() {
        topo = null;

    }

    public pilha(no<T> topo) {
        this.topo = topo;
    }

    public no<T> getTopo() {
        return topo;
    }

    public void setTopo(no<T> topo) {
        this.topo = topo;
    }

    public void Empilhar(T item){

        no<T> No = new no<T>(item);
        if(topo == null){

            System.out.println("pilha vazia, adicionando o primeiro item");

            No.setProximo(null) ;
            topo = No;
            num = No;
        }else{
            topo = No;
            No.setProximo(num);
            num = No;


        }



    }



}
