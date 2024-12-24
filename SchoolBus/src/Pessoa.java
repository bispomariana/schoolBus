public class Pessoa {
    private String nome_oficial, cpf_cnpj, telefone;
    private Endereco endereco;
    
	public Pessoa(String nome_oficial, String cpf_cnpj, String telefone, Endereco endereco) {
		this.nome_oficial = nome_oficial;
		this.cpf_cnpj = cpf_cnpj;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	protected String getNome_oficial() {
		return nome_oficial;
	}

	public void setNome_oficial(String nome_oficial) {
		this.nome_oficial = nome_oficial;
	}

	protected String getCpf_cnpj() {
		return cpf_cnpj;
	}

	public void setCpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

    public void verificarTipo(){
        return;
    }

    public void apresentarDados(){
        return;
    }

}
