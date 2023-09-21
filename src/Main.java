import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Professor p1 = new Professor();
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();



        System.out.println("Vamos fazer o seu cadastro!");
        System.out.println("Digite 1 para cadastro de Professor.");
        System.out.println("Digite 2 para cadastro de Aluno. ");
        System.out.println("Escolha a opção: ");
        int opcao = sc.nextInt();
        sc.nextLine();

        switch (opcao) {
            case 1:
                System.out.println("Digite seu nome: ");
                p1.setNome(sc.nextLine());
                System.out.println("Digite sua idade:");
                p1.setIdade(sc.nextInt());
                System.out.println("Digite sua especialização: ");
                p1.setEspecializacao(sc.nextLine());
                System.out.println("Digite sua expectativa de salário:");
                p1.setSalario(sc.nextDouble());
                break;


            case 2:
                System.out.println("Digite seu nome: ");
                a2.setNome(sc.nextLine());
                System.out.println("Digite sua idade:");
                a2.setIdade(sc.nextInt());
                System.out.println("Digite sua matrícula: ");
                a2.setMatricula(sc.nextDouble());
                System.out.println("Digite sua primeira nota: ");
                a2.setNota1(sc.nextDouble());
                System.out.println("Digite sua segunda nota: ");
                a2.setNota2(sc.nextDouble());
                a2.calcularMedia();
                System.out.printf("%s, notas: %.2f / " +
                        "%.2f.\n", a2.getNome(), a2.getNota1(), a2.getNota2());
                System.out.println("Média:" + a2.getMedia());
                break;

            default:
                System.out.println("Opção inválida.");
                break;
        }

    }
}