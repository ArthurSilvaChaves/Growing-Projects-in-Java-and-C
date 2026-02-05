// dia 2

import java.util.Scanner;
import java.util.ArrayList;

public class notas{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int aprovados = 0;
        int reprovados = 0;
        int retidos = 0;


        ArrayList<String> alunos = new ArrayList<>();
        ArrayList<Integer> notas = new ArrayList<>();
        
        System.out.println("Digite a quantidade de alunos para dar nota: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < quantidade; i++){
            System.out.println("Digite o nome do aluno n" + (i +1) + ": ");
            String nome = scanner.nextLine();
            alunos.add(nome);
        
            System.out.println("Digite a nota do aluno n" + (i +1) + ": ");

            String nota = scanner.nextLine();
            notas.add(Integer.parseInt(nota));
        }

        for (int i = 0;i < alunos.size();i++){
            if (notas.get(i) > 5){
                System.out.println((i + 1) + ". o aluno " + alunos.get(i) + " tirou " + notas.get(i)+ " foi aprovado");
                aprovados += 1;
            } else if (notas.get(i) == 5){
                System.out.println((i + 1) + ". o aluno " + alunos.get(i) + " ficou para a recuperacao com chance de passar");
                retidos += 1 ;
            } else if (notas.get(i) < 5){
                System.out.println((i + 1) + ". o aluno " + alunos.get(i) + " tirou " + notas.get(i) + " foi reprovado");
                reprovados += 1;
            }
        }

        System.out.println(aprovados + " alunos foram aprovados, " + reprovados + " alunos foram reprovaodos e " + retidos + " alunos foram retidos");

        scanner.close();
    }
}