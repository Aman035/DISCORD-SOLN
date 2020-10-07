#include<bits/stdc++.h>
using namespace std;
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int A[3];
		cin>>A[0]>>A[1]>>A[2];
		sort(A,A+3);
		if(A[2]==A[1]&&A[2]>=A[0])
		{
			cout<<"YES\n";
			int ans[3];
			ans[0]=A[2];
			ans[1]=A[0];
			ans[2]=A[0];
			cout<<ans[0]<<" "<<ans[1]<<" "<<ans[2]<<"\n";
		}
		else
			cout<<"NO\n";
	}
	return 0;
}