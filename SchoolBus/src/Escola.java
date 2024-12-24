import java.time.LocalDate;
import java.util.ArrayList;

public class Escola extends PessoaJuridica{
    private ArrayList<Aluno> alunos;
    
    public Escola(String nome_oficial, String cpf_cnpj, String telefone, Endereco endereco, String nome_fantasia,
			Integer num_funcionario) {
		super(nome_oficial, cpf_cnpj, telefone, endereco, nome_fantasia, num_funcionario);
        this.alunos = new ArrayList<Aluno>();
	}

    public void matricularAluno(String nome_civil, String nome, String mãe, String pai, String naturalidade, String cpf, String rua,
            String complemento, String bairro, String telefone, String serie, Integer numero, Integer matricula,
            LocalDate data_nascimento,PontoDeParada pontoDeParada){
        Aluno aluno = new Aluno(nome, cpf, telefone, new Endereco(rua, complemento, bairro, numero), nome, telefone, pai, naturalidade, data_nascimento, serie, matricula, this, pontoDeParada);
        this.alunos.add(aluno);
    }

    public void matricularAluno(Aluno aluno){
        this.alunos.add(aluno);
        aluno.setEscola(this);
    }

    public void exibeAlunos(){
        System.out.println("ALUNOS DA ESCOLA " + getNomeFantasia().toUpperCase());
        System.out.println();
        for(Aluno aluno: this.alunos){
            System.out.println("Aluno:" + aluno.getNome());
            System.out.println("Matricula: " + aluno.getMatricula());
            System.out.println("CPF: " + aluno.getCPF());
            System.out.println("Serie: " + aluno.getSerie());
            System.out.println();
    }
    }

    @Override
    public void verificarTipo(){
        System.out.println("Escola");
    }

    @Override
    public void apresentarDados(){
        System.out.println("Nome civil: " + this.getNome_oficial());
        System.out.println("Nome fantasia: " + this.getNomeFantasia());
        System.out.println("CNPJ: " + this.getCNPJ());
        System.out.println("Endereço: " + this.getEndereco().toString());
        System.out.println("Telefone: " + this.getTelefone());
        System.out.println("Nº Funcionários: " + this.getNumFuncionario());
        this.exibeAlunos();
    }
}
