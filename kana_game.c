#include<stdio.h>
#include<stdlib.h>

/* 
		CODED BY AVI
    _    _     _  ___
   / \	 \\   //  | |
  / _ \   \\_//   | |
 /_/ \_\   \_/    |_|
*/
int Absorbtion(int hit)
{
	hit=(hit/2)+10;
	return hit;
}
int Lighting_Strike(int hit)
{
	hit=hit-10;
    return hit;
}
void hit_loss(int hit,int abs,int lgtstrk)
{
	while(abs)
	{
		if(hit<=20)// this is required as absorbtion spell is inaffective on health less than equal to 20 it might also  increase health of the dragon(eg -health=16-->health 18) 
			break;                                                                                      
		hit=Absorbtion(hit);
		abs--;
	}
	while(hit>0 && lgtstrk>0)
	{
		hit=Lighting_Strike(hit);
		lgtstrk--;
	}
	if(hit>0)
		printf("NO\n");
	else
		printf("YES\n");
}
int main()
{
	int t;
	scanf("%d",&t);
	while(t)
	{
    	int hit,abs,lgtstrk;
	    scanf("%d %d %d",&hit,&abs,&lgtstrk);	
	    hit_loss(hit,abs,lgtstrk);
	    t--; 
	}
	return 0;
}