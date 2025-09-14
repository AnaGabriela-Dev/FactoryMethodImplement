package deliveryFactoryMethod;

// Interface produto comum entre produtos concretos
public interface Transporte {
	void entregar(Pedido pedido); // Metodo que será implementado em TODOS os produtos concretos
}
