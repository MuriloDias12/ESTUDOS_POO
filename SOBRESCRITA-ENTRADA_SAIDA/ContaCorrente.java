package banco;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ContaCorrente extends Conta {
    double limite;


    public ContaCorrente(String numero, Pessoa titular, Data criacao, Gerente ger){
        super(numero, titular, criacao,ger);
        this.limite = 200;
    }

    ContaCorrente(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o numero da conta: ");
        this.numero = sc.nextLine();
        System.out.println("Insira o titular da conta:");
        this.titular = new Pessoa();
        System.out.println("Data de Criação: ");
        this.criacao = new Data();
        System.out.println("Insira o gerente da conta: ");
        this.ger = new Gerente();

    }



    public double disponivel(){
        return this.saldo+this.limite;
    }

    void extrato(){
        System.out.println("EXTRATO DA CONTA-CORRENTE");
        super.extrato();
    }
    boolean sacar(double valor) {
        if (valor <= this.disponivel()) {
            this.saldo -= valor;
            System.out.println("Saque na conta " + this.numero + " realizado com suceso. Novo Saldo =  " + this.saldo);
            return true;

        } else {
            System.out.println("Erro não foi possivel realizar o saque na conta:  " + this.numero + " valor disponivel para sacar = " + this.disponivel());
            return false;
        }
    }

    boolean transferir(double valor, Conta destino) {
        if (this.sacar(valor)) {
            destino.depositar(valor);
            System.out.println("Trasnferencia de " + valor + " da conta" + this.numero + "para conta  " + destino.numero + " foi realizada com sucesso!!");
            return true;


        } else {
            System.out.println("ERROR: Não foi possivel transferir  " + valor + " da conta  " + this.numero + " para conta " + destino.numero + " Valor disponivel = " + this.disponivel());
            return false;
        }
    }

    void alterarLimite(double valor, String senha){
        if(this.ger.validarAcesso(senha)){
            this.limite = valor;
        }
        else {
            System.out.println("Senha incorreta");
        }

    }

    void alterarLimite(){
        if(this.ger.validarAcesso()){
            Scanner sc = new Scanner(System.in);
            System.out.println("Insira o novo limite: ");
            this.limite = sc.nextDouble();
        }
        else{
            System.out.println("Senha incorreta!");

        }

    }


    void chequeEspecial(double juros) {
        if (this.saldo < 0) {
            this.saldo = this.saldo + ((this.saldo / 100) * juros);


        }
    }
}