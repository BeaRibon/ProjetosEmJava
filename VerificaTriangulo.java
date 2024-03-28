public class VerificaTriangulo {
        public static boolean eUmTriangulo(int[] input) {
            for (int lado : input) {
                if (lado <= 0)
                    return false;
            }
            
            for (int i = 0; i < 3; i++) {
                if (input[i] >= input[(i + 1) % 3] + input[(i + 2) % 3])
                    return false;
            }
            
            return true;
        }
    
        public static void main(String[] args) {
            int[] lados = {3,3,5};
            System.out.println(eUmTriangulo(lados)); 

        }
    }

