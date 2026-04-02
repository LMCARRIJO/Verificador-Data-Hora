package br.gov.sp.fatec.pg.oo;

/**
 * Classe que representa uma data com dia, mês e ano.
 */
public class Data {
    
    private int dia;
    private int mes;
    private int ano;

    /**
     * Construtor padrão. Inicializa a data como 01/01/2000.
     */
    public Data() {
        this.dia = 1;
        this.mes = 1;
        this.ano = 2000;
    }

    /**
     * Construtor com parâmetros para inicializar dia, mês e ano.
     * @param dia O dia do mês.
     * @param mes O mês do ano.
     * @param ano O ano.
     */
    public Data(int dia, int mes, int ano) {
        setDia(dia);
        setMes(mes);
        setAno(ano);
    }

    /**
     * Define o dia do mês, validando se está entre 1 e 31.
     * @param dia O dia a ser definido.
     * @throws IllegalArgumentException se o dia for inválido.
     */
    public void setDia(int dia) {
        if(dia < 1 || dia > 31) {
            throw new IllegalArgumentException("Dia inválido");
        }
        this.dia = dia;
    }

    public int getDia() {
        return dia;
    }

    /**
     * Define o mês do ano, validando se está entre 1 e 12.
     * @param mes O mês a ser definido.
     * @throws IllegalArgumentException se o mês for inválido.
     */
    public void setMes(int mes) {
        if(mes < 1 || mes > 12) {
            throw new IllegalArgumentException("Mês inválido");
        }
        this.mes = mes;
    }

    public int getMes() {
        return mes;
    }

    /**
     * Define o ano, validando se é um valor positivo.
     * @param ano O ano a ser definido.
     * @throws IllegalArgumentException se o ano for negativo.
     */
    public void setAno(int ano) {
        if(ano < 0) {
            throw new IllegalArgumentException("Ano inválido");
        }
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }
    
    /**
     * Retorna a data formatada no padrão DD/MM/AAAA.
     * @return String contendo a data formatada.
     */
    public String getData() {
        String out = "";
        if(getDia() < 10) out += "0";
        out += getDia() + "/";
        if(getMes() < 10) out += "0";
        out += getMes() + "/";
        out += getAno();
        return out;
    }

    /**
     * Verifica se o ano da data atual é bissexto.
     * @return true se o ano for bissexto, false caso contrário.
     */
    public boolean isBissexto() {
        // Regra: divisível por 4, mas não por 100, exceto se for divisível por 400.
        if(getAno() % 4 == 0 && (getAno() % 100 != 0 || getAno() % 400 == 0)) {
            return true;
        }
        return false;
    }
}
