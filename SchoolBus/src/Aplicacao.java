import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacao {

    public static void menu(){
        // MENU INTERATIVO
        System.out.println("---> MENU <---");
        System.out.println("1 - Criar aluno");
        System.out.println("2 - Criar motorista");
        System.out.println("3 - Criar fornecedor");
        System.out.println("4 - Criar contrato");
        System.out.println("5 - Criar escola");
        System.out.println("6 - Criar veículo");
        System.out.println("7 - Criar ponto de parada");
        System.out.println("8 - Criar nova rota");
        System.out.println("9 - Calcular demanda de uma rota");
        System.out.println("10 - Exibir informações de uma pessoa");
        System.out.println("11 - Exibir o tipo de uma pessoa");
        System.out.println("12 - Exibir total de rotas");
        System.out.println("13 - Exibir total de pontos de parada");
        System.out.println("14 - Sair do programa");
        System.out.println();
    }

    public static PontoDeParada procurarPontoDeParada(Scanner scan, int id, ArrayList<PontoDeParada> pontosDeParada){
        for (PontoDeParada pontoDeParada : pontosDeParada) {
            if (pontoDeParada.getId() == id) {    
                return pontoDeParada;
            }
        }
        System.out.println("Ponto não encontrado. ID inválido!");
        return null;
    }

    public static Escola procurarEscola(Scanner scan, String nome_escola, ArrayList<Escola> escolas){
        for (Escola escola : escolas) {
            if (escola.getNome_oficial().equals(nome_escola)) {    
                return escola;
            }
        }
        System.out.println("Escola não encontrada. Nome inválido!");
        return null;
    }

    public static Aluno procurarAluno(Scanner scan, String cpf, ArrayList<Aluno> alunos){
        for (Aluno aluno : alunos) {
            if (aluno.getCPF().equals(cpf)) {    
                return aluno;
            }
        }
        System.out.println("Aluno não encontrado. Nome inválido!");
        return null;
    }

    public static Motorista procurarMotorista(Scanner scan, String cpf, ArrayList<Motorista> motoristas){
        for (Motorista motorista : motoristas) {
            if (motorista.getCPF().equals(cpf)) {    
                return motorista;
            }
        }
        System.out.println("Motorista não encontrado. Nome inválido!");
        return null;
    }

    public static Fornecedor procurarFornecedor(Scanner scan, String cnpj, ArrayList<Fornecedor> fornecedores){
        for (Fornecedor fornecedor : fornecedores) {
            if (fornecedor.getCNPJ().equals(cnpj)) {    
                return fornecedor;
            }
        }
        System.out.println("Fornecedor não encontrado. Nome inválido!");
        return null;
    }

    public static Contrato procurarContrato(Scanner scan, Integer num_contrato, ArrayList<Contrato> contratos){
        for (Contrato contrato : contratos) {
            if (contrato.getNum_contrato().equals(num_contrato)) {    
                return contrato;
            }
        }
        System.out.println("Contrato não encontrada. Número inválido!");
        return null;
    }

    public static void main(String[] args) throws Exception {

        ArrayList<Pessoa> pessoas = new ArrayList<>();
        ArrayList<Aluno> alunos = new ArrayList<>();
        ArrayList<Escola> escolas = new ArrayList<>();
        ArrayList<Motorista> motoristas = new ArrayList<>();
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        ArrayList<Fornecedor> fornecedores = new ArrayList<>();
        ArrayList<Contrato> contratos = new ArrayList<>();
        ArrayList<PontoDeParada> pontosDeParada = new ArrayList<>();
        ArrayList<Rota> rotas = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        Integer opcao = 0;

        while (opcao != 14) {
            menu();
            System.out.println("Digite uma opção do menu: ");
            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1:
                    // CRIAR ALUNO
                    String nome_civil, n_escola, nome, mãe, pai, naturalidade, cpf, rua, complemento, bairro, telefone, serie;
                    Integer numero, matricula, dia, mes, ano;
                    int idPontoDeParada;
                    Escola escolaAluno;
                    PontoDeParada pontoDeParadaAluno;
                    System.out.println("Digite o nome civil do aluno: ");
                    nome_civil = scan.nextLine();
                    System.out.println("Digite o nome do aluno: ");
                    nome = scan.nextLine();
                    System.out.println("Digite o nome da mãe do aluno: ");
                    mãe = scan.nextLine();
                    System.out.println("Digite o nome do pai do aluno: ");
                    pai = scan.nextLine();
                    System.out.println("Digite a naturalidade do aluno: ");
                    naturalidade = scan.nextLine();
                    System.out.println("Digite o cpf do aluno: ");
                    cpf = scan.nextLine();
                    System.out.println("Digite a rua da residência do aluno: ");
                    rua = scan.nextLine();
                    System.out.println("Digite o complemento da residência do aluno: ");
                    complemento = scan.nextLine();
                    System.out.println("Digite o bairro da residência do aluno: ");
                    bairro = scan.nextLine();
                    System.out.println("Digite o telefone do aluno: ");
                    telefone = scan.nextLine();
                    System.out.println("Digite a série que o aluno irá cursar: ");
                    serie = scan.nextLine();
                    System.out.println("Digite o número da residência do aluno: ");
                    numero = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Digite a matrícula do aluno: ");
                    matricula = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Digite o dia da data de nascimento do aluno: ");
                    dia = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Digite o mês da data de nascimento do aluno: ");
                    mes = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Digite o ano da data de nascimento do aluno: ");
                    ano = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Digite o id do ponto de parada do aluno:");
                    idPontoDeParada = scan.nextInt();
                    scan.nextLine();
                    pontoDeParadaAluno = procurarPontoDeParada(scan, idPontoDeParada, pontosDeParada);
                    if (pontoDeParadaAluno == null) {
                        System.out.println("Houve um problema na criação do aluno. Tente novamente.");
                        break;
                    }
                    System.out.println("Digite o nome da escola: ");
                    n_escola = scan.nextLine();
                    escolaAluno = procurarEscola(scan, n_escola, escolas);
                    if (escolaAluno == null) {
                        System.out.println("Houve um problema na criação do aluno. Tente novamente.");
                        break;
                    }
                    Aluno aluno = new Aluno(nome_civil, cpf, telefone, new Endereco(rua, complemento, bairro, numero), nome, mãe, pai, naturalidade, LocalDate.of(ano, mes, dia), serie, matricula, escolaAluno, pontoDeParadaAluno);
                    alunos.add(aluno);
                    pessoas.add(aluno);
                    break;
                case 2:
                    // CRIAR MOTORISTA
                    String nome_civil_motorista, nome_motorista, mae_motorista, pai_motorista, naturalidade_motorista, cpf_motorista, rua_motorista, complemento_motorista, bairro_motorista, telefone_motorista, num_habilitacao, cat_habilitacao;
                    Integer numero_motorista, tipo_motorista, dia_motorista, mes_motorista, ano_motorista;
                    System.out.println("Digite o nome civil do motorista: ");
                    nome_civil_motorista = scan.nextLine();
                    System.out.println("Digite o nome do motorista: ");
                    nome_motorista = scan.nextLine();
                    System.out.println("Digite o nome da mãe do motorista: ");
                    mae_motorista = scan.nextLine();
                    System.out.println("Digite o nome do pai do motorista: ");
                    pai_motorista = scan.nextLine();
                    System.out.println("Digite a naturalidade do motorista: ");
                    naturalidade_motorista = scan.nextLine();
                    System.out.println("Digite o cpf do motorista: ");
                    cpf_motorista = scan.nextLine();
                    System.out.println("Digite o dia da data de nascimento do motorista: ");
                    dia_motorista = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Digite o mês da data de nascimento do motorista: ");
                    mes_motorista = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Digite o ano da data de nascimento do motorista: ");
                    ano_motorista = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Digite a rua da residência do motorista: ");
                    rua_motorista = scan.nextLine();
                    System.out.println("Digite o complemento da residência do motorista: ");
                    complemento_motorista = scan.nextLine();
                    System.out.println("Digite o bairro da residência do motorista: ");
                    bairro_motorista = scan.nextLine();
                    System.out.println("Digite o número da residência do motorista: ");
                    numero_motorista = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Digite o telefone do motorista: ");
                    telefone_motorista = scan.nextLine();
                    System.out.println("Digite o número da habilitação do motorista: ");
                    num_habilitacao = scan.nextLine();
                    System.out.println("Digite a categoria da habilitação do motorista: ");
                    cat_habilitacao = scan.nextLine();
                    System.out.println("Digite o tipo de contrato do motorista (0 - servidor; 1 - terceirizado): ");
                    tipo_motorista = scan.nextInt();
                    scan.nextLine();
                    Motorista motorista = new Motorista(nome_civil_motorista, cpf_motorista, telefone_motorista, new Endereco(rua_motorista, complemento_motorista, bairro_motorista, numero_motorista), nome_motorista, mae_motorista, pai_motorista, naturalidade_motorista, LocalDate.of(ano_motorista, mes_motorista, dia_motorista), num_habilitacao, cat_habilitacao, tipo_motorista);
                    motoristas.add(motorista);
                    pessoas.add(motorista);
                    System.out.println("Motorista criado com sucesso!");
                    break;
                case 3:
                    //CRIAR FORNECEDOR
                    String nome_oficial_fornecedor, cnpj_fornecedor, telefone_fornecedor, nome_fantasia_fornecedor, rua_fornecedor, complemento_fornecedor, bairro_fornecedor;
                    Integer qtde_funcionarios_fornecedor, numero_fornecedor;
                    System.out.println("Digite o nome do fornecedor: ");
                    nome_oficial_fornecedor = scan.nextLine();
                    System.out.println("Digite o nome fantasia do fornecedor: ");
                    nome_fantasia_fornecedor = scan.nextLine();
                    System.out.println("Digite o cnpj do fornecedor: ");
                    cnpj_fornecedor = scan.nextLine();
                    System.out.println("Digite o telefone do fornecedor: ");
                    telefone_fornecedor = scan.nextLine();
                    System.out.println("Digite a rua do forneedor: ");
                    rua_fornecedor = scan.nextLine();
                    System.out.println("Digite o complemento do fornecedor: ");
                    complemento_fornecedor = scan.nextLine();
                    System.out.println("Digite o bairro do fornecedor: ");
                    bairro_fornecedor = scan.nextLine();
                    System.out.println("Digite o número do fornecedor: ");
                    numero_fornecedor = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Digite o número de funcionários do fornecedor: ");
                    qtde_funcionarios_fornecedor = scan.nextInt();
                    scan.nextLine();
                    Fornecedor fornecedor = new Fornecedor(nome_oficial_fornecedor, cnpj_fornecedor, telefone_fornecedor, new Endereco(rua_fornecedor, complemento_fornecedor, bairro_fornecedor, numero_fornecedor), nome_fantasia_fornecedor, qtde_funcionarios_fornecedor);
                    fornecedores.add(fornecedor);
                    pessoas.add(fornecedor);
                    break;
                case 4:
                    // CRIAR CONTRATO
                    String adicionar = "a";
                    Integer num_contrato, dia_inicio, mes_inicio, ano_inicio, dia_fim, mes_fim, ano_fim;
                    Double valor;
                    System.out.println("Digite o número do contrato: ");
                    num_contrato = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Digite o dia da data de inicio do contrato: ");
                    dia_inicio = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Digite o mês da data de inicio do contrato: ");
                    mes_inicio = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Digite o ano da data de inicio do contrato: ");
                    ano_inicio = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Digite o dia da data de encerramento do contrato: ");
                    dia_fim = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Digite o mês da data de encerramento do contrato: ");
                    mes_fim = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Digite o ano da data de encerramento do contrato: ");
                    ano_fim = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Digite o valor do contrato: ");
                    valor = scan.nextDouble();
                    scan.nextLine(); 
                    Contrato contrato = new Contrato(num_contrato, LocalDate.of(ano_inicio, mes_inicio, dia_inicio), LocalDate.of(ano_fim, mes_fim, dia_fim), valor);
                    contratos.add(contrato);
                    System.out.println("Contrato criado com sucesso!");
                    while (!adicionar.equals("nao")) {
                        System.out.println("Deseja adicionar um motorista terceirizado já existente a esse contrato? (sim/nao)");
                        adicionar = scan.nextLine();
                        if (adicionar.equals("sim")) {
                            System.out.println("Digite o cpf do motorista: ");
                            cpf_motorista = scan.nextLine();
                            Motorista motoristaContrato = procurarMotorista(scan, cpf_motorista, motoristas);
                            if (motoristaContrato == null) {
                                System.out.println("Houve um problema na adição de motoristas.");
                                break;
                            }
                            contrato.addMotorista(motoristaContrato);
                            motoristaContrato.addContrato(contrato);
                        } else if (!adicionar.equals("nao")) {
                            System.out.println("Opção inválida!");
                        }
                    }
                    adicionar = "a";
                    while (!adicionar.equals("nao")) {
                        System.out.println("Deseja adicionar um fornecedor já existente a esse contrato? (sim/nao)");
                        adicionar = scan.nextLine();
                        if (adicionar.equals("sim")) {
                            System.out.println("Digite o cnpj do fornecedor: ");
                            cnpj_fornecedor = scan.nextLine();
                            Fornecedor fornecedorContrato = procurarFornecedor(scan, cnpj_fornecedor, fornecedores);
                            if (fornecedorContrato == null) {
                                System.out.println("Houve um problema na adição de fornecedores.");
                                break;
                            }
                            contrato.adicionarFornecedor(fornecedorContrato);
                        } else if (!adicionar.equals("nao")) {
                            System.out.println("Opção inválida!");
                        }
                    }
                    break;
                case 5:
                    // CRIAR ESCOLA
                    String nome_escola, nome_fantasia_escola, cnpj_escola, telefone_escola, rua_escola, complemento_escola, bairro_escola;
                    Integer numero_escola, qtde_funcionarios_escola;
                    System.out.println("Digite o nome da escola: ");
                    nome_escola = scan.nextLine();
                    System.out.println("Digite o nome fantasia da escola: ");
                    nome_fantasia_escola = scan.nextLine();
                    System.out.println("Digite o cnpj da escola: ");
                    cnpj_escola = scan.nextLine();
                    System.out.println("Digite o telefone da escola: ");
                    telefone_escola = scan.nextLine();
                    System.out.println("Digite a rua da escola: ");
                    rua_escola = scan.nextLine();
                    System.out.println("Digite o complemento da escola: ");
                    complemento_escola = scan.nextLine();
                    System.out.println("Digite o bairro da escola: ");
                    bairro_escola = scan.nextLine();
                    System.out.println("Digite o número da escola: ");
                    numero_escola = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Digite o número de funcionários da escola: ");
                    qtde_funcionarios_escola = scan.nextInt();
                    scan.nextLine();
                    Escola escola = new Escola(nome_escola, cnpj_escola, telefone_escola, new Endereco(rua_escola, complemento_escola, bairro_escola, numero_escola), nome_fantasia_escola, qtde_funcionarios_escola);
                    escolas.add(escola);
                    pessoas.add(escola);
                    System.out.println("Escola criada com sucesso!");
                    break;
                case 6:
                    // CRIAR VEICULO
                    String placa, modelo, verifica_Contrato;
                    Integer ano_veiculo, capacidade, tipo, num_contrato_veiculo;
                    verifica_Contrato = "a";
                    System.out.println("Digite a placa do veículo: ");
                    placa = scan.nextLine();
                    System.out.println("Digite o modelo do veículo: ");
                    modelo = scan.nextLine();
                    System.out.println("Digite o ano do veículo: ");
                    ano_veiculo = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Digite a capacidade do veículo: ");
                    capacidade = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Digite o tipo de contrato do veículo (0 - servidor; 1 - terceirizado): ");
                    tipo = scan.nextInt();
                    scan.nextLine();
                    if (tipo.equals(1)) {
                        while (!verifica_Contrato.equals("contrato") && !verifica_Contrato.equals("criar")) {
                            System.out.println(
                                    "Caso ele já tenha um contrato, digite 'contrato', caso não tenha, digite 'criar': ");
                            verifica_Contrato = scan.nextLine();
                            if (verifica_Contrato.equals("contrato")) {
                                System.out.println("Digite o número do contrato: ");
                                num_contrato_veiculo = scan.nextInt();
                                scan.nextLine();
                                Contrato contratoVeiculo = procurarContrato(scan, num_contrato_veiculo, contratos);
                                if(contratoVeiculo == null){
                                    System.out.println("Houve um problema na criação do veículo. Tente novamente.");
                                    break;
                                }
                                Veiculo veiculo = new Veiculo(placa, modelo, ano_veiculo, capacidade, tipo, contratoVeiculo);
                                veiculos.add(veiculo);
                                contratoVeiculo.addVeiculo(veiculo);
                                System.out.println("Veículo criado com sucesso!");
                                break;
                            } else if (verifica_Contrato.equals("criar")) {
                                System.out.println("Digite o número do contrato: ");
                                num_contrato_veiculo = scan.nextInt();
                                scan.nextLine();
                                System.out.println("Digite o dia da data de inicio do contrato: ");
                                dia_inicio = scan.nextInt();
                                scan.nextLine();
                                System.out.println("Digite o mês da data de inicio do contrato: ");
                                mes_inicio = scan.nextInt();
                                scan.nextLine();
                                System.out.println("Digite o ano da data de inicio do contrato: ");
                                ano_inicio = scan.nextInt();
                                scan.nextLine();
                                System.out.println("Digite o dia da data de encerramento do contrato: ");
                                dia_fim = scan.nextInt();
                                scan.nextLine();
                                System.out.println("Digite o mês da data de encerramento do contrato: ");
                                mes_fim = scan.nextInt();
                                scan.nextLine();
                                System.out.println("Digite o ano da data de encerramento do contrato: ");
                                ano_fim = scan.nextInt();
                                scan.nextLine();
                                System.out.println("Digite o valor do contrato: ");
                                valor = scan.nextDouble();
                                scan.nextLine();
                                Contrato contratoVeiculo = new Contrato(num_contrato_veiculo, LocalDate.of(ano_inicio, mes_inicio, dia_inicio), LocalDate.of(ano_fim, mes_fim, dia_fim), valor);
                                Veiculo veiculo = new Veiculo(placa, modelo, ano_veiculo, capacidade, tipo, contratoVeiculo);
                                veiculos.add(veiculo);
                                System.out.println("Veículo criado com sucesso!");
                                break;
                            } else {
                                System.out.println("Opção inválida!");
                            }
                        }
                    }
                    break;
                case 7:
                    // CRIAR PONTO DE PARADA
                    String nome_ponto;
                    adicionar = "a";
                    Double latitude_ponto, longitude_ponto;
                    System.out.println("Digite o nome do ponto de parada: ");
                    nome_ponto = scan.nextLine();
                    System.out.println("Digite a latitude da localização do ponto de parada: ");
                    latitude_ponto = scan.nextDouble();
                    scan.nextLine();
                    System.out.println("Digite a longitude da localização do ponto de parada: ");
                    longitude_ponto = scan.nextDouble();
                    scan.nextLine();
                    PontoDeParada pontoDeParada = new PontoDeParada(nome_ponto, latitude_ponto, longitude_ponto);
                    pontosDeParada.add(pontoDeParada);
                    System.out.println("Ponto de parada criado com sucesso! (ID: " + pontoDeParada.getId() + ")");
                    while (!adicionar.equals("nao")) {
                        System.out.println("Deseja adicionar um aluno já existente a esse ponto de parada? (sim/nao) ");
                        adicionar = scan.nextLine();
                        if (adicionar.equals("sim")) {
                            System.out.println("Digite o cpf do aluno: ");
                            cpf = scan.nextLine();
                            Aluno aluno_ponto = procurarAluno(scan, cpf, alunos);
                            if (aluno_ponto == null) {
                                System.out.println("Houve um erro na adição de alunos.");
                                break;
                            }
                            pontoDeParada.addAluno(aluno_ponto);
                            System.out.println("Aluno adicionado com sucesso!");
                        } else if (!adicionar.equals("nao")) {
                            System.out.println("Opção inválida!");
                        }
                    }
                    adicionar = "a";
                    while (!adicionar.equals("nao")) {
                        System.out.println("Deseja criar um novo aluno e adicionar a esse ponto de parada? (sim/nao) ");
                        adicionar = scan.nextLine();
                        if (adicionar.equals("sim")) {
                            System.out.println("Digite o nome civil do aluno: ");
                            nome_civil = scan.nextLine();
                            System.out.println("Digite o nome do aluno: ");
                            nome = scan.nextLine();
                            System.out.println("Digite o nome da mãe do aluno: ");
                            mãe = scan.nextLine();
                            System.out.println("Digite o nome do pai do aluno: ");
                            pai = scan.nextLine();
                            System.out.println("Digite a naturalidade do aluno: ");
                            naturalidade = scan.nextLine();
                            System.out.println("Digite o cpf do aluno: ");
                            cpf = scan.nextLine();
                            System.out.println("Digite a rua da residência do aluno: ");
                            rua = scan.nextLine();
                            System.out.println("Digite o complemento da residência do aluno: ");
                            complemento = scan.nextLine();
                            System.out.println("Digite o bairro da residência do aluno: ");
                            bairro = scan.nextLine();
                            System.out.println("Digite o telefone do aluno: ");
                            telefone = scan.nextLine();
                            System.out.println("Digite a série que o aluno irá cursar: ");
                            serie = scan.nextLine();
                            System.out.println("Digite o número da residência do aluno: ");
                            numero = scan.nextInt();
                            scan.nextLine();
                            System.out.println("Digite a matrícula do aluno: ");
                            matricula = scan.nextInt();
                            scan.nextLine();
                            System.out.println("Digite o dia da data de nascimento do aluno: ");
                            dia = scan.nextInt();
                            scan.nextLine();
                            System.out.println("Digite o mês da data de nascimento do aluno: ");
                            mes = scan.nextInt();
                            scan.nextLine();
                            System.out.println("Digite o ano da data de nascimento do aluno: ");
                            ano = scan.nextInt();
                            scan.nextLine();
                            System.out.println("Digite o nome da escola: ");
                            nome_escola = scan.nextLine();
                            escola = procurarEscola(scan, nome_escola, escolas);
                            if (escola == null) {
                                System.out.println("Houve um problema na criação do aluno. Tente novamente.");
                                break;
                            }
                            Aluno aluno_ponto = new Aluno(nome_civil, cpf, telefone, new Endereco(rua, complemento, bairro, numero), nome, mãe, pai, naturalidade, LocalDate.of(ano, mes, dia), serie, matricula, escola, pontoDeParada);
                            alunos.add(aluno_ponto);
                            pessoas.add(aluno_ponto);
                            pontoDeParada.addAluno(aluno_ponto);
                            System.out.println("Aluno adicionado com sucesso!");
                        } else if (!adicionar.equals("nao")) {
                            System.out.println("Opção inválida!");
                        }
                    }
                    break;
                case 8:
                    // CRIAR ROTA
                    adicionar = "a";
                    Rota rota = new Rota();
                    rotas.add(rota);
                    System.out.println("Rota criada com sucesso! (ID: " + rota.getId() + ")");
                    while (!adicionar.equals("nao")){
                        System.out.println("Deseja adicionar um ponto de parada já existente a essa rota? (sim/nao) ");
                        adicionar = scan.nextLine();
                        if (adicionar.equals("sim")) {
                            int id;
                            System.out.println("Digite o id do ponto de parada: ");
                            id = scan.nextInt();
                            scan.nextLine();
                            PontoDeParada pontoDeParadaRota = procurarPontoDeParada(scan, id, pontosDeParada); 
                            if (pontoDeParadaRota == null) {
                                System.out.println("Houve um erro na adição de pontos de parada.");
                                break;
                            }
                            rota.addPontosDeParada(pontoDeParadaRota);
                            System.out.println("Ponto de parada adicionado com sucesso!");
                        } else if (!adicionar.equals("nao")) {
                            System.out.println("Opção inválida!");
                        }
                    }
                    adicionar = "a";
                    while (!adicionar.equals("nao")) {
                        System.out.println("Deseja criar um ponto de parada para adicionar a essa rota? (sim/nao) ");
                        adicionar = scan.nextLine();
                        if (adicionar.equals("sim")) {
                            String nomePontoRota;
                            Double latitude, longitude;
                            System.out.println("Digite o nome do ponto de parada: ");
                            nomePontoRota = scan.nextLine();
                            System.out.println("Digite a latitude da localização do ponto de parada: ");
                            latitude = scan.nextDouble();
                            scan.nextLine();
                            System.out.println("Digite a longitude da localização do ponto de parada: ");
                            longitude = scan.nextDouble();
                            scan.nextLine();
                            PontoDeParada pontoDeParadaRota = new PontoDeParada(nomePontoRota, latitude, longitude);
                            pontosDeParada.add(pontoDeParadaRota);
                            rota.addPontosDeParada(pontoDeParadaRota);
                            System.out.println("Ponto de parada (ID: " + pontoDeParadaRota.getId() + ") adicionado com sucesso!");
                            break;

                        } else if (!adicionar.equals("nao")) {
                            System.out.println("Opção inválida!");
                        }
                    }
                    break;
                case 9:
                    // DEMANDA DE UMA ROTA
                    Boolean existe = false;
                    int id;
                    System.out.println("Digite o id da rota desejada: ");
                    id = scan.nextInt();
                    scan.nextLine();
                    for (Rota pont_rota : rotas) {
                        if (pont_rota.getId() == id) {
                            pont_rota.calculaDemanda();
                            existe = true;
                            break;
                        }
                    }
                    if (!existe) {
                        System.out.println("Não foi possível calcular a demanda. Essa rota não existe.");
                    }
                    break;
                case 10:
                    //EXIBIR INFORMAÇÕES SOBRE UMA PESSOA
                    existe = false;
                    System.out.println("Digite o cpf ou cnpj da pessoa: ");
                    String cpf_cnpj = scan.nextLine();
                    for (Pessoa pessoa : pessoas) {
                        if(pessoa.getCpf_cnpj().equals(cpf_cnpj)){
                            pessoa.apresentarDados();
                            existe = true;
                            break;
                        }
                    } 
                    if (!existe) {
                        System.out.println("Pessoa não encontrada.");
                    }
                    break;
                case 11:
                    //EXIBIR O TIPO DE UMA PESSOA
                    existe = false;
                    System.out.println("Digite o cpf ou cnpj da pessoa: ");
                    cpf_cnpj = scan.nextLine();
                    for (Pessoa pessoa : pessoas) {
                        if(pessoa.getCpf_cnpj().equals(cpf_cnpj)){
                            pessoa.verificarTipo();
                            existe = true;
                            break;
                        }
                    } 
                    if (!existe) {
                        System.out.println("Pessoa não encontrada.");
                    }
                    break;
                case 12:
                    // QUANTIDADE DE ROTAS
                    Rota.imprimeQuantidadeDeRotas();
                    break;
                case 13:
                    // QUANTIDADE DE PONTOS DE PARADA
                    PontoDeParada.imprimeQuantidadeDePontos();
                    break;
            
                default:
                    if(opcao != 14){
                        System.out.println("Opção inválida!");
                    }
                    break;
            }
        }

        scan.close();

    }
}