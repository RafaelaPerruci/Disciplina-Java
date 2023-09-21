class Professor extends Pessoa {
    private double salario;
    private String especializacao;

    public Professor(String nome, int idade, double salario, String especializacao){
        super(nome, idade);
        this.salario = salario;
        this.especializacao = especializacao;

    }
    public Professor(){

    }
    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public String getEspecializacao() {
        return especializacao;
    }
}