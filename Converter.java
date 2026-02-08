//dia 7

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Bem vindo ao conversor! o que voce quer converter?");

        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");
        System.out.println("3.km para milhas");
        System.out.println("4.milhas para km");

        int fatorTemperatura  = 9/5;
        double fatorDistancia = 1.609;

        int escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.println("Digite a temperatura em Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * fatorTemperatura) + 32;
            System.out.println(celsius + " graus Celsius equivalem a " + fahrenheit + " graus Fahrenheit.");
        } else if (escolha == 2){
            System.out.println("Digite a temperatura em Fahrenheit: ");

            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) / fatorTemperatura;
            System.out.println(fahrenheit + " graus Fahrenheit equivalem a " + celsius + " graus Celsius.");      
        } else if (escolha == 3){
            System.out.println("Digite a distancia em km: ");

            double km = scanner.nextDouble();
            double milhas = km / fatorDistancia;
            System.out.println(km + " km equivalem a " + milhas + " milhas.");
        } else if (escolha == 4){
            System.out.println("Digite a distancia em milhas: ");

            double milhas = scanner.nextDouble();
            double km = milhas * fatorDistancia;
            System.out.println(milhas + " milhas equivalem a " + km + " km.");
        } else {
            System.out.println("Escolha invalida!");
        }

        scanner.close();
    }
}
