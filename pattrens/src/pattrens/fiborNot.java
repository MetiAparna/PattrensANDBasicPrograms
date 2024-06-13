package pattrens;

import java.util.Scanner;

public class fiborNot 
{

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scn.nextInt();
		int a=0,b=1,c;
		for(;a<n;)
		{
			c=a+b;
			a=b;
			b=c;
		}
		if(n==a)
		{
			System.out.println(+n+" is a fibanoic");
		}
		else
		{
			System.out.println(+n+" is not a fibanoic");
		}
	}

}
