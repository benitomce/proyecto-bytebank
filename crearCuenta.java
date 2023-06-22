public class crearCuenta {
    public static void main(String[] args) {
        cuenta primeraCuenta = new cuenta(123,123123);
        primeraCuenta.depositar(1000);
        System.out.println(primeraCuenta.getSaldo());

        cuenta segundaCuenta = new cuenta(123,1321);
        System.out.println(segundaCuenta.getSaldo());

        System.out.println(primeraCuenta.getAgencia());
    }
    
}
