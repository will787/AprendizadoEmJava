package bytebank.banco.model;

public class SeguroDeVida implements Tributavel{

    @Override
    public double getValorImposto() {
        return 42;
    }
    
}
