public class ejerciciosReferencia {
    public static void main(String[] args) {
        cuenta cuentaBeni = new cuenta(123,12312);
        cliente clienteBeni = new cliente();
        cuentaBeni.setTitular(clienteBeni);;
        cuentaBeni.getTitular().getNombre();

        System.out.println(cuentaBeni.getTitular().getNombre());

    }
}
