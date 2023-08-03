package Aula_03;

public class sobreErros {
    public static void main(String[] args) {
        // Existem dois tipos de erros.
        // Erro de compilação
        // Ocorre por má formação do código

        // .java -> .class O arquivo ponto java é transformado no arquivo ponto class que é gerado no compilador.
        //double number1 = "Olá Mundo"; //--> Vai dar erro pois o valor esperado é um inteiro double, e eu informei uma cadeia de caracteres [string]


        // Erro de Execução
        // Ocorre durante a execução do código

        int x = 10;
        int y = 0 ;

        System.out.println(x / y);
    }
}
