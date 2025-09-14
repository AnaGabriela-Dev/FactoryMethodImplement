package deliveryFactoryMethod;

// Classe criadora concreta
public class EmpresaLogistica extends EmpresaEntrega{
	@Override
	protected Transporte criarTransporte(Pedido pedido) { //Nesse caso, recebe o pedido, e a distancia
		
		// Dependendo da distância, irá retornar a função em carro, Moto ou bicicleta
		if (pedido.getDistanciaKm() > 20) {
			return new Carro();
		} else if (pedido.getDistanciaKm() > 5) {
			return new Moto(); 
		} else {
			return new Bicicleta();
		}
	}

}
