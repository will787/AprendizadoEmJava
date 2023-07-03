package bytebank_herdado;

// nao pode instanciar, porque ela acaba sendo abstrata  - criar .
public abstract class Funcionario { //abstrato é relacionado com herança

    
    private String nome;
    private String cpf;
    protected double salario;   //público para os filhos, acesso liberado para os filhos e privado para outras classes

    public abstract double getBonificacao(); // implementamos o método abstrato somente para as classes filhas, então só elas irão instanciar
    //sendo o método abstrato
    //não há metodos, nao há implmentação, logo filhos deu vida, ex : gerente, Designer, Editor de Video, etc..
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
