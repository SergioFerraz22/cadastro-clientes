package model.repository;

import model.entities.Cliente;

import java.util.List;

public interface ClienteRepository {
    void adicionarCliente(Cliente cliente);
    void removerCliente(String cpf);
    void alterarCliente(String cpf, Cliente novoCliente);
    Cliente consultarCliente(String cpf);
    List<Cliente> listarClientes();
}
