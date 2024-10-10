package banco;

public class Banco{
    public static void main(String[] args) {
        Data data1 = new Data(21,3,2004);
        Data data2 = new Data(21,8,2000);


        Pessoa p1 = new Pessoa("MARIA", "123.456.789-00", data1,'F');
        Pessoa p2 = new Pessoa("João", "234.567.890-00", data2, 'M');

        Gerente g1 = new Gerente("CARLOS", "123456890-66", data2, 'M', "202215566","12345");
        Gerente g2 = new Gerente("MARCOS", "123456890-66", data2, 'M', "2022177766","12222");

        Data d3 = new Data(2,10,2024);

        ContaCorrente c1 = new ContaCorrente("1234-5", p1, data1,g1);
        ContaCorrente c2 = new ContaCorrente("2345-6", p2, data2,g2);

        Poupanca poup1 = new Poupanca("5678-9", p1, g2, d3);
        Poupanca poup2 = new Poupanca("55558-9", p2, g1, data1);

        poup1.depositar(100);

        double disponivel = poup1.disponivel();
        System.out.println("--------------------------------------");
        System.out.println("valor disponivel é de : R$ " +disponivel);
        System.out.println("--------------------------------------");
        c1.extrato();
        System.out.println("--------------------------------------");
        c2.extrato();
        System.out.println("--------------------------------------");
        c1.sacar(150);
        System.out.println("--------------------------------------");
        c1.transferir(100,c2);
        System.out.println("--------------------------------------");

        System.out.println("Saldo da conta " + c1.saldo);
        System.out.println("--------------------------------------");
        data1.imprimir();
        System.out.println("--------------------------------------");
        data2.imprimir();
        System.out.println("--------------------------------------");
        System.out.println( "a senha do gerente  1 é: " + g1.validarAcesso("12345"));
        System.out.println("--------------------------------------");
        System.out.println( "a senha do gerente  2 é: " + g2.validarAcesso("12345"));
        System.out.println("--------------------------------------");
        System.out.println("Rendimento total: " + (poup1.disponivel() + poup1.rendimentos(0.25)));
        System.out.println("--------------------------------------");

        System.out.println("a data 1 é maior? " + data1.maior(data2));
        System.out.println("--------------------------------------");
        System.out.println("a data 2 é maior? " + data2.maior(data1));
        System.out.println("--------------------------------------");

        int idade = p2.calcIdade(d3);
       System.out.println(" a idade é de "+ idade + " anos");


        for (int i = 1; i <= 60; i++) {

            if (i % 30 == 0) {
                System.out.printf("Saldo apos: %d dia : %.2f\n", i, c1.saldo);
            }
        }

    }
}