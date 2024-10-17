package banco;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Conta {
    String numero;
    Pessoa titular;
    double saldo;
    Gerente ger;
    Data criacao;

    public Conta(String numero, Pessoa titular, Data criacao, Gerente ger) {
        this.numero = numero;
        this.titular = titular;
        this.ger = ger;
        this.saldo = 0;
        this.criacao = criacao;
        System.out.println("Nova conta adicionada ao sistema ! "+ " "+ this.numero +" "+  this.titular.nome);

    }

    Conta(Gerente ger){
        Scanner sc = new Scanner(System.in);
        this.ger = ger;
        System.out.println("Informe o numero da conta: ");
        this.numero = sc.nextLine();
        System.out.println("Informe o titular da conta:");
        this.titular = new Pessoa();
        System.out.println("Informe a Data de criação:");
        this.criacao = new Data();
    }

    public Conta() {
    }


    double depositar(double valor) {
        return this.saldo += valor;
    }

    public double disponivel(){
        return this.saldo;
    }







   void extrato() {
           System.out.println("**** EXTRATO DA CONTA****");
           System.out.println("Numero: " + this.numero);
           System.out.println("Titular:" + this.titular.nome);
           System.out.println("Valor disponivel para saque: " + (this.disponivel()));
           System.out.println(this.saldo);
}      }