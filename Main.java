
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Listas para armazenar os cadastros
        ArrayList<Usuario> usuarios = new ArrayList<>();
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Processo> processos = new ArrayList<>();

        // Etapa inicial de cada novo processo
        Etapa etapaInicial = new Etapa(1, "Recebimento", 1);

        int opcao = 0;

        // Mantém o programa funcionando enquanto
        // o usuário não escolher a opção 6
        while (opcao != 6) {

            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Cadastrar cliente");
            System.out.println("3 - Criar novo processo");
            System.out.println("4 - Adicionar tarefa");
            System.out.println("5 - Consultar processos");
            System.out.println("6 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {

                case 1:
                    System.out.println("\nCADASTRO DE USUÁRIO");

                    System.out.print("Nome: ");
                    String nomeUsuario = sc.nextLine();

                    System.out.print("Perfil: ");
                    String perfil = sc.nextLine();

                    // ID gerado automaticamente
                    int idUsuario = usuarios.size() + 1;

                    Usuario novoUsuario = new Usuario(
                            idUsuario, nomeUsuario, perfil
                    );

                    usuarios.add(novoUsuario);

                    System.out.println("Usuário cadastrado!");
                    break;

                case 2:
                    System.out.println("\nCADASTRO DE CLIENTE");

                    System.out.print("Nome do cliente: ");
                    String nomeCliente = sc.nextLine();

                    System.out.print("E-mail: ");
                    String email = sc.nextLine();

                    int idCliente = clientes.size() + 1;

                    Cliente novoCliente = new Cliente(
                            idCliente, nomeCliente, email
                    );

                    clientes.add(novoCliente);

                    System.out.println("Cliente cadastrado!");
                    break;

                case 3:
                    System.out.println("\nNOVO PROCESSO");

                    // Verifica se existem clientes e usuários
                    if (clientes.isEmpty() || usuarios.isEmpty()) {
                        System.out.println(
                                "Cadastre um cliente e um usuário primeiro!"
                        );
                        break;
                    }

                    System.out.print("Título do processo: ");
                    String titulo = sc.nextLine();

                    System.out.print("Descrição: ");
                    String descricao = sc.nextLine();

                    // Lista os clientes cadastrados
                    System.out.println("\nClientes disponíveis:");

                    for (int i = 0; i < clientes.size(); i++) {
                        System.out.println(
                                (i + 1) + " - " + clientes.get(i).getNome()
                        );
                    }

                    System.out.print("Escolha o cliente: ");
                    int escolhaCliente =
                            Integer.parseInt(sc.nextLine());

                    if (escolhaCliente < 1 ||
                            escolhaCliente > clientes.size()) {
                        System.out.println("Cliente inválido!");
                        break;
                    }

                    Cliente clienteSelecionado =
                            clientes.get(escolhaCliente - 1);

                    // Lista os usuários cadastrados
                    System.out.println("\nUsuários disponíveis:");

                    for (int i = 0; i < usuarios.size(); i++) {
                        System.out.println(
                                (i + 1) + " - " + usuarios.get(i).getNome()
                        );
                    }

                    System.out.print("Escolha o responsável: ");
                    int escolhaUsuario =
                            Integer.parseInt(sc.nextLine());

                    if (escolhaUsuario < 1 ||
                            escolhaUsuario > usuarios.size()) {
                        System.out.println("Usuário inválido!");
                        break;
                    }

                    Usuario responsavel =
                            usuarios.get(escolhaUsuario - 1);

                    int idProcesso = processos.size() + 1;

                    Processo novoProcesso = new Processo(
                            idProcesso,
                            titulo,
                            descricao,
                            clienteSelecionado,
                            responsavel,
                            etapaInicial
                    );

                    processos.add(novoProcesso);

                    System.out.println("Processo criado!");
                    break;

                case 4:
                    System.out.println("\nADICIONAR TAREFA");

                    if (processos.isEmpty()) {
                        System.out.println("Nenhum processo cadastrado!");
                        break;
                    }

                    for (int i = 0; i < processos.size(); i++) {
                        System.out.println(
                                (i + 1) + " - Processo nº " + (i + 1)
                        );
                    }

                    System.out.print("Escolha o processo: ");
                    int escolhaProcesso =
                            Integer.parseInt(sc.nextLine());

                    if (escolhaProcesso < 1 ||
                            escolhaProcesso > processos.size()) {
                        System.out.println("Processo inválido!");
                        break;
                    }

                    System.out.print("Título da tarefa: ");
                    String tituloTarefa = sc.nextLine();

                    Processo processoSelecionado =
                            processos.get(escolhaProcesso - 1);

                    // ID simples para demonstração
                    int idTarefa = 1;

                    Tarefa novaTarefa = new Tarefa(
                            idTarefa, tituloTarefa
                    );

                    processoSelecionado.adicionarTarefa(novaTarefa);

                    System.out.println("Tarefa cadastrada!");
                    break;

                case 5:
                    System.out.println("\nPROCESSOS CADASTRADOS");

                    if (processos.isEmpty()) {
                        System.out.println("Nenhum processo encontrado.");
                    } else {
                        for (Processo processo : processos) {
                            processo.exibirResumo();
                        }
                    }
                    break;

                case 6:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}

