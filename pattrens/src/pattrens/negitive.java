package pattrens;

import java.util.Scanner;

public class negitive {

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter nuber");
		int n=scn.nextInt();
		if(n<0)
		{
			System.out.println("negitive");
		}
		else
		{
			System.out.println("no negitive");
		}
	}

}
