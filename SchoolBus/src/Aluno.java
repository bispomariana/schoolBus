import java.time.LocalDate;

public class Aluno extends PessoaFisica{
    private String serie;
    private Integer matricula;
    private Escola escola;
    private PontoDeParada pontoDeParada;
    
    

    public Aluno(String nome_oficial, String cpf_cnpj, String telefone, Endereco endereco, String nome, String mae,
			String pai, String naturalidade, LocalDate data_nascimento, String serie, Integer matricula, Escola escola,
			PontoDeParada pontoDeParada) {
		super(nome_oficial, cpf_cnpj, telefone, endereco, nome, mae, pai, naturalidade, data_nascimento);
		this.serie = serie;
		this.matricula = matricula;
		this.escola = escola;
		this.pontoDeParada = pontoDeParada;
	}

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }

    public PontoDeParada getPontoDeParada() {
        return pontoDeParada;
    }

    public void setPontoDeParada(PontoDeParada pontoDeParada) {
        this.pontoDeParada = pontoDeParada;
    }

    @Override
    public void verificarTipo(){
        System.out.println("Aluno");
    }

    @Override
    public void apresentarDados(){
        System.out.println("Nome civil: " + this.getNomeCivil());
        System.out.println("Nome social: " + this.getNome());
        System.out.println("CPF: " + this.getCPF());
        System.out.println("Data de Nascimento: " + this.getDataNascimento());
        System.out.println("Nome da mãe: " + this.getMae());
        System.out.println("Nome do pai: " + this.getPai());
        System.out.println("Naturalidade: " + this.getNaturalidade());
        System.out.println("Telefone: " + this.getTelefone());
        System.out.println("Endereço: " + this.getEndereco().toString());
        System.out.println("Escola: " + this.getEscola().getNomeFantasia());
        System.out.println("Matrícula: " + this.getMatricula());
        System.out.println("Série: " + this.getSerie());
        System.out.println("Ponto de Parada: " + this.getPontoDeParada().getNome());
    }
}
