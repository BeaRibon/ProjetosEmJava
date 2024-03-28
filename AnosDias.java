public class AnosDias {
    
    public int ContaAnos(int[] input){
        input[0] = input[0] * 365;
        input[1] = input[1] * 30;
        return input[0] + input[1] + input[2];
    }

    public static void main(String[] args) {
        AnosDias AnosDias = new AnosDias();
        int[] data = {10, 8, 16};
        int resultado = AnosDias.ContaAnos(data);
        System.out.println(resultado);
    }
}
