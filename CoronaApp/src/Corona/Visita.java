package Corona;

public class Visita {

    private int id_Paciente; // to do: inserir no diagrama de classes
    private String endereco;
    private String data;
    private String hora;
    private boolean status = false;

    public Visita(int id_Paciente, String endereco, String data, String hora) {
        this.id_Paciente = id_Paciente;
        this.endereco = endereco;
        this.data = data;
        this.hora = hora;
    }

    public int getId_Paciente() {
        return id_Paciente;
    }

    public void setId_Paciente(int id_Paciente) {
        this.id_Paciente = id_Paciente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
