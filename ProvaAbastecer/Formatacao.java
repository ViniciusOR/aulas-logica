import java.text.DecimalFormat;

public class Formatacao {
   
    /**
     * Return Retorna o valor informado formatado em duas casas decimais após a vírgula
     */
    public static String formatar(double valor) {  
    DecimalFormat decimalFormat = new DecimalFormat("0.00");  
    return decimalFormat.format(valor);
}
    
}