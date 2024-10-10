package banco;

import java.sql.SQLOutput;

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

    double depositar(double valor) {
        return this.saldo += valor;
    }







}