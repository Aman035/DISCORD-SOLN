#include<bits/stdc++.h>
# define mp make_pair
# define pb push_back
# define pp pair<int,int>
#define fast ios_base::sync_with_stdio(0);cin.tie(0);cout.tie(0);
#define ll long long
#define M 1000000007
using namespace std;

int main()
{
    fast
    int t;
    cin>>t;
    while(t--)
    {
    	int n,m;
        cin>>n>>m;
        ll A[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
                cin>>A[i][j];
        }
        
        ll ans=0;
        for(int i=0;i<n/2;i++)
        {   
            ll a,b,c,d;
            
            for(int j=0;j<m/2;j++)
            {
                a=b=c=0;
                a = abs(A[i][j]-A[n-i-1][j])+abs(A[i][j]-A[n-i-1][m-j-1])+abs(A[i][j]-A[i][m-j-1]);

                b = abs(A[i][m-j-1]-A[n-i-1][j])+abs(A[i][m-j-1]-A[n-i-1][m-j-1])+abs(A[i][j]-A[i][m-j-1]);

                c = abs(A[i][j]-A[n-i-1][j])+abs(A[n-i-1][j]-A[n-i-1][m-j-1])+abs(A[n-i-1][j]-A[i][m-j-1]);

                d = abs(A[i][j]-A[n-i-1][m-j-1])+abs(A[n-i-1][j]-A[n-i-1][m-j-1])+abs(A[i][m-j-1]-A[n-i-1][m-j-1]);

                ans +=min(a,min(b,min(c,d)));
               // cout<<min(a,min(b,min(c,d)))<<"\n";
            }
        }
        ans=ans;
        if(n%2)
        {
            for(int j=0;j<m/2;j++)
            {
                if(A[n/2][j]!=A[n/2][m-j-1])
                    ans+=abs(A[n/2][j]-A[n/2][m-j-1]);
            }
        }
        if(m%2)
        {
            for(int j=0;j<n/2;j++)
            {
                if(A[j][m/2]!=A[n-j-1][m/2])
                    ans+=abs(A[j][m/2]-A[n-j-1][m/2]);
            }
        }
        cout<<ans<<"\n";
    }
    return 0;
}
