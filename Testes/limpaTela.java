package Testes;

public class limpaTela {
    public static void main(String[] args) {
         limparTela();   
    }
        
        static void limparTela(){
            // Esta função serve para limpar a tela.
            System.out.print  ("\u001B[2J\u001B[H \n\n");
        }
}
