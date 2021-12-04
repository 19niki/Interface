/*
  Inheritance W.R.T Interfaces
  case 2 : - class inheriting any number of interface
  A calss can inherit the interface with the help of the "implements" keyword.
  
 */

//Example 02: one class inheriting any number of interface

interface inter11
{
   void run();
	
}

interface inter21 
{
	void swim();
	
}


class Interface_Pro40 implements inter11,inter21
{
	public void run()
	{
		System.out.println("running slowly");
	}

	public void swim()
	{
		System.out.println("Swimming slowly");
	}
	
}

class Interface_Pro40_Driver
{
	public static void main(String[] args)
	{
         Interface_Pro4 obj = new Interface_Pro4();
		 obj.run();
		 obj.swim();
	}
}
