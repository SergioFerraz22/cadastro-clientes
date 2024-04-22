package model.services;
import model.entities.Cliente;
import model.repository.ClienteRepository;

import java.util.List;

public class ClienteService {

    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public void adicionarCliente(Cliente cliente) {
        clienteRepository.adicionarCliente(cliente);
    }

    public void removerCliente(String cpf) {
        clienteRepository.removerCliente(cpf);
    }

    public void alterarCliente(String cpf, Cliente novoCliente) {
        clienteRepository.alterarCliente(cpf, novoCliente);
    }

    public Cliente consultarCliente(String cpf) {
        return clienteRepository.consultarCliente(cpf);
    }

    public List<Cliente> listarClientes() {
        return clienteRepository.listarClientes();
    }
}
