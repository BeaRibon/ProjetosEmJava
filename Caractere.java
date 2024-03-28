import java.util.HashMap;
import java.util.Map;

public class Caractere {
    public static int primeiroCaractereUnico(String input) {
        Map<Character, Integer> contador = new HashMap<>();


        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            contador.put(c, contador.getOrDefault(c, 0) + 1);
        }


        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (contador.get(c) == 1) {
                return i; 
            }
        }


        return -1;
    }

    public static void main(String[] args) {

        String palavra = "cocada";
        int indice = primeiroCaractereUnico(palavra);
        if (indice != -1) {
            System.out.println(indice);
        } else {
            System.out.println(-1);
        }
    }
}
