package practiceprograms;

import java.util.Scanner;

public class p14 {
	
	static int gcd(int m, int n)
	{
		if(m<n)
			return gcd(n,m);
		if(n==0)
			return m;                           
		return gcd(n,m%n);
	}

	public static void main(String[] args)
	{
	  Scanner sc=new Scanner(System.in);	
      System.out.println("enter the two numbers");
      int p=sc.nextInt();
      int q=sc.nextInt();
      int a=gcd(p,q);
      System.out.println(a);
	}

}
