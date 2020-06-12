/**
 * @Author Pedro Guilherme
 * @version 1.0
 * @since 01/06/2020 - 08:13
 * @Category Model
 */
public class Trimestre {

    private int mes;

    public Trimestre() {
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * @return retorna o número digitado em um trimestre do ano.
     */
    public String verificarMes() {
        switch (this.mes) {
            case 1:
                return ("1º Trimestre");
            case 2:
                return ("1º Trimestre");
            case 3:
                return ("1º Trimestre");
            case 4:
                return ("2º Trimestre");
            case 5:
                return ("2º Trimestre");
            case 6:
                return ("2º Trimestre");
            case 7:
                return ("3º Trimestre");
            case 8:
                return ("3º Trimestre");
            case 9:
                return ("3º Trimestre");
            case 10:
                return ("4º Trimestre");
            case 11:
                return ("4º Trimestre");
            case 12:
                return ("4º Trimestre");
            default:
                return ("Mês inválido");
        }
    }
    public String toString() {
        return "Mês digitado: " + this.mes
                + "\nTrimestre: " + this.verificarMes();
    }
}