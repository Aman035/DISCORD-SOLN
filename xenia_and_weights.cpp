#include<bits/stdc++.h>
using namespace std;
int steps;
vector<int>weights;
vector<int>ans;
bool dfs(int balance,int prev,int n)
{
	if(n==steps)
		return 1;

	for(int i=0;i<weights.size();i++)
	{
		if(weights[i]!=prev)
		{
			if(balance==0)
			{
				ans.push_back(weights[i]);
				if(dfs(weights[i],weights[i],n+1))
					return 1;
				ans.pop_back();
			}
			else
			{
				if(balance<0)
				{
					if(balance+weights[i]>0)
					{
						ans.push_back(weights[i]);
						if(dfs(balance+weights[i],weights[i],n+1))
							return 1;
						ans.pop_back();
					}
				}
				else
				{
					if(balance-weights[i]<0)
					{
						ans.push_back(weights[i]);
						if(dfs(balance-weights[i],weights[i],n+1))
							return 1;
						ans.pop_back();
					}
				}
			}
		}
	}
	return 0;
}
int main()
{
	string s;
	cin>>s;
	for(int i=0;i<s.size();i++)
	{
		if(s[i]!=48)
			weights.push_back(i+1);
	}
	cin>>steps;
	if(dfs(0,0,0))//Keep track of balance weight and previous value
	{
		cout<<"YES\n";
		for(int i=0;i<ans.size();i++)
			cout<<ans[i]<<" ";
	}
	else
		cout<<"NO\n";
	return 0;
}