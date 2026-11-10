import java.time.LocalDate;

public class Prazo {
    private int id;
    private LocalDate vencimento;

    public Prazo(int id, LocalDate vencimento){
        this.id = id;
        this.vencimento = vencimento;

    }

    public boolean verificarVencimento(){
        return LocalDate.now().isAfter(vencimento);

    }

    public LocalDate getVencimento(){
        return vencimento;

    }
}
