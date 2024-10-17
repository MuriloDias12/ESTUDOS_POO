package banco;

import java.util.Scanner;

public class Data {
    int dia;
    int mes;
    int ano;





    Data(int d, int m, int a) {
        this.dia = d;
        this.mes = m;
        this.ano = a;
    }

    Data(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o dia: ");
        this.dia = sc.nextInt();


        System.out.println("Digite o mes: ");
        this.mes = sc.nextInt();

        System.out.println("Digite o ano: ");
        this.ano = sc.nextInt();
    }


    void imprimir(){
        System.out.println(this.dia+"/"+this.mes+"/"+this.ano);

    }


    boolean maior(Data d2) {
        if (this.ano > d2.ano) {
            return true;
        } else if (this.ano == d2.ano) {
            if (this.mes > d2.mes) {
                return true;
            } else if (this.mes == d2.mes) {
                return this.dia > d2.dia;
            }
        }
        return false;
    }


}
