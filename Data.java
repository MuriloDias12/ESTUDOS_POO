package banco;

public class Data {
    int dia;
    int mes;
    int ano;





    Data(int d, int m, int a) {
        this.dia = d;
        this.mes = m;
        this.ano = a;
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
