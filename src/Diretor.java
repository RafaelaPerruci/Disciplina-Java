class Diretor extends Funcionario {
    private int acoes;

    public Diretor(String nome, double salario, int acoes) {
        super(nome, salario);
        this.acoes = acoes;
    }

    public int getAcoes() {
        return acoes;
    }

    public void imprimirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Salário: R$" + this.salario);
        System.out.println("Quantidade de Ações: " + this.acoes);
    }
}