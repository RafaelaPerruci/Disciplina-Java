public class Carro extends Veiculo{
    private int numPortas;

    public Carro(String marca, String modelo, int anoFab, int numPortas){
        super(marca, modelo, anoFab);
        this.numPortas = numPortas;
    }
    public Carro(){

    }
    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }
    public void imprimirDetalhes(){
        System.out.println("Marca:" + this.marca);
        System.out.println("Modelo:" + this.modelo);
        System.out.println("Ano de fabricação:" + this.anoFab);
        System.out.println("Número de portas:" + this.numPortas);
    }
}
