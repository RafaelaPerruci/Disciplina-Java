public class Produto {
    private String tipo, especificacao;
    private double preco;


    public Produto(String tipo, String especificacao, double preco) {
        this.tipo = tipo;
        this.especificacao = especificacao;
        this.preco = preco;
    }
     public Produto(){

     }

    public String getEspecificacao() {
        return especificacao;
    }

    public void setEspecificacao(String especificacao) {
        this.especificacao = especificacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
