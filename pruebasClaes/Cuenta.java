package pruebasClaes;

public class Cuenta {
    private String titular;
    private double saldo;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void deposita(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    public void retirar(double valor) {
        if (valor > 0 && saldo >= valor) {
            this.saldo -= valor;
        }
    }

    public double getSaldo() {
        return saldo;
    }


    
    public static void main(String[] args) {

        Cuenta cuentaNew = new Cuenta();
        cuentaNew.setTitular("Beni");
        cuentaNew.deposita(100);

        double valorRetiro = 800.0;

        cuentaNew.retirar(valorRetiro);

        System.out.println(cuentaNew.getSaldo());

    }

}