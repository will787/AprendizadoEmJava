package bytebank_herdado;

public class AutenticacaoUtil {
// autenticador fica só aqui agora;
    private int senha;

    public void setSenha(int senha) {
       this.senha = senha;
    }

    
    public boolean autentica(int senha) {
        if(this.senha == senha) {
            return true;
        }else {   
             return false;
        }
    }

}