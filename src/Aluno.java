class Aluno extends Pessoa{
    private double nota1, nota2, media, matricula;


    public Aluno(String nome, int idade, double nota, double nota2, double matricula){
        super(nome, idade);
        this.nota1 = nota;
        this.nota2 = nota2;
        this.matricula = matricula;

    }
    public Aluno(){

    }



    public double getMatricula() {
        return matricula;
    }

    public void setMatricula(double matricula) {
        this.matricula = matricula;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getMedia() {
        return media;
    }
    public void calcularMedia(){
        this.media = (nota1 + nota2) / 2;
    }
}