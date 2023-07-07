package Pilhasequencial;

public class Main {
    public static void main(String[] args) {

        PilhaSequencial pilhaSequencial = new PilhaSequencial(3);

        pilhaSequencial.empilhar(2);
        pilhaSequencial.empilhar(4);
        pilhaSequencial.empilhar(1);
        pilhaSequencial.Desempilhar();

        System.out.println(pilhaSequencial.getTopo());


    }
}
