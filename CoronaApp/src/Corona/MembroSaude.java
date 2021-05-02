package Corona;

import java.util.Scanner;

public class MembroSaude extends Pessoa {
    private boolean Lider = false;

    public boolean isLider() {
        return Lider;
    }

    public void setLider(boolean Lider) {
        this.Lider = Lider;
    }


    public void buscar_Paciente(int id){

    }

    public void registrar_Laudo(){

    }

    public void agendar_visita(){

    }

    public void listar_Visita(){

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
