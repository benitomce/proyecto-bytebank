/**
 * pruebaEncapsulamiento
 */
public class pruebaEncapsulamiento {

    public static void main(String[] args) {
        cuenta cuentaEncap = new cuenta();
        cliente clienteEncap = new cliente();
        clienteEncap.setNombre("beni");
        clienteEncap.setNumeroId("646883");

        cuentaEncap.setTitular(clienteEncap);

        cliente titular = cuentaEncap.getTitular();

        System.out.println(clienteEncap.getNombre());
        System.out.println(cuentaEncap.getTitular().getNombre());
    }
}