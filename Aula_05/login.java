// *------------------------------------------------------------------
// Sobre a criação:
// Autor : Matheus da Rosa - Quixotte
// Repositório : https://github.com/quixote404
// E-mail : hologramrp.@proton.me
// *------------------------------------------------------------------
// Sobre o programa:
// Versão : 0.1 - DATA 20/01/2023
// Data : Credenciais de acesso.
// License : Null
// *------------------------------------------------------------------

package Aula_05;


public class login {
            public static void main(String[] args) {


                if (args[0].equals("MATHEUS")) {
                    receber(args);
                } else {
                    expulsar();
                }
            }

                static void receber(String[] args){
                    System.out.println("PERMISSÃO LIBERADA ao usuário: " + args[0] + "." + "\nSeja bem-vindo!");
                }

                static void expulsar(){
                    System.out.println("PERMISSÃO NEGADA --X-- Acesso não autorizado.");
                }
            }
 



//Teste Ignorar
//             public static void argumentar(String[] banana){
//                 System.out.println("Número de argumentos da banana é de: " + banana.length + " argumentos. \n");
//                 for (int varAuxForLoop = 0; varAuxForLoop < banana.length; varAuxForLoop++ )
//                 {
//                 System.out.println("Argumento nro: " + (varAuxForLoop + 1) + ": " + banana[varAuxForLoop]);
//          }
//     }
// }
