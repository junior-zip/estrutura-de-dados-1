package filaSequencial;

import java.util.Random;
import java.util.Scanner;

public class FilaSequencial {
    private int[] lista;
    private int inicio;
    private int fim;

    public FilaSequencial() {
    }
    public int[] getLista() {
        return lista;
    }
    public void setLista(int[] lista) {
        this.lista = lista;
    }

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public int getFim() {
        return fim;
    }

    public void setFim(int fim) {
        this.fim = fim;
    }

    public void inicializar(int tamanho){
        lista = new int[tamanho];
       fim = lista.length -1;
       inicio = fim;

    }

    public void enfileirar(int elemento ){

        if(lista[fim] != 0){
            System.out.println("lista cheia ");

        }

        lista[fim] = elemento;
        this.fim = (this.fim-1 +lista.length) % lista.length;

    }

    //11 + 12  % 12 == 11

    //10 + 12 % 12 == 10
    //9 + 12 % 12 == 9
    public void desenfileirar(){
        if(lista[inicio] == 0){
            System.out.println("fila vazia");
        }

        lista[inicio] = 0;
        this.inicio = (this.inicio -1 + lista.length) % lista.length;

    }

}
