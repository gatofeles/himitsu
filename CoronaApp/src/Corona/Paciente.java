package Corona;

import java.util.Scanner;

public class Paciente extends Pessoa {

    public int[] sintomas = new int[9];
    private boolean contaminado;

    public void reg_Paciente(){

        int resposta = -1;
        String resposta2 = "";
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite os números correspondentes aos síntomas que possui separados por vírgula. Caso não possua nenhum sintoma, digite 0");
        System.out.println("1 - Febre\n 2 - Vômito\n 3 - Tosse\n 4 - Diarréia\n 5 - Corisa\n 6 - Espirro\n 7 - Falta de ar\n 8 - Dor no corpo");
        resposta2 = scan.nextLine();
        String[] strArray = resposta2.split(",");

        for (int i = 0; i < strArray.length; i++) {
            this.sintomas[i] = Integer.parseInt(strArray[i]);
            System.out.println(this.sintomas[i]);
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

    public void listar_Sintomas(){



    }

}
