package listaencadeada;

import org.w3c.dom.Node;

import java.util.Scanner;
import listaencadeada.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List list = new List();

        int op = 0;
        int i=0;
        while(op != 3){
                showMenu();
                op = sc.nextInt();
                if(op > 0 && op <= 3) {
                    if (op == 1) {

                        System.out.println("Digite um numero: ");
                        double valor = sc.nextDouble();
                        list.incluir(valor);
                    } else if (op == 2) {
                        System.out.println(list);
                    } else {
                        System.out.println("Opção invalida!");
                    }

                    i++;

                }


        }

    }

    public static void showMenu(){
        System.out.println("1 - Inserir elemento na lista\n " +
                           "2 - Mostrar lista\n" +
                           "3 - Sair");

    }



}
