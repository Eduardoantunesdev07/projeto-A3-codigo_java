public class Tarefa {
    private int id;
    private String titulo;
    private boolean concluida;
    private Usuario responsavel;

    public Tarefa(int id, String titulo){
        this.id = id;
        this.titulo = titulo;
        this.concluida = false;

    }

    public void concluir(){
        concluida = true;
        System.out.println("Tarefa concluida: " + titulo);

    }

    public void setResponsavel(Usuario usuario){
        this.responsavel = usuario;

    }

    public String getTitulo(){
        return titulo;

    }

    public boolean isConcluida(){
        return concluida;

    }

    public Usuario getResponsavel(){
        return responsavel;

    }
}
