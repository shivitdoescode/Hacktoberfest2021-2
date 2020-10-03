# Hacktoberfest-2020
A maintainer repo for HACKTOBERFEST 2020
#include<vector>
using namespace std;

int main() {
	int t;
	cin>>t;
	while(t--)
	{
	    int n;
	    cin>>n;
	    vector<long long>a(n),ans(n);
	    ans[0]=1;
	    for(int i=0;i<n;i++)
	    cin>>a[i];
	    
	    stack<long long>s;
	    for(int i=0;i<n;i++)
	   { while(!s.empty() && a[i]>=a[s.top()]){
	    s.pop();
	    }
	    ans[i]=(s.empty())?(i+1):(i-s.top());
	    s.push(i);
	   }
	for(int i=0;i<n;i++)
	cout<<ans[i]<<" ";
	cout<<endl;
	}

	return 0;
}
