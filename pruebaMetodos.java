public class pruebaMetodos {
    public static void main(String[] args) {
        cuenta cuentaBeni = new cuenta();
        cuentaBeni.depositar(200);
        System.out.println("el saldo de " + cuentaBeni.titular + " es: " + cuentaBeni.getSaldo());

        
        boolean transferencia = cuentaBeni.retirar(400);
        if (transferencia){
            System.out.println("transferencia exitosa");
            System.out.println("el saldo de " + cuentaBeni.titular + " es: " + cuentaBeni.getSaldo());
        } else {
            System.out.println("retiro invalido");
        }        

        cuenta cuentaJimena = new cuenta();
        cuentaJimena.depositar(1000);
        System.out.println("el saldo de " + cuentaJimena.titular + " es: " + cuentaJimena.getSaldo());
        cuentaJimena.transferir(400, cuentaBeni);

        System.out.println("el saldo de " + cuentaJimena.titular + " es: " + cuentaJimena.getSaldo());
        System.out.println("el saldo de " + cuentaBeni.titular + " es: " + cuentaBeni.getSaldo());
    }
}
