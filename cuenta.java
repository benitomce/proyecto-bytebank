class cuenta {
    double saldo;
    int agencia;
    int numero;
    String titular;

    void depositar(double valor){
        this.saldo = this. saldo + valor;
    }    

    public boolean retirar(double valor) {
        if(this.saldo >= valor){
            this.saldo = this.saldo - valor;
            return true;
        }   else{
            return false;
        }
    }

    public boolean transferir(double valor, cuenta Cuenta) {
        if(this.saldo >= valor){
            this.saldo -= valor;
            Cuenta.saldo += valor;
            return true;
        }   return false;
    }
}
