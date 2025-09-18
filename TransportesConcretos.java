package deliveryFactoryMethod;

// Aqui temos os produtos concretos 

class Carro implements Transporte{
	@Override
	public void entregar(Pedido pedido) { //implementação Metodo que está na interface
		System.out.println("Entrega de Carro para " + pedido.getEndereco());
	}
	
}

class Moto implements Transporte{
	@Override
	public void entregar(Pedido pedido) { //implemenação Metodo que está na interface
		System.out.println("Entrega de Moto para " + pedido.getEndereco());
	}

}

class Bicicleta implements Transporte{
	@Override
	public void entregar(Pedido pedido) { //implemenação Metodo que está na interface
		System.out.println("Entrega de Bicicleta para " + pedido.getEndereco());
	}

}


