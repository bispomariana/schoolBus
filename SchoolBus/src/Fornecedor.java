import java.util.ArrayList;

public class Fornecedor extends PessoaJuridica{
    private ArrayList<Contrato> contratos = new ArrayList<>();

	public Fornecedor(String nome_oficial, String cpf_cnpj, String telefone, Endereco endereco, String nome_fantasia,
			Integer num_funcionario) {
		super(nome_oficial, cpf_cnpj, telefone, endereco, nome_fantasia, num_funcionario);
	}

	public ArrayList<Contrato> getContratos() {
		return contratos;
	}

	public void setContratos(ArrayList<Contrato> contratos) {
		this.contratos = contratos;
	}

    @Override
    public void verificarTipo(){
        System.out.println("Fornecedor");
    }

    @Override
    public void apresentarDados(){
        System.out.println("Nome civil: " + this.getNome_oficial());
        System.out.println("Nome fantasia: " + this.getNomeFantasia());
        System.out.println("CNPJ: " + this.getCNPJ());
        System.out.println("Endereço: " + this.getEndereco().toString());
        System.out.println("Telefone: " + this.getTelefone());
        System.out.println("Nº Funcionários: " + this.getNumFuncionario());
        for (Contrato contrato : contratos) {
            System.out.println("Contrato: " + contrato.getNum_contrato());
        }
    }
    
}
