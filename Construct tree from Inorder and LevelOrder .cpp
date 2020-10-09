#include <bits/stdc++.h>

using namespace std;
struct Node
{
	int key;
	struct Node *left;
	struct Node *right;
	
	Node(int x){
	    key = x;
	    left = NULL;
	    right = NULL;
	}
};

Node* buildTree(int inorder[], int levelOrder[], int iStart, int iEnd,int n);
void printPreorder(Node* node)
{
    if (node == NULL)
       return;
    cout << node->key << " ";
    printPreorder(node->left);
    printPreorder(node->right);
    
}
int main()
{
    int t;
    cin>>t;
    while(t--){
    int n;
    cin>>n;
    int in[n],level[n];
    for(int i=0;i<n;i++){
        cin>>in[i];
    }
    for(int i=0;i<n;i++){
        cin>>level[i];
    }
    Node *root=NULL;
    root = buildTree(in, level, 0, n - 1,n);
    printPreorder(root);
    cout<<endl;
    }
    return 0;
}// } Driver Code Ends


/*Complete the function below
Node is as follows:
struct Node
{
    int key;
    struct Node* left, *right;
};
*/

Node* buildT(int inorder[], int levelOrder[], int iStart, int iEnd,int in,int n,map<int,int> &m)
{
    if(iStart>iEnd)
    return NULL;
    while(in<n &&(m[levelOrder[in]]<iStart || m[levelOrder[in]]>iEnd))
    in++;
    if(in==n)
    return NULL;
     Node* t= new Node(levelOrder[in++]);
     int i=m[t->key];
  t->left=buildT(inorder,levelOrder,iStart,i-1,in,n,m);
  t->right=buildT(inorder,levelOrder,i+1,iEnd,in,n,m);
  return t;
}

Node* buildTree(int inorder[], int levelOrder[], int iStart, int iEnd,int n)
{
    map<int,int> m;
    for(int i=0;i<n;i++)
    {
        m[inorder[i]]=i;
    }
    return buildT(inorder, levelOrder,iStart,iEnd,0,n,m);
    
}
