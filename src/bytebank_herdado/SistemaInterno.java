package bytebank_herdado;

public class SistemaInterno {
    private int senha = 2222;

    public void autentica(Autenticavel fa) {
        boolean autentica = fa.autentica(this.senha);{
        if(autentica){
            System.out.println("Você pode entrar");
        } else {
            System.out.println("Você não pode entrar");
        }
        }
    }
}


