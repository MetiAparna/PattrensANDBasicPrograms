package pattrens;

import java.util.Scanner;

public class fibeven1 {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter lower limit");
		int l=scn.nextInt();
		System.out.println("enter lower limit");
		int u=scn.nextInt();
		int a=0,b=1,c;
		while(true)
		{
			if(a>=u)break;
			if(a>l)
			{
				if(a%2==0)
				{
					System.out.println(a);	
				}
			}
			c=a+b;
			a=b;
			b=c;	
		}
	}

}
