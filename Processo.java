import java.util.ArrayList;

public class Processo {
    private int id;
    private String titulo;
    private String descricao;
    private String status;

    private Cliente cliente;
    private Usuario responsavel;
    private Etapa etapaAtual;

    private ArrayList<Tarefa> tarefas;
    private ArrayList<Prazo> prazos;
    private ArrayList<Documento> documentos;

    public Processo(int id, String titulo, String descrição, Cliente cliente, Usuario responsavel, Etapa etapa){
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.cliente = cliente;
        this.responsavel = responsavel;
        this.etapaAtual = etapa;
        this.status = "Em andamento";

        this.tarefas = new ArrayList<>();
        this.prazos = new ArrayList<>();
        this.documentos = new ArrayList<>();

    }

    public void alterarEtapa(Etapa novaEtapa){
        this.etapaAtual = novaEtapa;
        System.out.println("Etapa: " + novaEtapa.getNome());

    }

    public void adicionarTarefa(Tarefa tarefa){
        tarefas.add(tarefa);
        System.out.println("Tarefa adicionada: " + tarefa.getTitulo());

    }

    public void adicionarPrazo(Prazo prazo){
        prazos.add(prazo);

    }

    public void adicionarDocumento(Documento documento){
        documentos.add(documento);

    }

    public void exibirResumo(){
        System.out.println("\n--- PROCESSO ---");
        System.out.println("Titulo: " + titulo);
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Responsavel: " + responsavel.getNome());
        System.out.println("Etapa: " + etapaAtual.getNome());
        System.out.println("Status: " + status);
        System.out.println("Prazos: " + prazos.size());
        System.out.println("Documentos: " + documentos.size());

    }

}
