package practiceprograms;

import java.util.Scanner;

public class p5 {

	public static void main(String[] args)
	
	{
	      Scanner sc=new Scanner(System.in);
	      System.out.println("enter the number");
	      int n=sc.nextInt();
	      int i;
	      if(n==1)
	      {
	    	  System.out.println("prime number starts from 2");  
	      }
	      for(i=2;i<n;i++)
	      {
	    	  if(n%i==0)
	    	   System.out.println("not a prime number");	  
	      }
           if(n==i)
            System.out.println("its a prime number");
            		
	}
}
