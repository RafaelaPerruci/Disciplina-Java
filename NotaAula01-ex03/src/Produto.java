public class Produto {
    private String nome;
    private double preco;
    private int qtdEstoque = 20;

    public Produto(String nome, double preco, int qtdEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;

    }
    public String getNome(){
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public int getQtdEstoque() {
        return qtdEstoque;
    }
    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
           qtdEstoque += quantidade;
            System.out.println(quantidade + " unidades de " + nome + " adicionadas ao estoque.");
        } else {
            System.out.println("A quantidade a ser adicionada deve ser maior que zero.");
        }
    }
    public void vender(int quantidade) {
        if (quantidade > 0 && quantidade <= qtdEstoque) {
            qtdEstoque -= quantidade;
            System.out.println(quantidade + " unidades de " + nome + " vendidas.");
        } else if (quantidade > qtdEstoque) {
            System.out.println("Não há estoque suficiente de " + nome + " para vender.");
        } else {
            System.out.println("A quantidade a ser vendida deve ser maior que zero.");
        }
    }
    public void exibirEstoque(){
        System.out.printf("Temos %d unidades do produto X.", qtdEstoque);
    }
}
