package pattrens;

import java.util.Scanner;

public class bintodec 
{

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter binary number");
		int bin=scn.nextInt();
		int dec=0;
		int i=1;
		while(bin>0)
		{
			dec+=(bin%10)*i;
			i=i*2;
			bin=bin/10;
		}
		System.out.println("decimal "+dec);
	}

}
