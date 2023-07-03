package bytebank_herdado;

public class TesteSistema {
    public static void main(String[] args) {
      Gerente g1 = new Gerente();
      g1.setSenha(2222);

      Administrador adm = new Administrador();
      adm.setSenha(3333); 

      Cliente cliente = new Cliente();
      cliente.setSenha(3333);
    
      SistemaInterno si = new SistemaInterno();
      si.autentica(g1);
      si.autentica(adm);
      si.autentica(cliente);
    }
}
