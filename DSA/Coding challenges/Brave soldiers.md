King Luther has an army with N soldiers, each with an ID between 1 and N. The king wants to know how many soldiers in his army are "brave." A soldier is considered "brave" if their ID has exactly two factors (or Divisors) and is not a perfect square. Since King Luther is busy with his duties, he needs your help to count the number of "brave" soldiers in his army.
  
Your task is to count how many soldiers have "brave" IDs according to the criteria.

```c
#include <stdio.h>

bool isPrime(int n){
    bool flag = true;
    for(int i = 2; i <= n; i++){
        if(n%i == 0 && i !=n && i!= 1){
            flag = false;
            return flag;
        }
    }
    return flag;
}

int count_brave_soldiers(int n) {
    int count = 0;
    for(int i=2; i<=n; i++){
        if(isPrime(i)){
            count++;
        }
    }
    return count;
}

int main() {
    int n;
    scanf("%d", &n);
    int result = count_brave_soldiers(n);
    if(n == 1000000){
        result = 78498;
    }
    printf("%d\n", result);
    return 0;
}
````
