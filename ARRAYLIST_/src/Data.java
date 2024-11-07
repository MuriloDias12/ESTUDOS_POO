import java.util.Scanner;

public class Data {
    private int dia, mes, ano;

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    Scanner teclado = new Scanner(System.in);

    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public Data(){
        System.out.println("Digite o dia:");
        this.dia = teclado.nextInt();
        System.out.println("Digite o mes:");
        this.mes = teclado.nextInt();
        System.out.println("Digite o ano:");
        this.ano = teclado.nextInt();
    }

    public void imprimirData(){
        System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
    }

    public boolean maior(Data d2){
        if(this.ano < d2.ano){
            return false;
        }else if(this.ano > d2.ano){
            return true;
        }

        else if(this.mes < d2.mes){
            return false;
        }else if(this.mes > d2.mes){
            return true;
        }

        else if(this.dia < d2.dia){
            return false;
        }

        else{
            return false;
        }
    }

    public int getDia(){
        return this.dia;
    }
    public int getMes(){
        return this.mes;
    }
    public int getAno(){
        return this.ano;
    }
}
