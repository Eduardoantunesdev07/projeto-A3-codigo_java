public class Documento {
    private int id;
    private String nome;
    private String caminho;

    public Documento(int id,String nome, String caminho){
        this.id = id;
        this.nome = nome;
        this.caminho = caminho;

    }

    public String getNome(){
        return nome;

    }

    public String getCaminho(){
        return caminho;

    }
}

