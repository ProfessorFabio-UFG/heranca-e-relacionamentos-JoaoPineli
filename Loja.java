import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Loja {
    private List<Funcionario> funcionarios;
    private List<Cliente> clientes;
    private List<Fornecedor> fornecedores;

    public Loja() {
        this.funcionarios = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.fornecedores = new ArrayList<>();
    }

    public void empregar(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public boolean demitir(int matricula) {
        Iterator<Funcionario> it = funcionarios.iterator();
        while (it.hasNext()) {
            if (it.next().getMatricula() == matricula) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void cadastrarFornecedor(Fornecedor fornecedor) {
        fornecedores.add(fornecedor);
    }

    // As listagens são feitas de forma imutável para evitar alterações externas
    public List<Funcionario> listarFuncionarios() {
        return Collections.unmodifiableList(funcionarios);
    }

    public List<Cliente> listarClientes() {
        return Collections.unmodifiableList(clientes);
    }

    public List<Fornecedor> listarFornecedores() {
        return Collections.unmodifiableList(fornecedores);
    }
}
