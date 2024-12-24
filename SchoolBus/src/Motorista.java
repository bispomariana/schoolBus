import java.time.LocalDate;
import java.util.ArrayList;

public class Motorista extends PessoaFisica{
    private String num_habilitacao, cat_habilitacao;
    private Integer tipo;
    private ArrayList<Contrato> contratos;

	public Motorista(String nome_oficial, String cpf_cnpj, String telefone, Endereco endereco, String nome, String mae,
			String pai, String naturalidade, LocalDate data_nascimento, String num_habilitacao, String cat_habilitacao,
			Integer tipo) {
		super(nome_oficial, cpf_cnpj, telefone, endereco, nome, mae, pai, naturalidade, data_nascimento);
		this.num_habilitacao = num_habilitacao;
		this.cat_habilitacao = cat_habilitacao;
		this.tipo = tipo;
        if (verificaTipo()) {
            this.contratos = new ArrayList<Contrato>();
        }
	}

	public boolean verificaTipo() {
        if (this.tipo == 0) {
            return false;
        }else{
            return true;
        }
    }

    public String getNum_habilitacao() {
        return num_habilitacao;
    }

    public void setNum_habilitacao(String num_habilitacao) {
        this.num_habilitacao = num_habilitacao;
    }

    public String getCat_habilitacao() {
        return cat_habilitacao;
    }

    public void setCat_habilitacao(String cat_habilitacao) {
        this.cat_habilitacao = cat_habilitacao;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Contrato> getContratos(){
        return contratos;
    }

    public void listaContratos() {
        for(Contrato contrato: this.contratos){
            System.out.println(contrato.getNum_contrato());
        }
    }

    public void setContratos(ArrayList<Contrato> contratos) {
        if (verificaTipo()) {
            this.contratos = contratos;
        }else{
            System.out.println("Método inválido.");
        }
    }
    
    public void addContrato(Contrato contrato){
        if (verificaTipo()) {
            contratos.add(contrato);
        }else{
            System.out.println("Não foi possível adicionar contrato. Esse motorista não é terceirizado.");
        }
    }

    public void removeContrato(Contrato contrato){
        for (int i =0; i<contratos.size(); i++) {
            if(contratos.get(i).getNum_contrato() == contrato.getNum_contrato()){
                contratos.remove(i);
                break;
            }
        }
    }

    @Override
    public void verificarTipo(){
        System.out.println("Motorista");
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
        System.out.println("Nº Habilitação: " + this.getNum_habilitacao());
        System.out.println("Categoria da Habilitação: " + this.getCat_habilitacao());
        if (verificaTipo()) {
            for (Contrato contrato : contratos) {
                System.out.println("Contrato: " + contrato.getNum_contrato());
            }
        }
    }
}
