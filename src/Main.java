import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carro c1 = new Carro("Honda", "HR-V", 2020, 4);
        Moto m1 = new Moto("Yamaha", "Bis", 2021, 200);
        c1.imprimirDetalhes();
        m1.imprimirDetalhes();

    }
}