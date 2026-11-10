public class Cliente {
    private int id;
    private String nome;
    private String email;

    public Cliente(int id, String nome, String email){
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public void cadastrar(){
        System.out.println("Cliente cadastrado: " + nome);

    }

    public String getNome(){
        return nome;

    }

    public String getEmail(){
        return email;

    }

}
