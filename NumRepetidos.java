import java.util.HashSet;
import java.util.Set;

public class NumRepetidos {
    public static boolean valoresRepetidos(double[] array) {
        Set<Double> conjunto = new HashSet<>();

        for (double valor : array) {
            if (conjunto.contains(valor)) {
                return true; 
            } else {
                conjunto.add(valor); 
            }
        }

        return false;
    }

    public static void main(String[] args) {

        double[] array = {2.5, 3.2, 4.5, 5, 6};

        System.out.println(valoresRepetidos(array));

    }
}
