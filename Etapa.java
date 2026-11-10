public class Etapa {
    private int id;
    private String nome;
    private int ordem;

    public Etapa(int id, String nome, int ordem){
        this.id = id;
        this.nome = nome;
        this.ordem = ordem;

    }

    public String getNome(){
        return nome;

    }

    public int getOrdem(){
        return ordem;

    }
}
