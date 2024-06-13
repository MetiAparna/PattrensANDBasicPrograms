package pattrens;

import java.util.Scanner;

public class fibalt3 {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scn.nextInt();
		int a=0,b=1,c;
		for(int i=0;i<=3*n;i++)
		{
			if(i%3==0)
			{
				System.out.println(a);
			}
			c=a+b;
			a=b;
			b=c;
		}
	}

}
