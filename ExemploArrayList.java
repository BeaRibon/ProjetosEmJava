import java.util.ArrayList;

public class ExemploArrayList {
    public static void main(String[] args) {
        // Criando um ArrayList de Strings
        ArrayList<String> listaDeNomes = new ArrayList<>();

        // Adicionando elementos à lista
        listaDeNomes.add("Alice");
        listaDeNomes.add("Bob");
        listaDeNomes.add("Carol");

        // Acessando elementos pelo índice
        System.out.println("Primeiro nome: " + listaDeNomes.get(0));
        System.out.println("Segundo nome: " + listaDeNomes.get(1));

        // Iterando sobre os elementos da lista
        System.out.println("Nomes na lista:");
        for (String nome : listaDeNomes) {
            System.out.println(nome);
        }

        // Removendo um elemento
        listaDeNomes.remove("Bob");
        System.out.print("Bob foi removido ");

        // Verificando se um elemento está presente na lista
        if (listaDeNomes.contains("Alice") && listaDeNomes.contains("Carol")) {
            System.out.println("Nomes na lista:");
        for (String nome : listaDeNomes) {
            System.out.println(nome);
        }
        } else {
            System.out.println("Alice não está na lista.");
        }

        // Obtendo o tamanho da lista
        System.out.println("Tamanho da lista: " + listaDeNomes.size());
    }
}
