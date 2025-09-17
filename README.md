# FactoryMethodImplement

## 📖 Descrição
Este projeto é uma implementação do padrão de projeto **Factory Method** em Java.  
O objetivo é demonstrar como esse padrão pode ser utilizado para isolar a criação de objetos de transporte, permitindo que a classe cliente (`Main`) não precise conhecer diretamente as classes concretas de transporte utilizadas, e também, facilitando manutenção e visualização de código.

---

## 💡 Motivação / Problema que resolve
- Evita **acoplamento** do código.  
- Facilita a **adição de novos tipos de transporte** sem modificar a lógica da aplicação.  
- Garante maior **modularidade** e **escalabilidade** no código.

---

## 🏗️ Padrão utilizado: Factory Method
O **Factory Method** é um padrão de criação que define uma interface ou classe para criação de objetos, mas deixa que as subclasses decidam qual classe concreta instanciar.  
Assim, promove o princípio **Open/Closed**: aberto para extensão, fechado para modificação.

---

## 📂 Estrutura do código / Componentes principais

| Classe / Interface | Responsabilidade |
|---------------------|------------------|
| `Transporte`        | Interface ou classe abstrata que define operações comuns de transporte. |
| `Carro`, `Moto`, `Bicicleta` | Implementações concretas de transporte. |
| `EmpresaLogistica`  | Fábrica responsável por decidir qual transporte criar (contém o *factory method*). |
| `Pedido`            | Representa um pedido que precisa de transporte para ser entregue. |
| `Main`              | Classe principal que demonstra o uso do padrão. |

---

## 🔄 Regras de negócio / Fluxo
1. O cliente cria um **Pedido**.  
2. O pedido solicita à **fábrica** (`EmpresaLogistica`) o tipo de transporte necessário.  
3. A fábrica instancia a classe concreta correta (`Carro`, `Moto`, `Bicicleta`).  
4. O pedido utiliza o objeto `Transporte` para processar a entrega.  
5. Novos tipos de transporte podem ser adicionados sem alterar o código da classe cliente.

---
