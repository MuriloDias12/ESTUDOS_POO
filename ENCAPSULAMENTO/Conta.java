import java.util.Scanner;

public class Conta {
    protected String numero;
    protected Pessoa titular;
    protected double saldo;
    protected Data criacao;
    protected Gerente gerente;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Data getCriacao() {
        return criacao;
    }

    public void setCriacao(Data criacao) {
        this.criacao = criacao;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }


    protected Scanner teclado = new Scanner(System.in);

   public Conta(String numero, Pessoa titular, Gerente gerente, Data criacao){
        this.numero = numero;
        this.titular = titular;
        this.criacao = criacao;
        this.gerente = gerente;
        this.saldo = 0;
        System.out.println("Nova conta adicionada ao sistema");
    }
    public Conta(Gerente gerente){
        System.out.println("Digite o numero da conta:");
        this.numero = teclado.next();
        this.titular = new Pessoa();
        this.criacao = new Data();
        this.gerente = gerente;
        this.saldo = 0;
        System.out.println("Nova conta adicionada ao sistema");
    }
    public void depositar(double valor){
        this.saldo += valor;
    }

    protected double disponivel(){
        return this.saldo;
    }

    public void extrato(){
        System.out.println("Conta: " + this.numero);
        System.out.println("Titular: " + this.titular.CPF);
        System.out.println("Saldo disponivel para saque: " + this.disponivel());
    }

    public boolean sacar(double valor){
        if (valor <= this.disponivel()){
            this.saldo -= valor;
            System.out.println("Saque na conta: " + this.numero + " realizado com sucesso.");
            System.out.println("Novo saldo: " + this.disponivel());
            return true;
        }else{
            System.out.println("ERRO: Saque na conta " + this.numero + " nao foi realizado.");
            System.out.println("Valor disponível: " + this.disponivel());
            return false;
        }
    }

   public boolean transferir(double valor, Conta destino){
        if(this.sacar(valor)){
            destino.depositar(valor);
            System.out.println("Transferencia de " + valor + " da conta " + this.numero + " para a conta " + destino.numero + " foi realizada com sucesso");
            return true;
        }else{
            System.out.println("ERRO: Não foi possível transferir " + valor + " da conta " + this.numero + " para a conta " + destino.numero);
            System.out.println("Valor disponivel: " + this.disponivel());
            return false;
        }

    }
    public double getSaldo(){
       return this.saldo;
    }


    
}
