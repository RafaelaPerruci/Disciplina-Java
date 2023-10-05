public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, int anoFab, int cilindradas){
        super(marca, modelo, anoFab);
        this.cilindradas = cilindradas;

    }
    public Moto(){

    }
    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
    public void imprimirDetalhes(){
        System.out.println("Marca:" + this.marca);
        System.out.println("Modelo:" + this.modelo);
        System.out.println("Ano de fabricação:" + this.anoFab);
        System.out.println("Número de cilindradas:" + this.cilindradas);
    }
}
