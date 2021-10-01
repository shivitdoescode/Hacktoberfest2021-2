import java.util.Random;
import java.util.HashSet;
import java.util.Set;

public class test{
public static int[] inputData(int x[],int n){
	x[0] = 0;
	Random rd = new Random();
	for(int i=1;i<n;i++)
		//Generating the number in range
		x[i] = rd.nextInt()%n;
	return x;
}
public static int[] inputData(int x[],int n,int inc){
	x[0]=0;
	for(int i=1;i<n;i++)
		x[i] = x[i-1]+inc;
	return x;
}
public static void PrintElementsinBothArraysAlgforRandomInput (int A[], int B[]){
	if (A.length > 0 && B.length > 0) {
        Set<Integer> hash = new HashSet<Integer>();
        for (int i = 0; i < A.length; i++) 
            hash.add(A[i]);
        for (int j = 0; j < B.length; j++)
            if (hash.contains(B[j]))
                System.out.print(B[j]+" ");       
    }
}
public static void PrintElementsinBothArraysAlgforSortedInput (int A[], int B[]){
	if (A.length > 0 && B.length > 0) {
        Set<Integer> hash = new HashSet<Integer>();
        for (int i = 0; i < A.length; i++) 
            hash.add(A[i]);
        for (int j = 0; j < B.length; j++) 
            if (hash.contains(B[j]))
                System.out.print(B[j]+" ");
    
}
public static void main(String[] args) {
	int m=8,n=10;
	int[] a = new int[m];
	int[] b = new int[n];
	a = inputData(a,m);
	b = inputData(b,n);
	PrintElementsinBothArraysAlgforRandomInput(a,b);
	System.out.println();
	a = inputData(a,m,3);
	b = inputData(b,n,6);
	PrintElementsinBothArraysAlgforSortedInput(a,b);
	System.out.println();
}
}
