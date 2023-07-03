package pilhaencadeada;
public class Main {

    public static void main(String[] args) {
        pilha<Integer> Pilha = new pilha<>();

        try{
            Pilha.Empilhar(2);
            Pilha.Empilhar(3);
            Pilha.Empilhar(4);
            Pilha.Empilhar(4);
            Pilha.Empilhar(4);
            Pilha.Empilhar(4);
            Pilha.Empilhar(4);
            Pilha.Empilhar(4);
            Pilha.Empilhar(4);
            Pilha.Estacheia();
            Pilha.Empilhar(4);
            Pilha.Empilhar(4);
            Pilha.Empilhar(4);
            Pilha.Empilhar(4);
            System.out.println(Pilha.getTopo().getValor());
            System.out.println(Pilha.getTopo());
            Pilha.Desempilhar();
            Pilha.Desempilhar();
            Pilha.Desempilhar();

            System.out.println(Pilha.getTopo());

        }catch(NullPointerException e){
            e.getMessage();
        } catch (PilhaCheiaException e) {
            throw new RuntimeException(e);
        } catch (PilhaVaziaException e) {
            throw new RuntimeException(e);
        }

    }
}
