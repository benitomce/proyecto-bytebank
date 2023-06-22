public class pruebaAcceso {
    public static void main(String[] args) {
        cuenta cuentaPrueba = new cuenta(123,1231);
        cuentaPrueba.depositar(400);
        cuentaPrueba.setAgencia(-35);
        cuentaPrueba.retirar(300);
        //cuentaPrueba.saldo = cuentaPrueba.saldo -300;
        System.out.println(cuentaPrueba.getSaldo());
    }
}
