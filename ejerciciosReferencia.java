public class ejerciciosReferencia {
    public static void main(String[] args) {
        cuenta cuentaBeni = new cuenta();
        cliente clienteBeni = new cliente();
        cuentaBeni.titular = clienteBeni;
        cuentaBeni.titular.nombre = "beni";

        System.out.println(cuentaBeni.titular.nombre);

    }
}
