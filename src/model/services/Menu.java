package model.services;

import model.entities.Cliente;

import java.util.Scanner;

public class Menu {
    private ClienteService clienteService;
    private Scanner scanner;

    public Menu(ClienteService clienteService, Scanner scanner) {
        this.clienteService = clienteService;
        this.scanner = scanner;
    }

    public void exibirMenu() {
        boolean sair = false;
        while (!sair) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar cliente");
            System.out.println("2. Remover cliente");
            System.out.println("3. Alterar cliente");
            System.out.println("4. Consultar cliente");
            System.out.println("5. Listar clientes");
            System.out.println("6. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    adicionarCliente();
                    break;
                case 2:
                    removerCliente();
                    break;
                case 3:
                    alterarCliente();
                    break;
                case 4:
                    consultarCliente();
                    break;
                case 5:
                    listarClientes();
                    break;
                case 6:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
    private void adicionarCliente() {
        System.out.println("Digite o CPF do cliente:");
        String cpf = scanner.nextLine();
        System.out.println("Digite o nome do cliente:");
        String nome = scanner.nextLine();
        Cliente cliente = new Cliente(cpf, nome);
        clienteService.adicionarCliente(cliente);
        System.out.println("Cliente adicionado com sucesso.");
    }

    private void removerCliente() {
        System.out.println("Digite o CPF do cliente que deseja remover:");
        String cpf = scanner.nextLine();
        clienteService.removerCliente(cpf);
        System.out.println("Cliente removido com sucesso.");
    }

    private void alterarCliente() {
        System.out.println("Digite o CPF do cliente que deseja alterar:");
        String cpf = scanner.nextLine();
        Cliente cliente = clienteService.consultarCliente(cpf);
        if (cliente == null) {
            System.out.println("Cliente não encontrado.");
        } else {
            System.out.println("Digite o novo nome do cliente:");
            String novoNome = scanner.nextLine();
            Cliente novoCliente = new Cliente(cpf, novoNome);
            clienteService.alterarCliente(cpf, novoCliente);
            System.out.println("Cliente alterado com sucesso.");
        }
    }

    private void consultarCliente() {
        System.out.println("Digite o CPF do cliente que deseja consultar:");
        String cpf = scanner.nextLine();
        Cliente cliente = clienteService.consultarCliente(cpf);
        if (cliente == null) {
            System.out.println("Cliente não encontrado.");
        } else {
            System.out.println("Cliente encontrado:");
            System.out.println("CPF: " + cliente.getCpf());
            System.out.println("Nome: " + cliente.getNome());
        }
    }

    private void listarClientes() {
        System.out.println("Lista de clientes:");
        for (Cliente cliente : clienteService.listarClientes()) {
            System.out.println("CPF: " + cliente.getCpf() + ", Nome: " + cliente.getNome());
        }
    }
}

