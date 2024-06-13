package com.StringBuffer;

public class byUsingEqualsMethod 
{
	public static void main(String[] args) 
	{	
	String s1=new String("java");
	String s2=new String("java");
   System.out.println(s1==s2);//compare address//false
   System.out.println(s1.equals(s2));//compare value//true
	
   StringBuffer a=new StringBuffer("java");
	StringBuffer b=new StringBuffer("java");
  System.out.println(a==b);//compare address//false
  System.out.println(a.equals(b));//compare value/false
	

}
}
