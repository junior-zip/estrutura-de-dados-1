package pilha.Pilhasequencial;

import pilha.PilhaCheiaException;
import pilha.PilhaVaziaException;

public class Main {
    public static void main(String[] args) throws PilhaVaziaException, PilhaCheiaException {

        PilhaSequencial pilhaSequencial = new PilhaSequencial(3);

        pilhaSequencial.empilhar(2);
        pilhaSequencial.empilhar(4);
        pilhaSequencial.empilhar(1);
        pilhaSequencial.desempilhar();
        System.out.println(pilhaSequencial.getQtd());
        System.out.println(pilhaSequencial.getTopo());


    }
}
