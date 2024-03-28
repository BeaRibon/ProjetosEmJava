public class Unic {
    public static int numeroUnico( int[] input) {
        for (int i = 0; i < input.length; i++) {
            boolean repetido = false;
            for (int j = 0; j < input.length; j++) {
                if (i != j && input[i] == input[j]) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                return input[i];
            }
        }
        return -1; // Nenhum número único encontrado

    }

    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2, 2, 3, 3};

        System.out.println(numeroUnico(array));
    }
}
