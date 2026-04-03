#include <stdio.h>

int main(){
    printf("bem vindo a calculadora fisica\n");
    int choice;
    printf("1. velocidade media\n2. aceleracao media\n3. equacao horaria\nselecione uma funcao: ");
    scanf("%d",&choice);

    if(choice == 1){
        int choicekmorm;
        printf("km/h(1) ou m/s?(2): ");
        scanf("%d\n", &choicekmorm);
        if (choicekmorm == 1)
        {
            float km;
            float h;

            printf("informe o espaco (em km): ");
            scanf("%f\n", &km);

            printf("informe o tempo (em h): ");
            scanf("%f\n", &h);

            float kmhtotal = km/h;

            printf("o resultado e %f\n", kmhtotal);
        }
        
    }

    return 0;
}