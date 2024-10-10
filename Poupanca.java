package banco;

public class Poupanca extends Conta {

    Poupanca(String numero, Pessoa titular, Gerente ger, Data criacao) {
        super(numero, titular, criacao, ger);
    }


    double disponivel() {
        return (this.saldo);
    }

    void extrato() {
        System.out.println("**** EXTRATO DA CONTA****");
        System.out.println("Numero: " + this.numero);
        System.out.println("Titular:" + this.titular.nome);
        System.out.println("Valor disponivel para saque: " + (this.disponivel()));
        System.out.println(this.saldo);
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




    double rendimentos(double juros){
        double rendimento;
        rendimento = this.saldo * juros;
        return rendimento;
    }




    }
