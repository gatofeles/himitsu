package Corona;

public class Atestado {

    private String resultado_Laudo;
    private int id_Atestado;
    private Paciente paciente; // to do: adicionar no diagrama de classes
    private String nome; // to do: adicionar no diagrama de classes

    public Atestado(String resultado_Laudo, int num_Atestado, Paciente paciente, String nome) {
        this.resultado_Laudo = resultado_Laudo;
        this.id_Atestado = num_Atestado;
        this.paciente = paciente;
        this.nome = nome;
    }

    public void imprimir_Atestado(){
        if(paciente.isContaminado()){
            System.out.println("ATESTADO MÉDICO");
            System.out.println("");
            System.out.println("Atesto para os devidos fins que " + paciente.getNome() +
                    ", de CPF " + paciente.getCpf() + ", recebeu visita médica por meio do" +
                    " CoronaAPP. O laudo resultante da visita segue abaixo:");
            System.out.println(this.resultado_Laudo);
            System.out.println("");
            System.out.println("Profissional de saúde: " + nome);
        }

        else {
            System.out.println("Paciente não contaminado.");

        }
    }
}
