package bytebank_herdado;

// gerente é um funcionário, gerente herda da classe funcionário, ele tem os atributos;
public class Gerente  extends Funcionario{
    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }
    
    public boolean autentica (int senha){
        if(this.senha == senha){
            return true;
        } else {
            return false;
        }
    }

    public double getBonificacao() {
        System.out.println("Chamando a bonificacao do GERENTE");
        return super.getSalario();
    }

}
