package assignment5;
import java.util.*;
class UserVerySmallNumException extends Exception
{  
   static public String str;
    UserVerySmallNumException(String str)
    {
        this.str=str;
    }
    static private String tostring()
    {
        return "UserVerySmallNumException caught";
    }
}
class MyClass extends Thread{ 
	public void run() 
	{ 
		try { 
			for (int i = 0; i < 5; i++) { 
				System.out.println("Child Thread executing"); 

			
				Thread.sleep(1000); 
			} 
		} 
		catch (InterruptedException e) { 
			System.out.println("InterruptedException occur"); 
		} 
	} 
} 
public class ExceptionError {
  static double  divide(int a,int b) 
  {
      try{
          if(b==0)
              throw new ArithmeticException("can't divide a number by zero");
          
           }
      catch(ArithmeticException e)
      {
          System.out.println("Exception caught:"+e);
          return 5;
      }
      System.out.println("No Exception caught:");
       return a/b;
  }
  static void  IOB(int arr[],int n) 
  {
      try{
          if(n>arr.length)
              throw new ArrayIndexOutOfBoundsException(" size is greater than array length");
          
           }
      catch(ArrayIndexOutOfBoundsException e)
      {
          System.out.println("Exception caught:"+e);
          return ;
      }
      System.out.println("No Exception caught:");
       Scanner sc=new Scanner(System.in);
       int num;
       System.out.println("Enter "+n+"values");
       for(int i=0;i<arr.length;i++)
       {
           num=sc.nextInt();
           arr[i]=num;
       }
       
  }
  
    static double Rectangle  (int l,int b) 
  {
      try{
          if(l<0 || b<0)
              throw new IllegalArgumentException("length or breadth can't be negative");
          
           }
      catch(IllegalArgumentException e)
      {
          System.out.println("Exception caught:"+e);
          return 5;
      }
      System.out.println("No Exception caught:");
      return l*b;
       
  }
   static  double user(double a,double b) throws UserVerySmallNumException
    {
        
            if((a/b)<0.00001)
            throw new UserVerySmallNumException("user very small number exception");
            else
                return a/b;
            
       
        
    }
   static void index(int arr[],int index,int val )
   {
       try{
           arr[index]=val;
       }
       catch(IndexOutOfBoundsException e)
       {
           System.out.println("Exception caught : "+e);
       }
   }
    static void create(int size )
   {
       try{
          int arr[]=new int[size];
       }
       catch(NegativeArraySizeException e)
       {
           System.out.println("Exception caught : "+e);
       }
   }
    static void nullptr()
    {
        String str=null;
        try
        {
            if(str.equals("Java"))
                System.out.println("Equal");
        }
        catch(NullPointerException e)
        {
            System.out.println("Exception caught : "+e);
        }
    }
    static void illegal()
    {
        String str="Java";
        try{
           if(str.equals(UserVerySmallNumException.str))
              throw new IllegalAccessException();
           }
        catch(IllegalAccessException e)
        {
            System.out.println("Exception caught :"+e);
        }
    }
    static void interupt()
    {
        MyClass th = new MyClass(); 
                     th.start(); 
                      th.interrupt();
    }
  
    public static void main(String[] args) throws InterruptedException
    {
         int arr[]=new int[10];
        boolean flag=true;
        char ch;
        Scanner sc=new Scanner(System.in);
        while(flag)
        {
         
            try{
                System.out.println("\n");
             System.out.println("\t\t\t Exception Handling");
             System.out.println("a) ArithmeticException");
             System.out.println("b) ArrayIndexOutOfBoundsException");
             System.out.println("c) IllegalArgumentException");
             System.out.println("d) IndexOutOfBoundsException");
             System.out.println("e) NegativeArraySizeException");
             System.out.println("f) NullPointerException");
             System.out.println("g) IllegalAccessException");
             System.out.println("h) InterruptedException");
             System.out.println("i) User defined exception");
             System.out.println("j)stop handling exception");
             System.out.println("\n");
             System.out.println("Enter your choice :");
             ch=sc.next().charAt(0);
             switch(ch)
             {
                 case 'a':
                 case 'A':
                   System.out.println("perform divison operation and enter the denominator 0 :"); 
                     int a,b;
                     System.out.println("Enter your numbers :");
                     a=sc.nextInt();
                     b=sc.nextInt();
                     divide(a,b);
                     break;
                 case 'b':
                 case 'B':
               System.out.println(" give the number of elements greater than 10 :"); 
               System.out.println("How many elements you want in array:");
              int n=sc.nextInt();
             
              IOB(arr,n);
                     break;
                case 'c':
                case 'C':
               System.out.println("calculate area of Rectangle and pass negative length or breadth :");
                    int len,br;
                    System.out.println("Enter length:");
                    len=sc.nextInt();
                    System.out.println("Enter breadth:");
                    br=sc.nextInt();
                    Rectangle(len,br);
                    break;
                case 'd':
                case 'D':
                   System.out.println("Enter array index and value to be assigned in a array of size 10:");
                   int index,val;
                    index=sc.nextInt();
                    val=sc.nextInt();
                    index(arr,index,val);
                    break;
                case 'e':
                case 'E':
                    System.out.println("Enter negative array size to be created :");
                    int size;
                    size=sc.nextInt();
                    create(size);
                    break;
                case 'f':
                case 'F':
                   nullptr();
                    break;
                case 'g':
                case 'G':
                    System.out.println("trying to call the tostring method of UserVerySmallNumException class");
                      illegal();
                    break;  
                case 'h':
                case 'H':
                     interupt(); 
                       break;
                case 'i':
                case 'I':
                System.out.println("Enter two value and the second value should be very much greater than the first :"); 
             double p,q;
                System.out.println("Enter values:");
                    p=sc.nextDouble();
                    q=sc.nextDouble();
                    user(p,q);
                    break;
                case 'j':
                case 'J':
                    flag=false;
                    break;
               
             }
           }
        catch(UserVerySmallNumException e)
        {
            System.out.println("Exeption caught:"+e);
        }
    
        }
       
        
        
    }
    
}