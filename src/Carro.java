public class Carro {
    private String marca;
    private String modelo;
    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    public Carro(){

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
    public void mostrarDetalhes(){
        System.out.printf("Novo carro - Marca: %s, Modelo: %s", this.marca, this.modelo);
    }
}
