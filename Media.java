public class Media {
    public static String mediaAproveitamento(double[] input) {
        String conceito = "";
        double media = (input[0] + input[1] * 2 + input[2] * 3 + input[3])/7;
        if(media >= 9.0){
            conceito = "A";
        }else if(media >= 7.5 && media < 9.0 ){
            conceito = "B";
        }else if(media >= 6.0 && media < 7.5){
            conceito = "C";
        }else{
            conceito = "D";
        }
        return conceito;
        }

    public static void main(String[] args) {
        double[] notas = {5.0, 4.3, 8.0, 7.0};
        System.out.println(mediaAproveitamento(notas)); 

    }
}
