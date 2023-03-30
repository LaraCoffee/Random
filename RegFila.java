package aulaAlgoritimo;

public class RegFila {
    private int comeco;
    private int fim;
    private int max;
    private int total;
    private String [] elemento;
    
    public RegFila(int a){
        comeco = 0;
        fim = 0;
        total =0;
        max = a;
        elemento = new String[max];}
        public void enfileirar(String c){
            if(total == max){
                comeco =0;
                fim =0;
                total = 0;
            }
            total++;
            elemento[fim++] = c;
        }
        public String desenfileirar(){
            if(total > 0){
                total--;
                return elemento[comeco++];
            }return"";
        }
        public int getComeco(){
            return comeco;
        }
        public int getFim(){
            return fim;
        }
        public int getTotal(){
            return total;
        }
        public String getElemento(int posicao){
            return elemento[posicao];
        }
    }

