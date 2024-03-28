public class Carro{
    private String marca;
    private String modelo;
    private int ano;


    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void ligar(){
        System.out.println("O carro " + marca + " " + modelo + " de " + ano + " ligou");
    }
    public void acelerar(){
        System.out.println("O carro " + marca + " " + modelo + " de " + ano + " acelerou");
    }
    public void desligar(){
        System.out.println("O carro " + marca + " " + modelo + " de " + ano + " desligou");
    }

    public static void main(String[] args){
        Carro meuCarro = new Carro("Toyota", "Corolla",2022);
        meuCarro.ligar();
        meuCarro.acelerar();
        meuCarro.desligar();
    }

}