
public class Data {
    private int dia, mes, ano;

    public Data() {
        dia = 13;
        mes = 05;
        ano = 2000;
    }

    public Data(int dia) {
        this.dia = dia;
        this.mes = 06;
        this.ano = 2004;
    }

    public Data(int dia, int mes) {
        this.dia = dia;
        this.mes = mes;
        this.ano = 2050;
    }

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String retornarData() {
        if (dia < 10 && mes < 10) {
            return "0" + dia + "/" + "0" + mes + "/" + ano;
        }
        if (dia >= 10 && mes >= 10) {
            return dia + "/" + "0" + mes + "/" + ano;

        }
        return dia + "/" + mes + "/" + ano;
    }

    public int quantidadeDias() {
        return this.dia + this.mes * 30 + this.ano * 365;
    }
}
