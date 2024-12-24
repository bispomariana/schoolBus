import java.time.LocalDate;
import java.util.ArrayList;

public class Contrato {
    private Integer num_contrato;
    private LocalDate data_inicio, data_fim;
    private Double valor;
    private ArrayList<Veiculo> veiculos;
    private ArrayList<Motorista> motoristas;
    private ArrayList<PessoaJuridica> fornecedores;

    public Contrato(Integer num_contrato, LocalDate data_inicio, LocalDate data_fim, Double valor) {
        this.num_contrato = num_contrato;
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
        this.valor = valor;
        this.veiculos = new ArrayList<Veiculo>();
        this.motoristas = new ArrayList<Motorista>();
    }

    public Integer getNum_contrato() {
        return num_contrato;
    }

    public void setNum_contrato(Integer num_contrato) {
        this.num_contrato = num_contrato;
    }

    public LocalDate getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(LocalDate data_inicio) {
        this.data_inicio = data_inicio;
    }

    public LocalDate getData_fim() {
        return data_fim;
    }

    public void setData_fim(LocalDate data_fim) {
        this.data_fim = data_fim;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public ArrayList<Motorista> getMotoristas() {
        return motoristas;
    }

    public void setVeiculos(ArrayList<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public void setMotoristas(ArrayList<Motorista> motoristas) {
        this.motoristas = motoristas;
    }

    public ArrayList<PessoaJuridica> getFornecedores() {
        return fornecedores;
    }

    public void setFornecedores(ArrayList<PessoaJuridica> fornecedores) {
        this.fornecedores = fornecedores;
    }


    public void addVeiculo(Veiculo veiculo){
        if(veiculo.verificaTipo()){
            veiculos.add(veiculo);
            System.out.println("Veículo adicionado com sucesso ao contrato!");
        } else{
            System.out.println("Esse veículo não é terceirizado.");
        }
    }

    public void removeVeiculo(Veiculo veiculo){
        if(veiculo.verificaTipo()){
            for (int i =0; i<veiculos.size(); i++) {
                if(veiculos.get(i).getPlaca() == veiculo.getPlaca()){
                    veiculos.remove(i);
                    break;
                }
            }
        }
    }

    public void addMotorista(Motorista motorista){
        if(motorista.verificaTipo()){
            motoristas.add(motorista);
            System.out.println("Motorista adicionado com sucesso ao contrato!");
        } else{
            System.out.println("Esse motorista não é terceirizado.");
        }
    }

    public void removeMotorista(Motorista motorista){
        if(motorista.verificaTipo()){
            for (int i =0; i<motoristas.size(); i++) {
                if(motoristas.get(i).getCpf_cnpj() == motorista.getCpf_cnpj()){
                    motoristas.remove(i);
                    break;
                }
            }
        }
    }

    public void adicionarFornecedor(PessoaJuridica pessoa){
        if(pessoa instanceof Fornecedor){
            fornecedores.add(pessoa);
            ((Fornecedor)pessoa).getContratos().add(this);
        } else {
            System.out.println("Método inválido. Essa PJ não é um fornecedor.");
        }
    }

}
