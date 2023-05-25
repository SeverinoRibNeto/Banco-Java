public class Usuario {
    String nome;
    String tipoConta;
    double saldo;


    public Usuario(String nome, String tipoConta){
        this.nome = nome;
        this.tipoConta=tipoConta;
        this.saldo=0;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getTipoConta() {
        return this.tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
