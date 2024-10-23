public class Banco {
    public static void main(String[] args) {
        Data dtNascP3 = new Data(10,10,2004);
        Data dtNascP4 = new Data(10,12,2000);
        Data dtNascGer2 = new Data(20, 5, 1992);
        Data dtCriacao1 = new Data(9,10,2024);
        Data dtCriacao2 = new Data(1,5,2023);
        
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa("Maria", "123.456.789-00",'F',dtNascP3);   
        Pessoa p4 = new Pessoa("João", "234.567.890-00", 'M',dtNascP4);

        Gerente ger1 = new Gerente();
        Gerente ger2 = new Gerente("Mario", "111.111.111-00",'M',dtNascGer2, "101010", "senha");

        ContaCorrente cc1 = new ContaCorrente(ger1);
        ContaCorrente cc2 = new ContaCorrente("1234-5", p3, ger2, dtCriacao1);

        Poupanca cp1 = new Poupanca(ger2);
        Poupanca cp2 = new Poupanca("2345-6", p4, ger2, dtCriacao2);

        System.out.println("\n" + "Teste da Conta Corrente:");
        System.out.println();
        cc1.extrato();
        System.out.println();
        cc2.extrato();
        System.out.println();

        cc1.depositar(10000);
        cc1.transferir(4000, cc2);
        cc1.transferir(3000,cp1);
        cc2.transferir(1000, cp2);

        System.out.println(cc1.disponivel());
        cc1.alterarLimite();
        System.out.println(cc1.disponivel());

        System.out.println();

        System.out.println(cc2.disponivel());
        cc2.alterarLimite("senha", 12000);
        System.out.println(cc2.disponivel());

        System.out.println("\n" + "Teste da Conta Poupança:");
        System.out.println();
        cp1.extrato();
        System.out.println();
        cp2.extrato();
        System.out.println();

        System.out.println(cp1.disponivel());
        for(int i = 1; i <= 120; i++){
            cp1.rendimento(0.5);   
            if(i%30 == 0){
                System.out.printf("Saldo apos %d dia: %.2f\n", i, cp1.saldo);
            }   
        }

        System.out.println();
        cp1.sacar(cp1.saldo);
        System.out.println(cp1.disponivel());
    }
}
