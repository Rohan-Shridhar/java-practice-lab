Given a number N. Your task is to create a program to calculate the N-th term of the Alice choice.
Alice's sequence consists of the squares of prime numbers: 2^2, 3^2, 5^2, 7^2, 11^2,13^2,17^2,19^2, 23^2, 29^2,…………


```c
#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
        int N;
        scanf("%d",&N);
        int answer=0, count=0;
        for(int i=2;count < N; i++){
            bool isPrime = true;
            for(int j=2;j<=i;j++){
                if(i%j == 0 && i!=j){
                    isPrime = false;
                }
            }
            if(isPrime){
                answer=i*i;
                count++;
            }
        }
        printf("%d",answer);  
    return 0;
}
````
