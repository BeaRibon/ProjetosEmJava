public class Soletra {
    public static String[] soletrandoStr(String input){
        String[] array = input.split("");

        return array;
    }

    public static void main(String[] args) {
        String input = "amor";
        String[] array = soletrandoStr(input);
        for(String palavra : array){
            System.out.println(palavra);
        }
    }
}
