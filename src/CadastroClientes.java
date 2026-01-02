import java.util.ArrayList;

public class CadastroClientes {

    private static ArrayList<Cliente> clientes = new ArrayList<>();

    public static void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    public static void listarClientes() {
        System.out.println("\n--- Clientes Cadastrados ---");

        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }

        for (Cliente c : clientes) {
            System.out.println(
                "Nome: " + c.nome +
                " | Telefone: " + c.telefone +
                " | Endereço: " + c.endereco
            );
        }
    }
}
