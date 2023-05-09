package listaencadeada;

public class List {

    private no cabeca;

    public void incluir(Double valor){

        no No = new no();
        No.setValor(valor);
        No.setProximo(cabeca);
        cabeca = No;


    }
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        no p = cabeca;

        while(p!= null){
            sb.append(p.getValor() + " ");
            p = p.getProximo();
        }

        sb.append("]");
        return sb.toString();




    }
}
