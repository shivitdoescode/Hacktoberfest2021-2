#include<bits/stdc++.h>
using namespace std;
void findPrime(int *arr,int n)
{
	int i=0;
	bool Prime[n+1];
	memset(Prime,true,sizeof(Prime));
	for(i=2;i<n;i++)
		if(Prime[i])
			for(int p=i;p*i<=n;p++)
				Prime[i*p]=false;//i*p means only the multiple indexes initialized with 0
	for(i=2;i<n;i++)
		if(Prime[i])
			cout<<i<<"\t";
	cout<<endl;
}
int main()
{
	int i;
	int arr[100];
	for(i=0;i<50;i++)
		arr[i]=i;
	findPrime(arr,50);
}
