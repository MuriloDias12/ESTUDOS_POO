package banco;

import java.sql.SQLOutput;

public class Banco{
    public static void main(String[] args) {
        Data data1 = new Data(21,3,2004);
        Data data2 = new Data(21,8,2000);

        System.out.println("TESTANDO CONSTRUTOR DE PESSOAS PASSANDO PARAMETROS");
        Pessoa p1 = new Pessoa("MARIA", "123.456.789-00", data1,'F');
        System.out.println("-------------------------------------------------------");
        System.out.println("TESTANDO CONSTRUTOR DE PESSOAS COM ENTRADA DE DADOS");
        Pessoa p3 = new Pessoa();
        System.out.println("-------------------------------------------------------");

        System.out.println("TESTANDO CONSTRUTOR GERENTE PASSANDO PARAMETROS");
        Gerente g2 = new Gerente("MARCOS", "123456890-66", data2, 'M', "2022177766","12222");
        System.out.println("-------------------------------------------------------");
        System.out.println("TESTANDO CONSTRUTOR DE GERENTES COM ENTRADA DE DADOS");
        Gerente g4 = new Gerente();


        Data d3 = new Data(2,10,2024);

        System.out.println("TESTANDO CONSTRUTOR DE CONTA CORRENTE PASSANDO PARAMETROS");
        ContaCorrente c1 = new ContaCorrente("1234-5", p1, data1,g2);
        ContaCorrente c2 = new ContaCorrente("2345-6", p3, data2,g2);
        System.out.println("-------------------------------------------------------");
        System.out.println("TESTANDO CONSTRUTOR DE CONTA CORRENTE COM ENTRADA DE DADOS");
        ContaCorrente c4 = new ContaCorrente();
        System.out.println("-------------------------------------------------------");
        Conta c5 = new Conta(g2);

        System.out.println("TESTANDO CONSTRUTOR DE POUPANCA PASSANDO PARAMETROS");
        Poupanca poup1 = new Poupanca("5678-9", p1, g2, d3);
        Poupanca poup2 = new Poupanca("55558-9", p3, g4, data1);
        System.out.println("TESTANDO CONSTRUTOR DE POUPANÇA COM ENTRADA DE DADOS");
        Poupanca p5 = new Poupanca();


        // testando metodos

        System.out.println("TESANDO METODO SALDO E DEPOSITO EM TODAS AS CONTAS");
        //poupanças
        System.out.println(poup1.saldo);
        poup1.depositar(300);
        System.out.println(poup1.saldo);
        System.out.println("--------------------------------------");
        System.out.println(poup2.saldo);
        poup1.depositar(700);
        System.out.println(poup1.saldo);
        System.out.println("--------------------------------------");
        System.out.println(p5.saldo);
        poup1.depositar(200);
        System.out.println(p5.saldo);
        System.out.println("--------------------------------------");

        //contas correntes
        System.out.println(c1.saldo);
        c1.depositar(300);
        System.out.println(c1.saldo);
        System.out.println("--------------------------------------");
        System.out.println(c2.saldo);
        c2.depositar(900);
        System.out.println(c2.saldo);
        System.out.println("--------------------------------------");
        System.out.println(c4.saldo);
        c4.depositar(500);
        System.out.println(c4.saldo);
        System.out.println("--------------------------------------");

        //testando extrato de todas as contas

        System.out.println("TESTANDO METODO EXTRATO");
        c1.extrato();
        System.out.println("--------------------------------------");
        c2.extrato();
        System.out.println("--------------------------------------");
        c4.extrato();
        System.out.println("--------------------------------------");
        poup1.extrato();
        System.out.println("--------------------------------------");
        poup2.extrato();
        p5.extrato();
        System.out.println("--------------------------------------");


        //testando saque das contas
        System.out.println("TESTANDO METODO SACAR");
        c1.sacar(150);
        c1.extrato();
        c2.sacar(200);
        c2.extrato();
        c4.sacar(50);
        c4.extrato();

        //testando metodo transferir
        System.out.println("TESTANDO METODO TRANSEFERIR");
        c1.extrato();
        c2.extrato();
        c1.transferir(200,c2);
        c1.extrato();
        c2.extrato();
        System.out.println("--------------------------------------");
        c2.transferir(50,c1);
        c1.extrato();
        c2.extrato();
        System.out.println("--------------------------------------");
        c4.extrato();
        c4.transferir(200,c2);
        c4.extrato();
        c2.extrato();
        System.out.println("--------------------------------------");





}
}