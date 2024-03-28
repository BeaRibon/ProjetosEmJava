

public class Fibonacci{
    public static String geraSequenciaFibonacci(int input) {
        StringBuilder sequencia = new StringBuilder();

        int a = 0;
        int b = 1;
        sequencia.append(a).append(", ").append(b);

        while (true) {
            int c = a + b;
            if (c > input) {
                break;
            }
            sequencia.append(", ").append(c);
            a = b;
            b = c;
        }

        return sequencia.toString();
    }


    public static void main(String[] args) {
        int input = 10;
        String sequencia = geraSequenciaFibonacci(input);
        System.out.println(sequencia);
    }
}