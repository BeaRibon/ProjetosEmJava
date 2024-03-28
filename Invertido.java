public class Invertido {
    public static String[] soletrandoInvertidoStr(String input) {
        String[] array = input.split("");
        String[] arrayInverte = new String[input.length()];

        for(int i = arrayInverte.length; i >= 0; i--){
            arrayInverte[array.length - i - 1] = array[i];
            

        }
        return arrayInverte;
       
    }
    
    public static void main(String[] args) {
        String input = "amor";
        String[] array = soletrandoInvertidoStr(input);
        for(String palavra : array){
            System.out.println(palavra);
        }
    }
}
