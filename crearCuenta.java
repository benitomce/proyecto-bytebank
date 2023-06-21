public class crearCuenta {
    public static void main(String[] args) {
        cuenta primeraCuenta = new cuenta();
        primeraCuenta.getSaldo = 10000;
        System.out.println(primeraCuenta.getSaldo());

        cuenta segundaCuenta = new cuenta();
        System.out.println(segundaCuenta.getSaldo);

        System.out.println(primeraCuenta.agencia);
    }
    
}
