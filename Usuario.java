public class Usuario {
    private int id;
    private String nome;
    private String perfil;

    public Usuario(int id, String nome, String perfil){
        this.id = id;
        this.nome = nome;
        this.perfil = perfil;
    }

    public void atribuirTarefa(Tarefa tarefa){
        tarefa.setResponsavel(this);
        System.out.println("Tarefa atribuida a " + nome);
    }

    public String getNome(){
        return nome;
    }

    public int getId(){
        return id;
    }

    public String getPerfil(){
        return perfil;
    }
}
