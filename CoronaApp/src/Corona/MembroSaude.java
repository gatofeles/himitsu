package Corona;

import java.util.Scanner;

public class MembroSaude extends Pessoa {
    private boolean Lider = false;
    private Scanner scan = new Scanner(System.in);

    public boolean isLider() {
        return Lider;
    }

    public void setLider(boolean Lider) {
        this.Lider = Lider;
    }


    public void buscar_Paciente(int opcao, int[] sintomas,String local, Paciente[] pacientes){

        int cont = 0;

        if(opcao == 1){
            for (Paciente paciente: pacientes) {
                cont++;

                if(paciente == null){
                    break;
                }
                else {
                    boolean igual = true;
                    int cont2 = 0;
                    for (int sintoma: sintomas) {

                            if(sintoma!=paciente.sintomas[cont2]){
                                System.out.println("Falhou!!");
                                System.out.println(sintoma);
                                System.out.println(paciente.sintomas[cont2]);
                                System.out.println(cont);
                                igual = false;

                        }
                            cont2++;
                    }
                    if(igual){
                        System.out.println(paciente.nome);
                    }
                }
            }
        }

        else if(opcao == 2){

            for (Paciente paciente: pacientes) {
                cont++;

                if(paciente == null){
                    break;
                }
                else {

                  if(paciente.estado == local){
                      System.out.println(paciente.nome);
                  }

                }
            }

        }

        else if(opcao == 3){

            for (Paciente paciente: pacientes) {
                cont++;

                if(paciente == null){
                    break;
                }
                else {

                    if(paciente.cidade == local){
                        System.out.println(paciente.nome);
                    }

                }
            }
        }


        else{
            for (Paciente paciente: pacientes) {
                cont++;

                if(paciente == null){
                    break;
                }
                else {
                        System.out.println(paciente.nome);
                }
            }
        }
    }

    public void gerarAtestado(String resultado_Laudo, int num_Atestado, Paciente paciente){
        Atestado atestado = new Atestado(resultado_Laudo, num_Atestado, paciente, this.nome);
        atestado.imprimir_Atestado();
    }

    public void registrar_Laudo(Paciente paciente){
        paciente.setContaminado(true);
    }

    public Visita agendar_visita(){
        int id_paciente;
        String endereco;
        String data;
        String hora;

        System.out.println("Digite o ID do paciente a ser visitado:");
        id_paciente = scan.nextInt();

        System.out.println("Digite o endereço:");
        endereco = scan.nextLine();

        System.out.println("Digite a data:");
        data = scan.nextLine();

        System.out.println("Digite o horário:");
        hora = scan.nextLine();
        Visita visita = new Visita(id_paciente, endereco, data, hora);
        return visita;

    }

    public void listar_Visitas(Visita[] visitas){
        int cont = 0;
        for (Visita visita: visitas
             ) {
            System.out.printf("***Visita %d***", cont++);
            System.out.println("Endereço"+visita.getEndereco());
            System.out.println("Data"+visita.getData());
            System.out.println("Hora"+visita.getHora());
            System.out.println("Id do paciente"+visita.getId_Paciente());
            System.out.println("Status");

            if(visita.getStatus()){
                System.out.println("Concluída");
            }
            else{
                System.out.println("Pendente");
            }

        }
    }

    public void registrar_Membro(){
        int resposta = -1;
        String resposta2 = "";
        Scanner scan = new Scanner(System.in);

        System.out.println("Você é lider");
        System.out.println("1 - Sim\n 2 - Não");
        resposta2 = scan.nextLine();
        resposta = Integer.parseInt(resposta2);

        if(resposta == 1){
            this.Lider = true;
        }

        System.out.println("Digite seu nome:\n");

        resposta2 = scan.nextLine();
        this.nome = resposta2;

        System.out.println("Digite seu telefone:\n");
        resposta = scan.nextInt();
        this.telefone = resposta;

        System.out.println("Digite seu Estado:\n");
        scan.nextLine();
        resposta2 = scan.nextLine();
        this.estado = resposta2;

        System.out.println("Digite sua Cidade:\n");

        resposta2 = scan.nextLine();
        this.cidade = resposta2;

        System.out.println("Digite sua Senha:\n");

        resposta2 = scan.nextLine();
        this.setSenha(resposta2);

        this.id = (int)(Math.random()*(10000 - 1)+1);
    }
}
