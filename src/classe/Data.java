package classe;

public class Data {
    int dia;
    int mes;
    int ano;

    Data(){
        dia = 01;
        mes = 01;
        ano = 1970;
    }
    Data (int diaC, int mesC, int anoC){
        this.dia = diaC;
        this.mes = mesC;
        this.ano = anoC;
    }
    String obterDataFormatada(){
        return String.format("%d/%d/%d", dia, mes, ano);
    }
}
