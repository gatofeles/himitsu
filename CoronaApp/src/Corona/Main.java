package Corona;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Paciente[] pacientes = new Paciente[1000];
        int contadorPaciente = 0;
        Paciente paciente = new Paciente();
        int resposta = -1;
        String resposta2 = "";
        Scanner scan = new Scanner(System.in);


        while(resposta != 1 && resposta != 2){
            System.out.println("***Corona App***\n");
            System.out.println("Escolha uma das opções:\n" +
                    "1-Paciente\n2-Equipe Médica\n");
            resposta = scan.nextInt();

        }

        if(resposta == 1){

            System.out.println("Digite os números correspondentes aos síntomas que possui separados por vírgula. Caso não possua nenhum sintoma, digite 0");
            System.out.println("1 - Febre\n 2 - Vômito\n 3 - Tosse\n 4 - Diarréia\n 5 - Corisa\n 6 - Espirro\n 7 - Falta de ar\n 8 - Dor no corpo");
            scan.nextLine();
            resposta2 = scan.nextLine();
            String[] strArray = resposta2.split(",");

            for (int i = 0; i < strArray.length; i++) {
                paciente.sintomas[i] = Integer.parseInt(strArray[i]);
                System.out.println(paciente.sintomas[i]);
            }

            System.out.println("Digite seu nome:\n");

            resposta2 = scan.nextLine();
            paciente.nome = resposta2;

            System.out.println("Digite seu telefone:\n");
            resposta = scan.nextInt();
            paciente.telefone = resposta;

            System.out.println("Digite seu Estado:\n");
            scan.nextLine();
            resposta2 = scan.nextLine();
            paciente.estado = resposta2;

            System.out.println("Digite sua Cidade:\n");

            resposta2 = scan.nextLine();
            paciente.cidade = resposta2;

            System.out.println("Digite sua Senha:\n");

            resposta2 = scan.nextLine();
            paciente.setSenha(resposta2);

            paciente.setId((int)(Math.random()*(10000 - 1)+1));

            System.out.println(paciente.nome);
            System.out.println(paciente.getId());

            pacientes[contadorPaciente++] = paciente;


        }
        else{

        }


    }
}
