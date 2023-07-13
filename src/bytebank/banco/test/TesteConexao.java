package bytebank.banco.test;

import bytebank.banco.model.Conexao;

public class TesteConexao {
    public static void main(String[] args) {
        
       try(Conexao conexao = new Conexao()) {
            conexao.leDados();         
       } catch(IllegalStateException ex) {
        System.out.println("Deu erro na conexao");
       }
       // esse é um código mais recente, que pode precisar de uma manutenção>>>>


       // > já o código de baixo é um código mais antigo que está ainda nos sistemas 

       //-----------------------------------------------------------------------------------------------------------
       
        //Conexao con = null;

        // try {
        //     con = new Conexao();
        //     con.leDados();
        // } catch(IllegalStateException ex) {
        //     System.out.println("Deu erro na conexao");
        // } finally {
        //     System.out.println("Finally");
        //     if(con != null){
        //     con.close();
        //     }
        // }
    }
}
