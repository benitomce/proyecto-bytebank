public class gerente extends funcionario {
    private String password;

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean autenticar(String password){
        if(this.password == password){
            return true;
        } else {
            return false;
        }
    }
}
