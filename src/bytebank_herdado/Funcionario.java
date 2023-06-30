package bytebank_herdado;

public class Funcionario {
    
    private String nome;
    private String cpf;
    protected double salario;   //público para os filhos, acesso liberado para os filhos e privado para outras classes

    public double getBonificacao() {
        return this.salario * 0.05;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
