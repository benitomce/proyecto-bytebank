/**
 * pruebaEncapsulamiento
 */
public class pruebaEncapsulamiento {

    public static void main(String[] args) {
        cuenta cuentaEncap = new cuenta(1231,23123);
        cliente clienteEncap = new cliente();
        clienteEncap.setNombre("beni");
        clienteEncap.setNumeroId("646883");

        cuentaEncap.setTitular(clienteEncap);


        System.out.println(clienteEncap.getNombre());
        System.out.println(cuentaEncap.getTitular().getNombre());
    }
}