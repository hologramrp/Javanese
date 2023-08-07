// *------------------------------------------------------------------
// Sobre a criação:
// Autor : Matheus da Rosa - Quixotte
// Repositório : https://github.com/quixote404
// E-mail : hologramrp.@proton.me
// *------------------------------------------------------------------
// Sobre o programa:
// Versão : 0.1 - DATA 06/08/2023
// Data : Testes básicos efetuados abaixo
// License : None
// *------------------------------------------------------------------


package Aula_07;

public class declavar {
    public static void main(String[] args) {
        
        limparTela();
        enunciado();
        exercicio();
    }

    static void limparTela(){
        // Esta função serve para limpar a tela.
        System.out.print  ("\u001B[2J\u001B[H \n\n");
    }

    static void exercicio(){

    /* Em um concurso de perguntas e respostas, um jovem acertou 72 de 90 perguntas apresentadas.
    * 
    * Qual foi a porcentagem de acertos?
    * E qual foi a porcentagem de erros?
    * 
    */  


        //Declarando as variáveis.

        int perguntas;
        int acertos;
        int erros;
        float porcentagem_erros;
        float porcentagem_acertos;

        acertos = 72;
        perguntas = 90;

        // (Valor * 100 / total) Fluxo de porcentagem.
        
        erros = (perguntas - acertos); // (90 - 72) = 18
        porcentagem_erros = ((erros * 100) / perguntas);
        porcentagem_acertos = ((acertos * 100) / perguntas);

        // Saída de texto
        System.out.printf("""
                
        
        \t\t\t\t      G A B A R I T O: 
        _____________________________________________________________________________________________
        |                                                                                           | 
        |\t %.0f%% - Acertos                                                                      | 
        |\t %.0f%% - Erros                                                                        |
        |                                                                                           | 
        ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾
                """, porcentagem_acertos, porcentagem_erros);
    }

    static void enunciado(){
        System.out.println("""
        \t\t\t\t      Q U E S T I O N Á R I O:

        _____________________________________________________________________________________________
        |                                                                                           |
        | Em um concurso de perguntas e respostas, um jovem acertou 72 de 90 perguntas apresentadas.|
        | a) Qual foi a porcentagem de acertos?                                                     | 
        | b) E qual foi a porcentagem de erros?                                                     |
        |                                                                                           | 
        ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾
        
        """);
    }
}