package practiceprograms;

import java.util.Scanner;

import org.testng.annotations.Test;

public class p1 {
	@Test
public void p1() 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter value of n");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++)
	{
		System.out.println(i);
	}	
}
	
	

}
