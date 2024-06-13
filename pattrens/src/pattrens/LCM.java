package pattrens;

import java.util.Scanner;

public class LCM 
{

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a value");
		int a=scn.nextInt();
		System.out.println("enter b value");
		int b=scn.nextInt();
		int n=a>b?a:b;
		while(true)
		{
			if(n%a==0 && n%b==0)
			{
				break;
			}
			n++;
		}
		System.out.println("LCM="+n);
	}

}
