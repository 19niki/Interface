/*
 Inheritance W.R.T Interfaces
 
 case 1 : - Interface inheriting the interface
 A interface can inherit one or any number of the interfaces with the help of keyword "Extends".
 -> Only abstract methods will be inherited and static methods will not be inherited.
 
 */

public interface Interface_Pro2 
{
   void add(int a, int b); //non static abstract method
}


interface Inter2 extends Interface_Pro2
{
    void sub(int a, int b); //non static abstract method
}

class Driver_Interface_Pro2 
{
	public static void main(String[] args)
	{
		
	}
}