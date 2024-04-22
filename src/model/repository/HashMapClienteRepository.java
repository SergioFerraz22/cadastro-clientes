package model.repository;

import model.entities.Cliente;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapClienteRepository implements ClienteRepository {
    private Map<String, Cliente> clientes = new HashMap<>();

    @Override
    public void adicionarCliente(Cliente cliente) {
        clientes.put(cliente.getCpf(), cliente);
    }

    @Override
    public void removerCliente(String cpf) {
        clientes.remove(cpf);
    }

    @Override
    public void alterarCliente(String cpf, Cliente novoCliente) {
        clientes.put(cpf, novoCliente);
    }

    @Override
    public Cliente consultarCliente(String cpf) {
        return clientes.get(cpf);
    }

    @Override
    public List<Cliente> listarClientes() {
        return new ArrayList<>(clientes.values());
    }
}


