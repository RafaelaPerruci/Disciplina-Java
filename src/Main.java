import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto p1 = new Produto("Camisa", "polo, azul", 49.9);
        Produto p2 = new Produto("Calça", "jeans, preta", 99.99);
        Carro c = new Carro("Toyota", "Corolla");

        System.out.printf("Produto1: %s, %.2f, %s. \n",p1.getTipo(), p1.getPreco(), p1.getEspecificacao());
        System.out.printf("Produto2: %s, %.2f, %s. \n", p2.getTipo(), p2.getPreco(), p2.getEspecificacao());
        c.mostrarDetalhes();
    }
}
