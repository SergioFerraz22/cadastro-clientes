# Cadastro de Clientes

Este é um projeto de exemplo de cadastro de clientes em Java, utilizando estruturas de dados como ArrayList e HashMap.

## Descrição

O objetivo deste projeto é fornecer funcionalidades básicas para gerenciar uma lista de clientes, incluindo adição, remoção, alteração, consulta e listagem de clientes. O projeto demonstra duas abordagens diferentes para armazenar e manipular os dados dos clientes, usando as estruturas de dados ArrayList e HashMap.

## Funcionalidades

- Adicionar um cliente
- Remover um cliente
- Alterar um cliente
- Consultar um cliente
- Listar todos os clientes

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

- `src/main/java`: Contém o código-fonte Java do projeto.
  - `Cliente.java`: Classe que representa um cliente com CPF e nome.
  - `ClienteService.java`: Classe responsável por fornecer serviços para manipular clientes.
  - `ClienteRepository.java`: Interface que define as operações básicas para manipular clientes.
  - `ArrayListClienteRepository.java`: Implementação do repositório de clientes usando ArrayList.
  - `HashMapClienteRepository.java`: Implementação do repositório de clientes usando HashMap.
  - `Menu.java`: Classe responsável pela interface de linha de comando para interagir com o usuário.
  - `Main.java`: Classe principal para executar o programa.

## Como Executar

Para executar o projeto localmente, siga estas etapas:

1. Certifique-se de ter o Java Development Kit (JDK) instalado em sua máquina.
2. Clone o repositório do projeto para o seu ambiente local.
3. Navegue até o diretório raiz do projeto.
4. Compile o código-fonte usando o comando `javac Main.java`.
5. Execute o programa usando o comando `java Main`.
6. Siga as instruções apresentadas no console para interagir com o programa.

## Contribuição

Contribuições são bem-vindas! Se você tiver sugestões, correções ou melhorias para o projeto, sinta-se à vontade para enviar um pull request ou abrir uma issue no repositório.

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).
