import java.math.BigDecimal;
import java.math.RoundingMode;

public class Imposto {
    public static double valorProdutoFinal(double[] input) {
        double resultado = 0;
        if(input[1] == 1.0 ){
           resultado =  input[0] + (input[0] * 0.07);
           return resultado;
        }else if(input[1] == 2.0){
            resultado = input[0] + (input[0] * 0.12);
            return resultado;
        }else if(input[1] == 3.0){
            resultado = input[0] + (input[0] * 0.15);
            return resultado;
        }else{
            return -1;
        }
        
    }

    public static void main(String[] args) {
        double[] data = {22.1, 1};
        
        double resultado = valorProdutoFinal(data);
        BigDecimal bd = new BigDecimal(resultado).setScale(4, RoundingMode.HALF_EVEN);
        System.out.println(bd.doubleValue());
    }
}
