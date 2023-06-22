public class pruebaMetodos {
    public static void main(String[] args) {
        cuenta cuentaBeni = new cuenta(123,4534);
        cuentaBeni.depositar(200);
        System.out.println("el saldo de " + cuentaBeni.getTitular() + " es: " + cuentaBeni.getSaldo());

        
        boolean transferencia = cuentaBeni.retirar(400);
        if (transferencia){
            System.out.println("transferencia exitosa");
            System.out.println("el saldo de " + cuentaBeni.getTitular() + " es: " + cuentaBeni.getSaldo());
        } else {
            System.out.println("retiro invalido");
        }        

        cuenta cuentaJimena = new cuenta(345,3453);
        cuentaJimena.depositar(1000);
        System.out.println("el saldo de " + cuentaJimena.getTitular() + " es: " + cuentaJimena.getSaldo());
        cuentaJimena.transferir(400, cuentaBeni);

        System.out.println("el saldo de " + cuentaJimena.getTitular() + " es: " + cuentaJimena.getSaldo());
        System.out.println("el saldo de " + cuentaBeni.getTitular() + " es: " + cuentaBeni.getSaldo());
    }
}
