import java.util.List;

public class Main {
    public static void main(String[] args) {
        Loja minhaLoja = new Loja();

        Funcionario carlos = new Funcionario(
            "Carlos Pereira", "Rua das Flores, 77", "9123-4567",
            "321.654.987-00", 'M', 1,
            2002, 3200.50, "Caixa"
        );

        Cliente ana = new Cliente(
            "Ana Oliveira", "Travessa dos Pássaros, 12", "9345-6789",
            "654.321.098-77", 'F', 3,
            4200.00, "Livros, Games", "Designer"
        );

        Fornecedor beta = new Fornecedor(
            "Beta S.A.", "Av. Central, 1010", "9987-6543",
            "98.765.432/0001-55", "Beta Importações",
            "Componentes Eletrônicos"
        );

        minhaLoja.empregar(carlos);
        minhaLoja.cadastrarCliente(ana);
        minhaLoja.cadastrarFornecedor(beta);

        System.out.println("=== Funcionários Cadastrados ===");
        minhaLoja.listarFuncionarios().forEach(System.out::println);

        System.out.println("=== Clientes Cadastrados ===");
        minhaLoja.listarClientes().forEach(System.out::println);

        System.out.println("=== Fornecedores Cadastrados ===");
        minhaLoja.listarFornecedores().forEach(System.out::println);

        System.out.println("\nRealizando demissão do funcionário matrícula 2002...");
        boolean demitido = minhaLoja.demitir(2002);
        System.out.println(demitido ? "Funcionário demitido com sucesso." : "Falha na demissão: matrícula não encontrada.");

        System.out.println("\n=== Funcionários Após Demissão ===");
        minhaLoja.listarFuncionarios().forEach(System.out::println);
    }
}
