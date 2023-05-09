package lista;
import java.util.Arrays;
import java.util.Scanner;

public class Listas < T extends Comparable>{

    Scanner sc = new Scanner(System.in);
    private int[] lista;
    private int tamanho;
    private int IL;
    private int FL;
    private int num1;

    public void inicializar(){

        System.out.println("Qtd de números no vetor");
        tamanho = sc.nextInt();
        lista = new int[tamanho];

        for(int i = 0; i< tamanho; i ++ ){
            System.out.println((i + 1) +"° número:");
            lista[i] = sc.nextInt();

        }
    }

    public void imprimir(){

        System.out.println("Lista selecionada:");
        System.out.println(Arrays.toString(lista));

    }

    public void incluirInicio() {

        if(tamanho  != 0){

            int[] lista1 = new int[tamanho + 1];
            System.out.println("O numero para incluir no começo: ");
            IL = sc.nextInt();

            lista1[0] = IL;
            for(int i = 0; i < tamanho ; i++) {

                lista1[i + 1] = lista[i];

            }

            tamanho++;

            lista = lista1;

        }


    }

    public void incluirFinal(){


        if(tamanho  != 0){

            int[] lista1 = new int[tamanho + 1];
            System.out.println("O numero para incluir no final: ");
            FL = sc.nextInt();

            lista1[lista1.length-1] = FL;
            for(int i = 0; i < tamanho ; i++) {

                lista1[i] = lista[i];

            }

            tamanho++;

            lista = lista1;
        }

    }

    public void localizarNaLista(){

        System.out.println("Digite o número que deseja localizar: ");

        num1 = sc.nextInt();
        for(int i = 0; i < tamanho ; i++) {
            if(lista[i] == num1) {

                System.out.println("posição: " + i + ", número: " + num1);

            }


        }


    }

    public void ExcluirNalista(){

        int[] lista1 = new int[tamanho - 1];

        if(tamanho != 0) {

            System.out.println("Digite o número que você deseja excluir da lista: ");
            num1 = sc.nextInt();
            for (int i = 0; i < tamanho; i++) {
                if (lista[i] != num1) {
                    lista1[i] = lista[i];
                }

            }

            lista = lista1;

        }
    }


}
