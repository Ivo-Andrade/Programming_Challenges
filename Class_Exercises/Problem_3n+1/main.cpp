/******************************************************************************
// 100 - 3n + 1
******************************************************************************/
#include <stdio.h>


int main(){

  int i,j,c,n,res,temp,x,y;
  char w;

  while (!feof(stdin)){
    scanf("%d",&i);
    scanf("%d",&j);
    res = 0;
    if(j > i){
        x = i;
        y = j;
    }
    else{
        x = j;
        y = i;
    }
    c = x;
    while(c <= y){
        n = c;
        temp = 0;
        while(n != 1){
            if(n%2 != 0) n = 3*n + 1;
            else n = n/2;
            temp++;
        }
        temp++;
        if(temp > res) res = temp;
        c++;
    }
    printf("%d %d %d\n",i, j, res);
    scanf("\n",w);
  }
  return 0;
}
