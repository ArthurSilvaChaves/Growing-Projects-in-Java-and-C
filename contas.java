//dia 4

import java.util.Scanner;

public class contas {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("O que deseja fazer?");
            System.out.println("1 - calcular area do triangulo");
            System.out.println("2 - calcular hipotenusa");
            System.out.println("3 - calcular area do circulo");
            System.out.println("4 - sair");
        
            int escolha = scanner.nextInt();

            if (escolha == 1){
                System.out.println("digite o valor da base do seu triangulo: ");
                double base = scanner.nextDouble();

                System.out.println("Digite o valor da altura do seu triangulo: ");
                double altura = scanner.nextDouble();

                double areatriangulo = (base * altura) / 2;
                System.out.println("a area deste triangulo e: " + areatriangulo);
            } else if (escolha == 2){
                System.out.println("digite o valor do primeiro cateto: ");
                double cateto1 = scanner.nextDouble();

                System.out.println("digite o valor do segundo cateto: ");
                double cateto2 = scanner.nextDouble();

                double hipotenusa = (Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
            
                System.out.println("o valor dessa hipotenusa e: "+ Math.pow(hipotenusa, 0.5));
            } else if (escolha == 3){
                System.out.println("digite o valor do raio do circulo: ");
                double raio = scanner.nextDouble();

                double areacirculo = Math.PI * raio * raio;
                System.out.println("a area do circulo e: " + areacirculo);
            } else if(escolha > 4 || escolha < 1){
                System.out.println("opcao invalida, tente novamente");
            } else {
                System.out.println("saindo");
                break;
            }
        }
        
        scanner.close();
    }
}
