import java.util.Scanner;

public class Gerente extends Pessoa {
    private String matricula, senha;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    public void setSenha(String senha) {
        this.senha = senha;
    }

    Scanner teclado = new Scanner(System.in);

    public Gerente(String nome, String CPF, char sexo, Data dtnasc, String matricula, String senha){
        super(nome, CPF, sexo, dtnasc);
        this.matricula = matricula;
        this.senha = senha;
    }

    public Gerente(){
        super();
        System.out.println("Digite uma matrícula:");
        this.matricula = teclado.nextLine();
        this.senha = "123456";
    }

    public boolean validarAcesso(String senha2){
        return this.senha.equals(senha2);
    }

    public boolean validarAcesso(){
        String s;
        System.out.println("Digite sua senha:");
        s = teclado.nextLine();
        return this.validarAcesso(s);
    }
}
