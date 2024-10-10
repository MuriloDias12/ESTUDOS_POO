package banco;

public class Gerente extends Pessoa {
    String matricula;
    String senha;


   public Gerente(String nome, String cpf, Data dtNasc, char sexo, String matricula, String senha) {
       super(nome,cpf, dtNasc, sexo);
       this.matricula = matricula;
       this.senha = senha;


   }

    public boolean validarAcesso(String senha) {
        return this.senha.equals(senha);


    }


}
