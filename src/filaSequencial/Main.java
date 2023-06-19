package filaSequencial;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FilaSequencial filaSequencial = new FilaSequencial();

        filaSequencial.inicializar(12);
        filaSequencial.enfileirar(3);
        System.out.println(Arrays.toString(filaSequencial.getLista()));
        filaSequencial.enfileirar(7);
        System.out.println(Arrays.toString(filaSequencial.getLista()));
        filaSequencial.enfileirar(10);

        System.out.println(Arrays.toString(filaSequencial.getLista()));
        filaSequencial.desenfileirar();
        System.out.println(Arrays.toString(filaSequencial.getLista()));

    }
}
