#include <stdio.h>
#include <string.h>

// ********* Torre de Hanói **********

// Movimenta uma peça, faz isso adicionando mais um [x, y] à lista
void movePeca(int inicio, int fim, char caminho[]) {

        caminho[strlen(caminho)] = ',';
        caminho[strlen(caminho)] = ' ';
        caminho[strlen(caminho)] = '[';
        caminho[strlen(caminho)] = inicio + '0';
        caminho[strlen(caminho)] = ',';
        caminho[strlen(caminho)] = ' ';
        caminho[strlen(caminho)] = fim + '0';
        caminho[strlen(caminho)] = ']';
        caminho[strlen(caminho)] = '\0';

}

// Padrão de movimentação para resolver a torre de duas peças
// Com apenas esses movimentos, é possível resolver toda a torre
void twoPieceSolve(int inicio, int meio, int fim, char caminho[]) {

    movePeca(inicio, meio, caminho);
    movePeca(inicio, fim, caminho);
    movePeca(meio, fim, caminho);

}

// Resolve o problema da torre, guardando no array caminho as informações
void solve(int numeroDePecas, int inicio, int meio, int fim, char caminho[]) {

        if(numeroDePecas == 1) {

            movePeca(inicio, fim, caminho); // Caso alguém resolva executar com um
            return;

        } else if(numeroDePecas != 2) {

            // Caso não seja de duas peças, chama a função de novo invertendo o fim e o meio
            // Isso permite que a torre comece a ser construída no espaço extra para levar a última peça ao fim
            solve(numeroDePecas - 1, inicio, fim, meio, caminho);

        } else {

            // Depois de chegar em duas peças, executa e encerra a função para não executar o trecho debaixo
            twoPieceSolve(inicio, meio, fim, caminho);
            return;

        }
        movePeca(inicio, fim, caminho); 
        // Manda resolver de novo, invertendo inicio e meio, assim construindo outra torre menor no início
        solve(numeroDePecas - 1, meio, inicio, fim, caminho); 
    
}

int main() {

    int numeroDePecas;
    char caminho[150000] = ""; // Array gigante pra conter os caracteres, aguenta até 14 discos

    printf("Insira o numero de pecas da torre: ");
    scanf("%d", &numeroDePecas);
    printf("\n");
    
    solve(numeroDePecas, 1, 2, 3, caminho);

    for(int i = 1; i < strlen(caminho); i++) {

        printf("%c", caminho[i]);   // Imprime todo o caminho

    }

    printf("\n\nModelo: [Posicao da peca a se mover, Posicao para qual mover]\n\n");

    system("pause"); // Faz com que o CMD não feche logo que termina a execução
}