class cuenta {
    private double saldo;
    private int agencia;
    private int numero;

    private static int total = 0;

    public static int getTotal() {
        return cuenta.total;
    }

    public static void setTotal(int total) {
        cuenta.total = total;
    }

    public cuenta(int agencia, int numero) {
        this.numero = numero;
        if (agencia <= 0) {
            System.out.println("no se permiten valores menores a 1");
            this.agencia = 1;
        } else {
            this.agencia = agencia;
            System.out.println("cuenta creada con exito");
        }
        total++;
        System.out.println("se crearon " + total + " cuentas");
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    private cliente titular;

    void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }

    public boolean retirar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transferir(double valor, cuenta Cuenta) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            Cuenta.saldo += valor;
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return this.saldo;
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