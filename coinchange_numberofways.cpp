//You can go though the qouestion:-https://www.geeksforgeeks.org/coin-change-dp-7/

// { Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

 // } Driver Code Ends

long long dp[1002][1002];
long long int cnt(int S[], int m, int n) {
  if ((m == 0 && n == 0 ) || (n == 0)) {
    dp[m][n] = 1;
    return dp[m][n];
  }
  else if (m == 0 ) {
    dp[m][n] = 0;
    return dp[m][n];
  }
  else if (dp[m][n] != -1)
    return dp[m][n];
  else {
    if (S[m - 1] <= n)
      dp[m][n] = cnt(S, m, n - S[m - 1]) + cnt(S, m - 1, n);
    else
      dp[m][n] = cnt(S, m - 1, n);
    return dp[m][n];
  }
}
class Solution
{

public:
  long long int count( int S[], int m, int n )
  {
    for (int i = 0; i <= m; i++) {
      for (int j = 0; j <= n; j++) {
        dp[i][j] = -1;
      }
    }
    return cnt(S,m,n);
  }
};


// { Driver Code Starts.
int main()
{
    int t;
    cin>>t;
	while(t--)
	{
		int n,m;
		cin>>n>>m;
		int arr[m];
		for(int i=0;i<m;i++)
		    cin>>arr[i];
	    Solution ob;
		cout<<ob.count(arr,m,n)<<endl;
	}
    
    
    return 0;
}  // } Driver Code Ends
