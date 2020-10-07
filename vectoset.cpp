#include<bits/stdc++.h>

using namespace std;

int main() 
{
	int n,num,no;
	cin>>n;
	vector<int> v;
	for(int i=0;i<n;i++)
	{
		cin>>num;
		v.push_back(num);
	}
	sort(v.begin(),v.end());
	for(auto it=v.begin();it!=v.end();it++)
	{
		no = *it;
		for(auto it1=it++;it1!=v.end();it1++)
		{
			cout<<*it1<<" ";
			if(*it1==*it)
				v.erase(it1);
			else
				break;
		}
	}
}