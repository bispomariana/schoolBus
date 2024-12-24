import java.util.ArrayList;

public class Rota {
    private static int quantidadeDeRotas = 0;
    private int id;
    private ArrayList<PontoDeParada> pontosDeParada = new ArrayList<>();

    public Rota() {
        quantidadeDeRotas += 1;
        this.id = quantidadeDeRotas;
    }

    public int getId() {
        return id;
    }

    public ArrayList<PontoDeParada> getPontosDeParada(){
        return pontosDeParada;
    }

    public void addPontosDeParada(PontoDeParada pontoDeParada){
        pontosDeParada.add(pontoDeParada);
    }

    public static void imprimeQuantidadeDeRotas(){
        System.out.println("Total de rotas criadas: " + quantidadeDeRotas);
    }

    public void calculaDemanda(){
        Integer demanda = 0;
        for(PontoDeParada pontoDeParada: this.getPontosDeParada()){
            demanda += pontoDeParada.getAlunos().size();    
        }
        System.out.println("Demanda total da rota " + this.id + ": " + demanda + " alunos");   
    }

}

