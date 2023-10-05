public class Veiculo {
    protected String marca;
    protected String modelo;
    protected int anoFab;

    public Veiculo(String marca, String modelo, int anoFab){
        this.marca = marca;
        this.modelo = modelo;
        this.anoFab = anoFab;

    }
    public Veiculo(){

    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFab() {
        return anoFab;
    }

    public void setAnoFab(int anoFab) {
        this.anoFab = anoFab;
    }
}
