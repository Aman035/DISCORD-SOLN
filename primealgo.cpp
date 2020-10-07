#include<bits/stdc++.h>
using namespace std;

void prime(int n)
{
	while(!(n&1))
	{
		cout<<"2 ";
		n >>= 1;
	}
	for(int i=3; i<=sqrt(n); i+=2)
	{
		while(!(n%i))
		{
			cout<<i<<" ";
			n/=i;
		}
	}
	if(n > 2)
		cout<<n;
}

int main()
{
	int n;
	cin>>n;
	prime(n);
}