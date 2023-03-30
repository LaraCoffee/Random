package aulaAlgoritimo;

public class Prog3 {
    public static void main(String[] args) {
        
        RegFila f = new RegFila(10);

        f.enfileirar("a - eu");
        f.enfileirar("b - voçê");
        f.enfileirar("c - sicrano");

        for(int i = f.getComeco();i < f.getFim();i++){
            System.out.println(i +1 +"o da fila: "+ f.getElemento(i));
        }
        System.out.println(f.getTotal()+"itens inseridos");
        System.out.println("  ");
        f.desenfileirar();
        f.desenfileirar();
        int x =0;
        for(int i=f.getComeco();i < f.getFim(); i++){
            System.out.println(++x + "o da fila: " + f.getElemento(i));
        }
        System.out.println(f.getComeco() + "itens removidos");
        System.out.println("  ");
        f.enfileirar("d - beltrano");
        x = 0;
        for(int i=f.getComeco();i < f.getFim(); i++){
            System.out.println(++i + "o da fila: " + f.getElemento(i));
        }
        System.out.println("fim");
    }
}
