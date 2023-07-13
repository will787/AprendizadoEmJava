package bytebank.banco.test;

import bytebank.banco.model.ContaCorrente;
import bytebank.banco.model.ContaPoupanca;
import bytebank.banco.model.SaldoInsuficienteException;

public class TesteContas {
    public static void main(String[] args) throws SaldoInsuficienteException{
        
        //double a = 3.0;
        //double b = a / 2;
        //System.out.println(b);
        
        ContaCorrente cc = new ContaCorrente(111, 111);
         cc.deposita(100.0);

         ContaPoupanca cp = new ContaPoupanca(222, 222);
         cp.deposita(200.0);

         cc.transfere(10.0, cp);

         System.out.println("Conta Corrente " + cc.getSaldo());
         System.out.println("Conta Poupança " + cp.getSaldo());
    }
}
