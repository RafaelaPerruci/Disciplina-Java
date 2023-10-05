class Gerente extends Funcionario {
    private String departamento;

    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }

    public void calcularBonus() {
        double bonus = getSalario() * 0.10;
        System.out.println("Bonus do Gerente: R$" + bonus);
    }
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public void imprimirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Salário: R$" + this.salario);
        System.out.println("Departamento: " + this.departamento);
    }
}