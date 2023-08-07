// Incompleto - Concluir

// package Aula_06;


// //Importando a Biblioteca responsável por receber os dados do usuário
// import java.util.Scanner;


// public class Calculator {

//     public static void main(String[] args) {
 
//     limparTela();
//     listarCabecalhoCalculadora();
//     //exibirCorpoCalculadora();
//     //exibirMenu();
//     testinho();
// }

       
   
//     static public testinho(String justifiedText){
//         String text = ("""
//            _______________________
//            |  _________________  |
//            | | JO           0. | |
//            | |_________________| |
//            |  ___ ___ ___   ___  |
//            | | 7 | 8 | 9 | | + | |
//            | |___|___|___| |___| |
//            | | 4 | 5 | 6 | | - | |
//            | |___|___|___| |___| |
//            | | 1 | 2 | 3 | | x | |
//            | |___|___|___| |___| |
//            | | . | 0 | = | | / | |
//            | |___|___|___| |___| |
//            |_____________________|

//             """);
            
//             int totalWidth = 95;
    
//             String[] lines = text.split("\n");
//             StringBuilder justifiedText = new StringBuilder();
    
//             for (String line : lines) {
//                 justifiedText.append(String.format("%" + totalWidth + "s%n", line.trim()));
//             }
    
//             return(justifiedText);
//         }
//     static void somar(int x, int y){
     
//         var resultado_Da_Soma = x + y;
//         System.out.println("Resultado é: " + resultado_Da_Soma);

//     }

//     static void limparTela(){
//         //Esta função serve para limpar a tela.
//         System.out.print  ("\u001B[2J\u001B[H \n\n");
//     }
//     static void listarCabecalhoCalculadora(){

//         // Exibição estilizada em ASCII 
//         System.out.println("                    ______________________________________________________________        ");
//         System.out.println("                   |                                                              |                ");
//         System.out.println("                   |     __             __                  __   __   __          |        ");
//         System.out.println("                   |    /  `  /\\  |    /  ` |  | |     /\\  |  \\ /  \\ |__)  /\\     |       ");
//         System.out.println("                   |    \\__, /~~\\ |___ \\__, \\__/ |___ /~~\\ |__/ \\__/ |  \\ /~~\\    |            ");
//         System.out.println("                   |                                                              |                ");
//         System.out.println("                   |______________________________________________________________|        \n\n\n");
//     }     
//     static void exibirMenu(){
//         // Pequeno menu de seleção para o usuário
//         System.out.println("\t \t \t \t Selecione um operador abaixo: \n");
        
//         System.out.println("\t\t\t( + ) Adição:                ( * ) Multiplicação");
//         System.out.println("\t\t\t( + ) Subtração:             ( / ) Divisão");
//         System.out.println("\n");
//     }

//     static void exibirCorpoCalculadora(){
    
//     System.out.println(" _____________________ ");
//     System.out.println("|  _________________  |");
//     System.out.println("| |              0. | |");
//     System.out.println("| |_________________| |");
//     System.out.println("|  ___ ___ ___   ___  |");
//     System.out.println("| | 7 | 8 | 9 | | + | |");
//     System.out.println("| |___|___|___| |___| |");
//     System.out.println("| | 4 | 5 | 6 | | - | |");
//     System.out.println("| |___|___|___| |___| |");
//     System.out.println("| | 1 | 2 | 3 | | x | |");
//     System.out.println("| |___|___|___| |___| |");
//     System.out.println("| | . | 0 | = | | / | |");
//     System.out.println("| |___|___|___| |___| |");
//     System.out.println("|_____________________|");
//     System.out.println("\n");

//     }
// }






// Teste com Peto

// public class ExibirLadoALado {
//     public static void main(String[] args) {
//         String textoEstatico = """
//                                 ______________________________________________________________
//                                |                                                              |
//                                |     __             __                  __   __   __          |
//                                |    /  `  /\\  |    /  ` |  | |     /\\  |  \\ /  \\ |__)  /\\     |
//                                |    \\__, /~~\\ |___ \\__, \\__/ |___ /~~\\ |__/ \\__/ |  \\ /~~\\    |
//                                |                                                              |
//                                |______________________________________________________________|
//                                \n\n\n""";

//         String justifiedText = testinho();

//         // Ajuste o valor de totalWidth conforme necessário para que ambos os textos fiquem lado a lado.
//         int totalWidth = 95;

//         String[] linesText = justifiedText.split("\n");
//         String[] linesStatic = textoEstatico.split("\n");

//         for (int i = 0; i < Math.max(linesText.length, linesStatic.length); i++) {
//             String lineText = (i < linesText.length) ? linesText[i] : "";
//             String lineStatic = (i < linesStatic.length) ? linesStatic[i] : "";
//             System.out.println(String.format("%-" + totalWidth + "s %s", lineText, lineStatic));
//         }
//     }

//     public static String testinho() {
//         Scanner scanner = new Scanner(System.in);

//         String text = """
//                       _______________________
//                      |  _________________  |
//                      | | JO           0. | |
//                      | |_________________| |
//                      |  ___ ___ ___   ___  |
//                      | | 7 | 8 | 9 | | + | |
//                      | |___|___|___| |___| |
//                      | | 4 | 5 | 6 | | - | |
//                      | |___|___|___| |___| |
//                      | | 1 | 2 | 3 | | x | |
//                      | |___|___|___| |___| |
//                      | | . | 0 | = | | / | |
//                      | |___|___|___| |___| |
//                      |_____________________|

//                       """;

//         int totalWidth = 95;

//         String[] lines = text.split("\n");
//         StringBuilder justifiedText = new StringBuilder();

//         for (String line : lines) {
//             justifiedText.append(String.format("%" + totalWidth + "s%n", line.trim()));
//         }

//         return justifiedText.toString();
//     }
// }

