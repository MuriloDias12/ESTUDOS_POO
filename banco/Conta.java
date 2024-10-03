package banco;

import java.sql.SQLOutput;

public class Conta {
    String numero;
    Pessoa titular;
    double saldo;
    double limite;


    public Conta(String numero, Pessoa titular){
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
        this.limite = 200;
        System.out.println("Nova conta adicionada ao sistema");

    }










    void extrato() {
        System.out.println("**** EXTRATO DA CONTA****");
        System.out.println("Numero: " + this.numero);
        System.out.println("Titular:" + this.titular.nome);
        System.out.println("Valor disponivel para saque: " + (this.disponivel()));
        System.out.println(this.saldo);
    }

    double disponivel() {
        return (this.saldo + this.limite);
    }

    double depositar(double valor) {
        return this.saldo += valor;
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

    void chequeEspecial(double juros){
        if(this.saldo < 0){
            this.saldo = this.saldo+ ((this.saldo/100) * juros);




        }
    }


}