public class Soma {
    public static int somaAlgarismos(int input) {
       if(input > 0){
        String numString = Integer.toString(input);
        int[] arrayInt = new int[numString.length()];
        int resultado = 0;
        for (int i = 0; i < numString.length(); i++) {
            arrayInt[i] = Character.getNumericValue(numString.charAt(i));
        }
        for(int j = 0; j < arrayInt.length; j++){
            resultado += arrayInt[j];
        }
        return resultado;
       }else{
        return -1;
       }
    }
    public static void main(String[] args) {
        int input = 235;
        int resultado = somaAlgarismos(input);
        System.out.println(resultado);
    }
}
