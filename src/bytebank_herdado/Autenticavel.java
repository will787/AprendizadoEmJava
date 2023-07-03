package bytebank_herdado;

// contrato Autenticavel 
    // Esse contrato precisa ser assinado, precisa implementar a senha 
        // método setSenha
        // metodo autentica
public abstract interface Autenticavel  {
// classes abstratas não são obrigadas a criar métodos abstratos 
    public abstract void setSenha(int senha);
    
    public abstract boolean autentica (int senha);
    
}
