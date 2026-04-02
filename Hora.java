package br.gov.sp.fatec.pg.oo;

/**
 * Classe que representa um horário composto por horas, minutos e segundos.
 */
public class Hora {
    // Atributos privados para encapsulamento
    int horas;
    int minutos;
    int segundos;

    /**
     * Construtor padrão. Inicializa o horário como 00:00:00.
     */
    public Hora() {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    /**
     * Construtor parametrizado para inicializar o horário com valores específicos.
     * @param horas Valor das horas (0 a 23).
     * @param minutos Valor dos minutos (0 a 59).
     * @param segundos Valor dos segundos (0 a 59).
     */
    public Hora(int horas, int minutos, int segundos) {
        setHoras(horas);
        setMinutos(minutos);
        setSegundos(segundos);
    }


    /**
     * Define o valor das horas com validação.
     * @param horas Valor a ser definido.
     * @throws IllegalArgumentException Se as horas estiverem fora do intervalo 0-23.
     */
    public void setHoras(int horas) {
     if(horas < 0 || horas > 23) {
        throw new IllegalArgumentException("Horas inválidas");
        }
        this.horas = horas;
    }
    public int getHoras() {
        return horas;
    }

    /**
     * Define o valor dos minutos com validação.
     * @param minutos Valor a ser definido.
     * @throws IllegalArgumentException Se os minutos estiverem fora do intervalo 0-59.
     */
    public void setMinutos(int minutos) {
        if(minutos < 0 || minutos > 59) {
            throw new IllegalArgumentException("Minutos inválidos");
        }
        this.minutos = minutos;
    }
    public int getMinutos() {
        return minutos;
    }

    /**
     * Define o valor dos segundos com validação.
     * @param segundos Valor a ser definido.
     * @throws IllegalArgumentException Se os segundos estiverem fora do intervalo 0-59.
     */
    public void setSegundos(int segundos) {
        if(segundos < 0 || segundos > 59) {
            throw new IllegalArgumentException("Segundos inválidos");
        }
        this.segundos = segundos;
    }
    public int getSegundos() {
        return segundos;
    }

    /**
     * Retorna o horário formatado no padrão HH:mm:ss com zeros à esquerda.
     * @return String contendo o horário formatado.
     */
    public String getHora() {
        String out = "";
        if(getHoras() < 10) out += "0";
        out += getHoras() + ":";
        if(getMinutos() < 10) out += "0";
        out += getMinutos() + ":";
        if(getSegundos() < 10) out += "0";
        out += getSegundos();
        return out;
    }

    /**
     * Verifica se o horário atual pertence ao período da madrugada (00:00 às 05:59).
     * @return true se for madrugada, false caso contrário.
     */
    public boolean isMadrugada() {
        if(getHoras() >=0 && getHoras() < 6) {
            return true;
        }
        return false;
    }
    
    /**
     * Verifica se o horário atual pertence ao período da manhã (06:00 às 11:59).
     * @return true se for manhã, false caso contrário.
     */
    public boolean isManha() {
        if(getHoras() >= 6 && getHoras() < 12) {
            return true;
        }
        return false;
    }

    /**
     * Verifica se o horário atual pertence ao período da tarde (12:00 às 17:59).
     * @return true se for tarde, false caso contrário.
     */
    public boolean isTarde() {
        if(getHoras() >= 12 && getHoras() < 18) {
            return true;
        }
        return false;
    }

    /**
     * Verifica se o horário atual pertence ao período da noite (18:00 às 23:59).
     * @return true se for noite, false caso contrário.
     */
    public boolean isNoite() {
        if(getHoras() >= 18 || getHoras() < 0) {
            return true;
        }
        return false;
    }
}
