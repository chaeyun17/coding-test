#include <stdio.h>

int main(void){
    int memory[1001] = {};
    int N;
    scanf("%d", &N);

    memory[1] = 1;
    memory[2] = 3;
    int i=0;
    for(i=3; i<=N; i++){
        memory[i] = (memory[i-1] + memory[i-2]*2) % 10007;
    }

    printf("%d\n", memory[N]);
    return 0;
}