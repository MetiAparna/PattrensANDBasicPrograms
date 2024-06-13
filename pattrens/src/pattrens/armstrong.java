package pattrens;

import java.util.Scanner;

public class armstrong
{

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scn.nextInt();
		int count=0;
		int sum=0;
		int temp=n;
		while(n>0)
		{
			count++;
			n=n/10;
		}
		System.out.println("length="+count);
		n=temp;
		while(n>0)
		{
			 int dig=n%10;
			 int prod=1;
			 for(int i=1;i<=count;i++)
			 {
				 prod=prod*dig;
			 }
			 sum=sum+prod;
			 n=n/10;
		}
		System.out.println("sum="+sum);
		if(sum==temp)
		{
			System.out.println(temp+" is armstrong");
		}
		else
		{
			System.out.println(temp+" is  not armstrong");
		}
		
	}

}
