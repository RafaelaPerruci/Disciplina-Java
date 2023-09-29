import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto p1 = new Produto("Produto X", 10.0, 20);
        int quantidade;

        System.out.println("Olá, sou fornecedora do produto X");
        System.out.printf("Temos %d unidades em nosso estoque e o produto custa %.2f \n", p1.getQtdEstoque(), p1.getPreco());

        System.out.println("Gostaria de comprar quantas unidades?");
        quantidade = sc.nextInt();
        p1.vender(quantidade);

        p1.adicionarEstoque(quantidade);
    }
}