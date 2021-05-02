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

            paciente.reg_Paciente();
            paciente.listar_Sintomas();
            pacientes[contadorPaciente++] = paciente;


        }
        else{

            //Programar aqui

        }


    }
}
