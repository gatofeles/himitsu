package Corona;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Paciente[] pacientes = new Paciente[1000];
        Paciente paciente = new Paciente();
        int[] listaDeSintimas = {1,2,3,4,5,6,7,8};
        int resposta = -1;
        String resposta2;
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
            resposta2 = scan.nextLine();
            String[] strArray = resposta2.split(",");
            int[] intArray = new int[strArray.length];
            for (int sintoma: intArray) {
                
            }







        }
        else{

        }


    }
}
