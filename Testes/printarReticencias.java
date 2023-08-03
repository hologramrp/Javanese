package Testes;

public class printarReticencias {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String sonic = args[0];
        String frase = """ 
            Sonic\r
             """ + sonic +
             """
                     uyuy
                     """;;
    
        System.out.println(sonic);
        System.out.println(frase);
    }
}


