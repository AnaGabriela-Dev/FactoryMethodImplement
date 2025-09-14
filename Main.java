package deliveryFactoryMethod;

public class Main {
	public static void main(String[] args) {
		EmpresaEntrega empresa = new EmpresaLogistica(); // Instância a empresa

		// Define as distâncias de cada pedido
        Pedido pedido1 = new Pedido("Rua das Flores, 123", 2.5);
        Pedido pedido2 = new Pedido("Av. Central, 456", 10.0);
        Pedido pedido3 = new Pedido("Rodovia BR-101, km 200", 50.0);

        // Chama o metodo processarEntrega(), passando cada objeto pedido em questão
        empresa.processarEntrega(pedido1); // saída: "Entrega de Bicicleta para Rua das Flores, 123"
        empresa.processarEntrega(pedido2); // Saída: "Entrega de Moto para Av. Central, 456"
        empresa.processarEntrega(pedido3); // Saída: "Entrega de Carro para Rodovia BR-101, km 200"
	}
}
