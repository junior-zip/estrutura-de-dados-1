package pilhaencadeada;

public class Main {

    public static void main(String[] args) {
        pilha<Integer> Pilha = new pilha<>();

        Pilha.Empilhar(2);
        Pilha.Empilhar(3);
        Pilha.Empilhar(4);
        System.out.println(Pilha.getTopo());
        System.out.println(Pilha.getTopo().getValor());
        


    }
}
