public class Substrings {
    public static String[] substringStr(String[] input) {

        String[] substrings = new String[input.length];
        int count = 0;

        for (int i = 0; i < input.length; i++) {
            String palavraAtual = input[i];
            for (int j = 0; j < input.length; j++) {

                if (i != j) {
                    String outraPalavra = input[j];

                    if (outraPalavra.contains(palavraAtual)) {
                        substrings[count] = palavraAtual;
                        count++;
                        break;
                    }
                }
            }
        }

        String[] resultado = new String[count];
        for (int i = 0; i < count; i++) {
            resultado[i] = substrings[i];
        }

        return resultado;
    }

    public static void main(String[] args) {

        String[] palavras = { "banana", "ana", "maçã", "abacaxi", "axi" };
        String[] resultado = substringStr(palavras);

        if (resultado.length > 0) {
            for (String substring : resultado) {
                System.out.println(substring);
            }
        } else {
            String[] array = { "" };
            System.out.println(array);
        }
    }
}
