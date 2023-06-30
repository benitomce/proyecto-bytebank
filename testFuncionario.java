public class testFuncionario {
    public static void main(String[] args) {
        gerente beni = new gerente();
        beni.setNombre("Beni");
        beni.setDocumentoID(89798);
        beni.setSalario(10000);


        beni.setPassword("Admin");
        boolean autentico = beni.autenticar("Admin");
        System.out.println(autentico);

    }
}
