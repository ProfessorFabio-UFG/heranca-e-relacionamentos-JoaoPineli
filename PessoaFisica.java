public abstract class PessoaFisica extends Pessoa {
    private String cpf;
    private char sexo;
    private int estadoCivil;

    public PessoaFisica(String nome, String endereco, String telefone,
                        String cpf, char sexo, int estadoCivil) {
        super(nome, endereco, telefone);
        this.cpf = cpf;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(int estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") +
               ", cpf='" + cpf + '\'' +
               ", sexo=" + sexo +
               ", estadoCivil=" + estadoCivil +
               '}';
    }
}
