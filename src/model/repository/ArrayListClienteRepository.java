package model.repository;

import model.entities.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClienteRepository implements ClienteRepository{
    private List<Cliente> clientes = new ArrayList<>();

    @Override
    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    @Override
    public void removerCliente(String cpf) {
        // Remove um cliente da lista se o CPF dele for igual ao CPF especificado
        clientes.removeIf(cliente -> cliente.getCpf().equals(cpf));
    }

    @Override
    public void alterarCliente(String cpf, Cliente novoCliente) {
        for (int i = 0; i < clientes.size(); i++) {
            Cliente cliente = clientes.get(i);
            if (cliente.getCpf().equals(cpf)) {
                clientes.set(i, novoCliente);
                break;
            }
        }
    }

    @Override
    public Cliente consultarCliente(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }

    @Override
    public List<Cliente> listarClientes() {
        return clientes;
    }
}
