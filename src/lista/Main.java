package lista;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Listas listas = new Listas();

        int i = 0;

        int alternativa = 1;

        while(alternativa != 0 ){
            if(i == 0){
                listas.inicializar();
            }
            System.out.println(
                            "Alternativas para a lista Sequencial: \n" +
                            "0 - Sair da lista \n" +
                            "1 - Inicializar lista \n" +
                            "2 - Imprimir lista \n" +
                            "3 - Incluir valor no Inicio da lista \n" +
                            "4 - Incluir valor no final da lista \n" +
                            "5 - Localizar número na lista e sua posição \n" +
                            "6 - Excluir número na lista \n");
            alternativa = sc.nextInt();
            if(alternativa == 1){
                listas.inicializar();
            }else if(alternativa == 2){
                listas.imprimir();

            }else if(alternativa == 3){
                listas.incluirInicio();

            }else if(alternativa == 4){
                listas.incluirFinal();

            }else if (alternativa == 5){
                listas.localizarNaLista();

            }else if(alternativa == 6){
                listas.ExcluirNalista();
            }

            i ++;
        }

        System.out.println("Lista finalizada!");

    }

}
