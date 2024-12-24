import java.util.ArrayList;

public class PontoDeParada {
    private static int quantidadeDePontos = 0;
    private String nome;
    private Double latitude, longitude;
    private int id;
    private ArrayList<Aluno> alunos = new ArrayList<>();
    
    public PontoDeParada(String nome, Double latitude, Double longitude) {
        quantidadeDePontos += 1;
        this.nome = nome;
        this.latitude = latitude;
        this.longitude = longitude;
        this.id = quantidadeDePontos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public int getId() {
        return id;
    }

    public void addAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public static void imprimeQuantidadeDePontos(){
        System.out.println("Total de pontos de parada criados: " + quantidadeDePontos);
    }

    

}
