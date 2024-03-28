import java.math.BigDecimal;
import java.math.RoundingMode;

public class CompraDeCarro {
    public static double[] custosCarro( double[] input) {
        double[] percetuais = new double[2];

        percetuais[0] = (input[1]/input[0])*100;
        percetuais[1] = (input[2]/input[0])*100;


        return percetuais;
    }
    public static void main(String[] args){
            double[] data = { 121000,14350, 21450};
            double[] resultado = custosCarro((data));
            for(int i = 0; i < resultado.length; i++){
                BigDecimal bd = new BigDecimal(resultado[i]).setScale(2, RoundingMode.HALF_EVEN);
                System.out.println(bd.doubleValue());
            }
    }
}
