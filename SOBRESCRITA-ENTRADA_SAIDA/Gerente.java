package banco;

import java.util.Scanner;

public class Gerente extends Pessoa {
    String matricula;
    String senha;


   public Gerente(String nome, String cpf, Data dtNasc, char sexo, String matricula, String senha) {
       super(nome,cpf, dtNasc, sexo);
       this.matricula = matricula;
       this.senha = senha;


   }
   Gerente(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Digite seu nome: ");
       this.nome = sc.nextLine();
       System.out.println("Digite seu cpf: ");
       this.cpf = sc.nextLine();
       System.out.println("Digite sua data de nascimento: ");
       this.dtNascimento = new Data();
       System.out.println("digite seu sexo: ");
       this.sexo = sc.next().charAt(0);
       System.out.println("Digite a matricula: ");
       this.matricula = sc.nextLine();
       this.senha = "123456";
   }




    public boolean validarAcesso(String senha) {
        return this.senha.equals(senha);


    }

    boolean validarAcesso(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu senha: ");
        String senha1 = sc.nextLine();

        return this.validarAcesso(senha1);
    }

}
