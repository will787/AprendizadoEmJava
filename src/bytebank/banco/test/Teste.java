package bytebank.banco.test;

import bytebank.banco.model.ContaCorrente;
import bytebank.banco.model.ContaPoupanca;
import bytebank.banco.model.Cliente;



public class Teste {
    
    public static void main(String[] args) {
        // System.out.println("x");
        // System.out.println(3);
        // System.out.println(false);
        
        Object cc = new ContaCorrente(22, 11);
        Object cp = new ContaPoupanca(33, 44);
        Object cliente = new Cliente();

        System.out.println(cc.toString());
        System.out.println(cp);


        //println(cliente);
        
    }
    
    // static void println() {}
    // static void println(int a) {}
    // static void println(boolean valor) {}

    // static void println(??? referencia){}    
}    
