public class Veiculo {
    private String placa, modelo;
    private Integer ano, capacidade, tipo;
    private Contrato contrato;

    public Veiculo(String placa, String modelo, Integer ano, Integer capacidade, Integer tipo) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.capacidade = capacidade;
        this.tipo = tipo;
    }

    public Veiculo(String placa, String modelo, Integer ano, Integer capacidade, Integer tipo, Contrato contrato) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.capacidade = capacidade;
        this.tipo = tipo;
        if (verificaTipo()) {
            this.contrato = contrato;
        }
    }

    public boolean verificaTipo() {
        if (this.tipo == 0) {
            return false;
        }else{
            return true;
        }
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }
    
    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public Contrato getContrato(){
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        if (verificaTipo()) {
            this.contrato = contrato;
        }else{
            System.out.println("Método inválido.");
        }
    }

}
