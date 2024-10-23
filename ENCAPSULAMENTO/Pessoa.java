import java.util.Scanner;

public class Pessoa {

    protected String nome, CPF;
    protected char sexo;
    protected Data dtNasc;
    protected Scanner teclado = new Scanner(System.in);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Data getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(Data dtNasc) {
        this.dtNasc = dtNasc;
    }



    public Pessoa(String nome, String CPF, char sexo, Data dtNasc){
        this.nome = nome;
        this.CPF = CPF;
        this.sexo = sexo;
        this.dtNasc = dtNasc;
        System.out.println("Nova pessoa criada.");
    }

    public Pessoa(){
        System.out.println("Digite um nome:");
        this.nome = teclado.nextLine();
        System.out.println("Digite um CPF:");
        this.CPF = teclado.nextLine();
        System.out.println("Digite um sexo com F(feminino) ou M(masculino):");
        this.sexo = teclado.next().charAt(0);
        System.out.println("Digite sua data de nascimento:");
        this.dtNasc = new Data();  
    }

    public int idade(Data atualData){
        int idade = 0;
        idade = atualData.getAno() - this.dtNasc.getAno();
        if (this.dtNasc.getMes() > atualData.getMes()){
            idade--;
        }else if(this.dtNasc.getMes() == atualData.getMes()){
            if(this.dtNasc.getDia() > atualData.getDia()){
                idade--;
            }
        }
        
        return idade;
    }



}
