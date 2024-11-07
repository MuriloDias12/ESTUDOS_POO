import java.util.ArrayList;
import java.util.Scanner;


public class Banco {
    public static int menuInicial(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo ! Escolha uma opção. \n");
        System.out.println("1) Cadastro");
        System.out.println("2) Movimentação Financeira");
        System.out.println("0) Sair");

        return sc.nextInt();
    }

    public static void menuCadastro(ArrayList<Pessoa> p, ArrayList<Gerente> g, ArrayList<Conta> c){
        Scanner sc = new Scanner(System.in);
        System.out.println("Oque deseja cadastrar?");
        System.out.println("1) Novo cliente");
        System.out.println("2) Novo gerente");
        System.out.println("3) nova conta corrente");
        System.out.println("4) Nova poupança");

        int op = sc.nextInt();

        if(op == 1)p.add(new Pessoa());
        if(op == 2)g.add(new Gerente());
        if(op == 3){
            Pessoa tit = escolherPessoa(p);
            Gerente ger = escolherGerente(g);
            c.add(new ContaCorrente(tit, ger));
        }
        if(op == 4){
            Pessoa tit = escolherPessoa(p);
            Gerente ger = escolherGerente(g);
            c.add(new Poupanca(tit, ger));
        }
    }

    public static Pessoa escolherPessoa(ArrayList<Pessoa> p){
        Scanner sc = new Scanner(System.in);
        int i = 1;
        System.out.println("Escolha o cliente da conta: ");
        for(Pessoa tit : p){
            System.out.println(i+""+ tit.getCPF()+ "-"+tit.getNome());
            i++;
        }
        int index = sc.nextInt();
        return p.get(index-1);
    }

    public static Gerente escolherGerente(ArrayList<Gerente> g){
        Scanner sc = new Scanner(System.in);
        int i = 1;
        System.out.println("Escolha o gerente da conta: ");
        for(Gerente ger : g){
            System.out.println(i+""+ ger.getCPF()+ "-"+ger.getNome());
            i++;
        }
        int index = sc.nextInt();
        return g.get(index-1);
    }

    public static void menuMovimentacoes(ArrayList<Pessoa>p, ArrayList<Gerente>g, ArrayList<Conta>c){
        Scanner sc = new Scanner(System.in);

        Conta conta1 = escolherConta(c);
        System.out.println("Oque deseja realizar? ");
        System.out.println("1) Extrato");
        System.out.println("2) Saque");
        System.out.println("3) Deposito");
        System.out.println("4) Transferencia");

        int op = sc.nextInt();

        if(op == 1)conta1.extrato();
        if(op == 2)conta1.sacar();
        if(op == 3)conta1.depositar();
        if(op == 4){
            System.out.println("Qual a conta destino?");
            Conta conta2 = escolherConta(c);
            conta1.transferir(conta2);

        }




    }

    public static Conta escolherConta(ArrayList<Conta> c){
        Scanner sc = new Scanner(System.in);
        int i = 1;
        System.out.println("Escolha a conta: ");
        for(Conta cc : c){
            System.out.println(i+""+cc.getNumero()+"-"+cc.getTitular().getNome());
            i++;

        }
        int index = sc.nextInt();
        return c.get(index-1);
    }

    public static void main(String[] args) {

        ArrayList<Pessoa> pessoas = new ArrayList<>();
        ArrayList<Gerente> gerentes = new ArrayList<>();
        ArrayList<Conta> contas = new ArrayList<>();

        int op = menuInicial();
        while(op != 0){
            if(op == 1){
                menuCadastro(pessoas, gerentes, contas);
            }
            if(op == 2){
                menuMovimentacoes(pessoas, gerentes, contas);
            }
            op = menuInicial();
        }
    }

}