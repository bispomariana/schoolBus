public class Endereco {

    private String rua, complemento, bairro;
    private Integer numero;
    
    public Endereco(String rua, String complemento, String bairro, Integer numero) {
        this.rua = rua;
        this.complemento = complemento;
        this.bairro = bairro;
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String toString(){
        return rua + ", " + complemento + ", " + bairro + ", nº" + numero;
    }
}
