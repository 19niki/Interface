/*
   An inteface can only inherit abstract methods, it cannot inherit the static methods.
Example for the class and Interface

calss example

Class Inter1
{
	static void run() //static method
	{
		System.out.println("Running slowly");
	}
}

class Inter2 extends Inter1
{ 
	static void sleep() 
	{
		System.out.println("Sleeping till mid night");
	}
}

class Interface7
{
	public static void main(String[] args)
	{
		Inter2.sleep(); // Executes
		Inter2.run(); // Executes
	}
}

// Example for the inteface

interface Inter1
{
	static void run() //static method
	{
		System.out.println("Running slowly");
	}
}

interface Inter2 extends Inter1
{ 
	static void sleep() 
	{
		System.out.println("Sleeping till mid night");
	}
}

class Interface7
{
	public static void main(String[] args)
	{
		Inter2.sleep(); // Executes
		Inter2.run(); // CTE because it is not inherited to Sub class
	}
}
*/
