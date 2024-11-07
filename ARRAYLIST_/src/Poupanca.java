public class Poupanca extends Conta{

    public Poupanca(String numero, Pessoa titular, Gerente gerente, Data criacao){
        super(numero, titular, gerente, criacao);
    }

    public Poupanca(Pessoa titular,Gerente gerente){
        super(titular, gerente);
    }

    public void extrato(){
        System.out.println("***EXTRATO DE CONTA-POUPANÇA***");
        super.extrato();
    }

    public void rendimento(double juros){
        this.saldo = this.saldo + ((this.saldo/100)*juros);
    }
}
