import java.time.LocalDate;

public class PessoaFisica extends Pessoa {
    private String nome, mae, pai, naturalidade;
    private LocalDate data_nascimento;
    
	public PessoaFisica(String nome_oficial, String cpf_cnpj, String telefone, Endereco endereco, String nome,
			String mae, String pai, String naturalidade, LocalDate data_nascimento) {
		super(nome_oficial, cpf_cnpj, telefone, endereco);
		this.nome = nome;
		this.mae = mae;
		this.pai = pai;
		this.naturalidade = naturalidade;
		this.data_nascimento = data_nascimento;
	}

	protected String getCPF() {
		return super.getCpf_cnpj();
	}

	protected String getNomeCivil() {
		return super.getNome_oficial();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMae() {
		return mae;
	}

	public void setMae(String mae) {
		this.mae = mae;
	}

	public String getPai() {
		return pai;
	}

	public void setPai(String pai) {
		this.pai = pai;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public LocalDate getDataNascimento() {
		return data_nascimento;
	}

	public void setDataNascimento(LocalDate data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

}
