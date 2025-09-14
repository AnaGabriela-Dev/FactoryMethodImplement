package deliveryFactoryMethod;

// Classe criadora
public abstract class EmpresaEntrega {
	protected abstract Transporte criarTransporte(Pedido pedido); // Metodo fábrica
	
	// ProcessarEntrega recebe o objeto pedido de parametro
	public void processarEntrega(Pedido pedido) {
		Transporte t = criarTransporte(pedido); // t vai receber Carro(), Moto() ou Bicicleta()
		t.entregar(pedido); // t vai executar o metodo entregar() dentro de Carro(), Moto() ou Bicicleta() dependendo da distancia
	}
}
