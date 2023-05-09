package listaencadeada;

import org.w3c.dom.Node;

import java.util.Scanner;
import listaencadeada.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List list = new List<Integer>();

        list.incluir(1);

        System.out.println("Tamanho: " + list.getTamanho());
        System.out.println(list);


        list.incluir(2);
        System.out.println(list);

        list.incluir(3);
        System.out.println(list);


        System.out.println("valores excluidos de toda a lista");
        list.limpa();
        System.out.println(list);


    }


}
