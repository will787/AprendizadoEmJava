package bytebank.banco.test;

public class TesteSring {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        String vazio = "    Alura   ";
        String outroVazio = vazio.trim();
        
        System.out.println(vazio.contains("Alu"));
        System.out.println(outroVazio);
        
        
        int a = 3;
        String nome = "Alura"; // object literal
        //String outro = new String("Alura");
        // String imutavel ;
        //nome.replace("A", "a");


        System.out.println(nome.length());

        for(int i = 0; i < nome.length(); i++) {
            System.out.println(nome.charAt(i));
        }

        // String sub = nome.substring(1); ///aqui mostra por onde a variável será imprimida, por exemplo ela irá printar "lura" tirando o "A"
        // System.out.println(sub);



        // int pos = nome.indexOf("ur");
        // System.out.println(pos);

        // char c = nome.charAt(2); //// Isso é posição, sempre começa com 0
        // System.out.println(c);
        // char c = 'A';
        // char d = 'a';
        // String outra = nome.replace('A' , 'a');
        
        //String outra = nome.toUpperCase();
        // System.out.println(nome);
        //System.out.println(outra);
    }
}
