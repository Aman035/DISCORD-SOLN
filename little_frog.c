#include<stdio.h>
#include<stdlib.h>
/*
    LOGIC USED-----
    pick first mound->last mound->2nd mound->2nd last mound->.......
    and so on in this manner we always move in a particular direction once and switch directions

    your solution may differ and may be correct as many solutions are possible!!!!!!!

*/
int main()
{
	int n;
	scanf("%d",&n);
	int array[n];
	for(int i=1,j=n,k=0;k<n;i++,j--,k++)// k for traversing,i and j to fill elements
	{
		array[k]=i; //fills even indexes in increasing order 
		array[++k]=j; // fill odd indexes in decreasing order
	}
	for(int i=0;i<n;i++)
	{
		printf("%d ",array[i]);
	}
	return 0;
}