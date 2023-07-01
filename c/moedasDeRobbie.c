# include <stdio.h>
# include <math.h>

int main() {

    int quantMoedas, valores[20], salto, soma, primo = 0;
    double raiz;

    while(!primo) {

        soma = 0;
        primo = 1;

        scanf("%d", &quantMoedas);

        for(int i = 0; i < quantMoedas; i++) {
            scanf("%d", &valores[i]);
        }

        scanf("%d", &salto);

        for(int i = quantMoedas - 1; i >= 0; i -= salto) {
            soma += valores[i];
        }   

        raiz = sqrt(soma);

        if(soma > 1) {
            
            for(int i = 3; i <= raiz; i += 2) {
                if(soma % i == 0) {
                    primo = 0;
                    break;
                }
            }

        }

        if(primo) {
            printf("You're a coastal aircraft, Robbie, a large silver aircraft.\n");
        } else {
            printf("Bad boy! I'll hit you.\n");
        }

    }

    return 0;
}
