import java.text.DecimalFormat;
public class SalarioNovo {

    public static double calculoSalario(double[] input){
        double tempoTrabalhado = input[0];
        double porcetagemInflacao = input[1]/100;
        double novoSalario = 0;

        if(tempoTrabalhado < 5){
            novoSalario = input[2] *(1 + (0.01 + porcetagemInflacao));
            return novoSalario;
        }else if((tempoTrabalhado > 5) || (tempoTrabalhado <= 10)){
            novoSalario = input[2] * (1 +(0.015 + porcetagemInflacao));
            return novoSalario;
        }else{
            novoSalario = input[2] * (1 +(0.02 + porcetagemInflacao));
            return novoSalario;
        }
    };

    public static void main(String[] args) {
        double[] data = {1, 5.0, 2000.00};
        double resultado = calculoSalario(data);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println(df.format(resultado));
        // Saída: 2120.00

    }

}
