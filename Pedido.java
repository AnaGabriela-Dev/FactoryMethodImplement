package deliveryFactoryMethod;

// Classe que representa o padrão dos pedidos
public class Pedido {
	private String endereco; // endereço cliente
    private double distanciaKm; // distância do endereço da empresa

    public Pedido(String endereco, double distanciaKm) {
        this.endereco = endereco;
        this.distanciaKm = distanciaKm;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }
}
