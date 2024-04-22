import model.repository.ArrayListClienteRepository;
import model.services.Menu;
import model.repository.ClienteRepository;
import model.services.ClienteService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ClienteRepository clienteRepository = new ArrayListClienteRepository(); // ou HashMapClienteRepository()
        ClienteService clienteService = new ClienteService(clienteRepository);
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu(clienteService, scanner);
        menu.exibirMenu();
        scanner.close();
    }
}
