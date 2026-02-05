//dia 3

import java.util.Scanner;
import java.util.Random;

public class guess {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int computador = random.nextInt(100) + 1;

        int tentativas = 0;

        System.out.println("tente adivinhar o numero do computador(entre 1 e 100): ");
        
        while (true){
            int numero = scanner.nextInt();
            
            tentativas++;

            if (numero > 100){
                System.out.println("numero maior que 100");
            } else if (numero <1){
                System.out.println("numero menor que 1");
            } else if (numero < computador){
                System.out.println("chutou muito baixo, tente de novo: ");
            }else if (numero > computador){
                System.out.println("chutou alto demais, tente de novo: ");
            } else {
                System.out.println("Acertou! o numero era mesmo " + computador + " voce acertou em " + tentativas + " tentativas");
                break;
            }
        }
        
        scanner.close();

    }

}
