public class PessoaJuridica extends Pessoa{
    private String nome_fantasia;
    private Integer num_funcionario;
    
	public PessoaJuridica(String nome_oficial, String cpf_cnpj, String telefone, Endereco endereco,
			String nome_fantasia, Integer num_funcionario) {
		super(nome_oficial, cpf_cnpj, telefone, endereco);
		this.nome_fantasia = nome_fantasia;
		this.num_funcionario = num_funcionario;
	}

	public String getNomeFantasia() {
		return nome_fantasia;
	}

	public void setNomeFantasia(String nome_fantasia) {
		this.nome_fantasia = nome_fantasia;
	}

	public Integer getNumFuncionario() {
		return num_funcionario;
	}

	public void setNumFuncionario(Integer num_funcionario) {
		this.num_funcionario = num_funcionario;
	}

	protected String getCNPJ() {
		return super.getCpf_cnpj();
	}

}
