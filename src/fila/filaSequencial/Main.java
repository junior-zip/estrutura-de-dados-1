package fila.filaSequencial;

import fila.FilaCheiaException;
import fila.FilaVaziaException;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws FilaCheiaException, FilaVaziaException {
        FilaSequencial<Integer> filaSequencial = new <Integer>FilaSequencial(5);

        filaSequencial.incluir(3);
        System.out.println(Arrays.toString(filaSequencial.getLista()));
        filaSequencial.incluir(7);
        System.out.println(Arrays.toString(filaSequencial.getLista()));
        filaSequencial.incluir(10);
        filaSequencial.incluir(4);
        filaSequencial.incluir(6);
        System.out.println(Arrays.toString(filaSequencial.getLista()));
        System.out.println(Arrays.toString(filaSequencial.getLista()));
        System.out.println(filaSequencial.visualizarProximo());
        System.out.println(filaSequencial.getQtdMaxSuportada());
        System.out.println(filaSequencial.getQtd());
        filaSequencial.limpar();
        System.out.println(Arrays.toString(filaSequencial.getLista()));
        System.out.println(filaSequencial.getQtd());


    }
}
