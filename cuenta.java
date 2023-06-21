class cuenta {
    double getSaldo;
    int agencia;
    int numero;
    cliente titular;

    void depositar(double valor) {
        this.getSaldo = this.getSaldo + valor;
    }

    public boolean retirar(double valor) {
        if (this.getSaldo >= valor) {
            this.getSaldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transferir(double valor, cuenta Cuenta) {
        if (this.getSaldo >= valor) {
            this.getSaldo -= valor;
            Cuenta.getSaldo += valor;
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return this.getSaldo;
    }

    public void setAgencia(int agencia) {
        if (agencia > 0) {
            this.agencia = agencia;
        } else {
            System.out.println("no estan permitidos los valores negativos");
        }
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setTitular(cliente titular) {
        this.titular = titular;
    }

    public cliente getTitular() {
        return titular;
    }
}
