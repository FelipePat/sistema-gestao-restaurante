import java.util.Scanner;

public class SistemaGestaoRestaurante {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== Sistema de Gestão de Restaurante ===");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Controle de caixa");
            System.out.println("3 - Listar clientes");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // limpa o buffer

            switch (opcao) {

                case 1:
                    System.out.print("Nome do cliente: ");
                    String nome = scanner.nextLine();

                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();

                    System.out.print("Endereço: ");
                    String endereco = scanner.nextLine();

                    Cliente cliente = new Cliente(nome, telefone, endereco);
                    CadastroClientes.adicionarCliente(cliente);
                    break;

                case 2:
                    System.out.print("Nome do produto: ");
                    String produto = scanner.nextLine();

                    System.out.print("Preço de custo: R$ ");
                    double precoCusto = scanner.nextDouble();

                    System.out.print("Margem de lucro (%): ");
                    double margemLucro = scanner.nextDouble();

                    System.out.print("Quantidade vendida: ");
                    int quantidadeVendida = scanner.nextInt();
                    scanner.nextLine(); // limpa buffer

    double precoVenda = ControleDeCaixa.calcularPrecoVenda(precoCusto, margemLucro);
    double faturamento = ControleDeCaixa.calcularFaturamento(precoVenda, quantidadeVendida);
    double custoTotal = ControleDeCaixa.calcularCustoTotal(precoCusto, quantidadeVendida);
    double lucro = ControleDeCaixa.calcularLucroLiquido(faturamento, custoTotal);

    System.out.println("\n--- Resultado Financeiro ---");
    System.out.println("Produto: " + produto);
    System.out.printf("Preço de venda: R$ %.2f%n", precoVenda);
    System.out.printf("Faturamento: R$ %.2f%n", faturamento);
    System.out.printf("Custo total: R$ %.2f%n", custoTotal);
    System.out.printf("Lucro líquido: R$ %.2f%n", lucro);
    break;

                    

                case 3:
                    CadastroClientes.listarClientes();
                    break;

                case 0:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
