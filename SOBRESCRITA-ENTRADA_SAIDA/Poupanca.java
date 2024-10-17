package banco;
import java.util.Scanner;
public class Poupanca extends Conta {

    Poupanca(String numero, Pessoa titular, Gerente ger, Data criacao) {
        super(numero, titular, criacao, ger);
    }

    Poupanca(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero: ");
        this.numero = sc.nextLine();
        System.out.println("Digite o titular: ");
        this.titular = new Pessoa();
        System.out.println("Digite o gerente: ");
        this.ger = new Gerente();
        System.out.println("Data de criação: ");
        this.criacao = new Data();
    }

    void extrato() {
        System.out.println("EXTRATO DA CONTA-POUPANÇA");
        super.extrato();
    }

    void rendimentos( double juro){
        this.saldo = this.saldo+ (juro*this.saldo)/100;
    }

}