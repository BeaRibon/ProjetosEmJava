

public class Aplicativo {    
    public static void main(String[] args){
        int valorDespesa1 = 180;
        String tipoDespesa1 = "Luz";

        int valorDespesa2 = 150;
        String tipoDespesa2 = "Água";

        int valorMedio = (valorDespesa1 + valorDespesa2) / 2;

        System.out.println("Valor mensal: " + valorMedio);
        System.out.println("Suas despesas: " + tipoDespesa1 + " " + tipoDespesa2);
        System.out.println("----------------------------------------------------------");
        int valorTotal = 0;
        int valorDespesa3 = 75;
        valorTotal += valorDespesa1;
        System.out.println(valorTotal);
        boolean aumento = valorDespesa1 + valorDespesa3 < valorDespesa2;
        System.out.println("Houve um aumento: " + aumento);

        int i = 1, j = 1;
        System.out.println(i++);
        System.out.println(++j);

    };
};
