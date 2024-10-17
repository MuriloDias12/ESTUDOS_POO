package banco;
import java.util.Scanner;
import java.sql.SQLOutput;

public class Pessoa {
        String nome;
        String cpf;
        Data dtNascimento;
        char sexo;




        Pessoa(String nome, String cpf, Data idade, char sexo) {
            this.nome = nome;
            this.dtNascimento = idade;
            this.sexo = sexo;
            this.cpf = cpf;
            System.out.println(" NOVA pessoa criada no sistema = "+ this.nome);
        }

        Pessoa(){
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite seu nome: ");
            this.nome = sc.nextLine();
            System.out.println("Digite seu cpf: ");
            this.cpf = sc.nextLine();
            System.out.println("Digite a data de Nascimento: ");
            this.dtNascimento = new Data();
            System.out.println("Digite o sexo: ");
            this.sexo = sc.next().charAt(0);
            System.out.println(" NOVA pessoa criada no sistema = "+ this.nome);
        }





    int calcIdade(Data dataHoje){
            int idade;
            idade = dataHoje.ano - this.dtNascimento.ano;
            if (this.dtNascimento.mes > dataHoje.mes){
                idade = idade - 1;
            }

            else if (this.dtNascimento.mes == dataHoje.mes) {
                if(this.dtNascimento.dia > dataHoje.dia){
                    idade = idade - 1;
                }
            }

            return idade;


        }
}
