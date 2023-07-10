package filaDuplamente;

public class Main {

    public static void main(String[] args) {

        FilaDuplamente<String> filaduplamente = new FilaDuplamente<>();


        filaduplamente.inserir("AC");
        filaduplamente.inserir("bc");
        filaduplamente.inserir("dc");
        System.out.println(filaduplamente.getInicio().getValor());
        System.out.println(filaduplamente.getInicio().getProximo().getValor());
        System.out.println(filaduplamente.getFim().getValor());
        filaduplamente.remover();
        System.out.println(filaduplamente.getInicio().getValor());


    }
}
