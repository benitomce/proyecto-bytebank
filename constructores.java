import java.io.IOException;

/**
 * constructores
 */
public class constructores {

    public static void main(String[] args) throws IOException {
        cuenta cuentaConst = new cuenta(55,786);
        cuenta cuenta2 = new cuenta(333,89213);
        System.out.println(cuentaConst.getAgencia());
        System.out.println(cuenta.getTotal() + cuenta2.getSaldo());
        cuentaConst.setNumero(System.in.read());
    }
}