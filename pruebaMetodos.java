public class pruebaMetodos {
    public static void main(String[] args) {
        cuenta cuentaBeni = new cuenta();
        cuentaBeni.saldo = 300;
        cuentaBeni.titular= "beni";
        cuentaBeni.depositar(200);
        System.out.println("el saldo de " + cuentaBeni.titular + " es: " + cuentaBeni.saldo);

        
        boolean transferencia = cuentaBeni.retirar(400);
        if (transferencia){
            System.out.println("transferencia exitosa");
            System.out.println("el saldo de " + cuentaBeni.titular + " es: " + cuentaBeni.saldo);
        } else {
            System.out.println("retiro invalido");
        }        

        cuenta cuentaJimena = new cuenta();
        cuentaJimena.depositar(1000);
        cuentaJimena.titular="Jimena";
        System.out.println("el saldo de " + cuentaJimena.titular + " es: " + cuentaJimena.saldo);
        cuentaJimena.transferir(400, cuentaBeni);

        System.out.println("el saldo de " + cuentaJimena.titular + " es: " + cuentaJimena.saldo);
        System.out.println("el saldo de " + cuentaBeni.titular + " es: " + cuentaBeni.saldo);
    }
}
