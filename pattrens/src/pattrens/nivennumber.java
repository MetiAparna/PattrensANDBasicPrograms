package pattrens;

import java.util.Scanner;

public class nivennumber 
{

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scn.nextInt();
		int temp=n;
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println("sum="+sum);
		if(temp%sum==0)
		{
			System.out.println("number is niven number="+temp);
		}
		else
		{
			System.out.println("number is not niven number="+temp);

		}
	}

}
