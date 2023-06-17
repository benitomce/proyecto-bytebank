public class testReferencia {
    public static void main(String[] args) {
        cuenta primerCuenta = new cuenta();
        primerCuenta.saldo=200;

        cuenta segundaCuenta = primerCuenta;

    segundaCuenta.saldo = 100;
    }
}
