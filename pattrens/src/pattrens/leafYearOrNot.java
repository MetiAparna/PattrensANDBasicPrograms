package pattrens;

import java.util.Scanner;

public class leafYearOrNot {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a number");
		int y=scn.nextInt();
		if((y%400==0)||(y%100!=0 && y%4==0))
		{
			System.out.println("leaf year="+y);
		}
		else
		{
			System.out.println("not a leaf="+y);
		}

	}

}
