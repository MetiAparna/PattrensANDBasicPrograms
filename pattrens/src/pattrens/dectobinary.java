package pattrens;

import java.util.Scanner;

public class dectobinary {

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter dec number");
		int dec=scn.nextInt();
		int bin=0;
		int i=1;
		while(dec>0)
		{
			int bit=dec%2;
			bin=bin+(bit*i);
			i=i*10;
			dec=dec/2;
		}
		System.out.println("binary num="+bin);
	}

}
