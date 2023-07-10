package pilha.pilhaencadeada;
import pilha.PilhaCheiaException;
import pilha.PilhaVaziaException;

public class Main {

    public static void main(String[] args) {
        PilhaEncadeada<Integer> PilhaEncadeada = new PilhaEncadeada<>();

        try {
            PilhaEncadeada.empilhar(2);
            PilhaEncadeada.empilhar(3);
            PilhaEncadeada.empilhar(4);

            System.out.println(PilhaEncadeada.estahVazia());

            System.out.println(PilhaEncadeada.getTopo().getValor());


        } catch (NullPointerException e) {
            e.getMessage();
        } catch (PilhaCheiaException e) {
            throw new RuntimeException(e);
        } catch (PilhaVaziaException e) {
            throw new RuntimeException(e);
        }

    }

}
