package Pilhasequencial;
public class PilhaSequencial {

    private int[] lista;
    private int topo;

    private int num;
    private int qtd;


    private int tamanho;
    public PilhaSequencial(int tamanho) {
        this.tamanho = tamanho;
        lista = new int[tamanho];
        topo = 0;
    }

    public int[] getLista() {
        return lista;
    }

    public void setLista(int[] lista) {
        this.lista = lista;
    }

    public int getTopo() {
        return lista[topo -1];
    }

    public void setTopo(int topo) {
        this.topo = topo;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void empilhar(int num){
            lista[topo] = num;
            if( topo == tamanho ){
                System.out.println("pilha cheia");
            }
        topo ++;
    }

    public int Desempilhar(){

        int var1 = lista[topo - 1];
        if(topo - 1 == 0){
            System.out.println("Pilha está vazia");
        }else{
            lista[topo - 1] = 0;
            topo -=1;
        }

        return var1;
    }





}