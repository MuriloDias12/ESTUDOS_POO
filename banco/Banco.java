package banco;

public class Banco{
    public static void main(String[] args) {
        Data data1 = new Data(21,3,2004);
        Data data2 = new Data(21,8,2000);


        Pessoa p1 = new Pessoa("MARIA", "123.456.789-00", data1,'F');
        Pessoa p2 = new Pessoa("João", "234.567.890-00", data2, 'M');



        Data d3 = new Data(2,10,2024);

        Conta c1 = new Conta("1234-5", p1);
        Conta c2 = new Conta("2345-6", p2);



        c1.extrato();
        c2.extrato();



        c1.sacar(150);
        c1.transferir(100,c2);
        c1.sacar(100);
        c1.depositar(100);
        c1.transferir(200,c2);
        System.out.println(c1.saldo);

        data1.imprimir();
        data2.imprimir();

       int idade = p2.calcIdade(d3);
        System.out.println(idade);


        for (int i = 1; i <= 120; i++) {
            c1.chequeEspecial(0.5);
            if (i % 30 == 0) {
                System.out.printf("Saldo apos: %d dia : %.2f\n", i, c1.saldo);
            }
        }

    }
}