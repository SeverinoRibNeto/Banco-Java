public class Usuario {
    String nome;
    String tipoConta;
    double saldo;


    public Usuario(String nome, String tipoConta){
        this.setNome(nome);
        this.setTipoConta(tipoConta);
        this.setSaldo(0);
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public void transferirDinheiro(double valor){
        // Função recebe o valor a ser transferido e desconta do saldo total
        double saldo_atual = this.getSaldo();
        saldo_atual -= valor;
        this.setSaldo(saldo_atual);
    }

    public double verSaldo(){
        return this.getSaldo();
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
