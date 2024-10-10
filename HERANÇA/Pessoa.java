package banco;

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
            System.out.println(" NOVA pessoa criada no sistema "+ this.nome);
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
