//primeiro projeto em java, dia 03/01/2026, pedra papel e tesoura;  dia 1

import java.util.Scanner;
import java.util.Random;

public class RPS {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Pedra");
            System.out.println("2. Papel");
            System.out.println("3. Tesoura");
            System.out.println("4. Sair");

            int computador = rand.nextInt(3) + 1;
            int escolha = scanner.nextInt();
            
            if (escolha == 1 && computador == 2){
                System.out.println("Você perdeu! O computador escolheu papel.");
            } else if (escolha == 1 && computador == 3){
                System.out.println("Você ganhou! O computador escolheu tesoura");
            } else if (escolha == 2 && computador == 1){
                System.out.println("Você ganhou! O computador escolheu pedra");
            } else if (escolha == 2 && computador == 3){
                System.out.println("Você perdeu! O computador escolheu tesoura");
            } else if (escolha == 3 && computador == 1){
                System.out.println("Você perdeu! O computador escolheu pedra");
            } else if (escolha == 3 && computador == 2){
                System.out.println("Você ganhou! o computador escolheu papel");
            } else if (escolha == computador){
                System.out.println("Empate! O computador escolheu o mesmo que você");
            } else if (escolha == 4) {
                System.out.println("Saindo...");
                break;
            } else{
                System.out.println("Escolha inválida!");
            }
        }

        scanner.close();
    }
}