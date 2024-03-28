import java.util.Scanner;

public class Tipagem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual seu nome?");
        String primeiroNome = scan.nextLine();
        System.out.println("Seu nome: " + primeiroNome);


        scan.close();
    }
}
