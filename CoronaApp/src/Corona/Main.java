package Corona;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Paciente[] pacientes = new Paciente[1000];
        Visita[] visitas = new Visita[1000];
        MembroSaude membroSaude = new MembroSaude();
        int contadorPaciente = 0;
        Paciente paciente = new Paciente();
        int resposta = -1;
        int aux1 = -1;
        int aux2 = -1;
        int aux3 = -1;
        String resposta2 = "";
        Scanner scan = new Scanner(System.in);
        String texto = "";
        int[] sintomas = new int[9];

    while(resposta != 0) {
        while (resposta != 1 && resposta != 2) {
            System.out.println("***Corona App***\n");
            System.out.println("Escolha uma das opções:\n" +
                    "1-Paciente\n2-Equipe Médica\n 0-Sair do Programa");
            resposta = scan.nextInt();

        }

        if (resposta == 1) {

            paciente.reg_Paciente();
            pacientes[contadorPaciente++] = paciente;


        } else {

            while (resposta != 0) {
                System.out.println("O que você gostaria de fazer?");
                System.out.println("0 - Encerrar sessão");
                System.out.println("1 - Agendar visita");
                System.out.println("2 - Listar visitas");
                System.out.println("3 - Gerar atestado");
                System.out.println("4 - Buscar Paciente");
                resposta = scan.nextInt();

                switch (resposta){
                    case 0:
                        break;
                    case 1:
                        membroSaude.agendar_visita();
                        break;
                    case 2:
                        membroSaude.listar_Visitas(visitas);
                        break;
                    case 3:
                        System.out.println("Digite o texto do laudo ");
                        texto = scan.nextLine();
                        System.out.println("Digite o numero do laudo ");
                        aux1= scan.nextInt();
                        System.out.println("Digite a posição do paciente na base");
                        aux2= scan.nextInt();
                        membroSaude.gerarAtestado(texto,aux1,pacientes[aux2]);
                        break;
                    case 4:
                        System.out.println("Buscar por:\n" +
                        "1- Sintomas \n2- Estado \n 3- Cidade \n 4 - Listar Todos");
                        aux3 = scan.nextInt();
                        if(aux3==1){
                            System.out.println("Digite os números correspondentes aos síntomas que possui separados por vírgula.");
                            System.out.println("1 - Febre\n 2 - Vômito\n 3 - Tosse\n 4 - Diarréia\n 5 - Corisa\n 6 - Espirro\n 7 - Falta de ar\n 8 - Dor no corpo");
                            resposta2 = scan.nextLine();

                            String[] strArray = resposta2.split(",");
                            for (int i = 0; i < strArray.length; i++) {
                               sintomas[i] = Integer.parseInt(strArray[i]);
                            }
                            membroSaude.buscar_Paciente(aux3, sintomas, pacientes);
                        }

                        else if(aux3 == 2 || aux3 == 3){
                            System.out.println("Digite a busca.");
                            resposta2 = scan.nextLine();
                            membroSaude.buscar_Paciente(aux3, resposta2, pacientes);
                        }

                        else{
                            membroSaude.buscar_Paciente(aux3, 0, pacientes);
                        }
                        break;

                }

            }

        }

    }

    }
}
