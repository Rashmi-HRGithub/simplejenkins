package practiceprograms;

import java.util.Scanner;

public class p6 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter the number");
	    int n=sc.nextInt();
	    System.out.println("prime numbers from 1 and " +n);
	    for(int i=1;i<n;i++)
	    {
	    	boolean isPrime=true;
	    	for(int j=2;j<i;j++)
	    	{
	    	   if(i%j==0)
	    	   {
	    		   isPrime=false;
	    		   break;
	    	   }   
	    	}
	    		
	    	if(isPrime)
	    	System.out.println(i+ " ");
	    	
	    }
	} 
  
	}

