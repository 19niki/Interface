/*
  Inheritance W.R.T Interfaces
  case 2 : - class inheriting any number of interface
  A calss can inherit the interface with the help of the "implements" keyword.
  
 */

//Example 02: one class inheriting any number of interface

interface inter10 
{
   void run();
	
}

interface inter20  
{
	void swim();
	
}


class Interface_Pro4 implements inter10,inter20
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

class Interface_Pro4_Driver
{
	public static void main(String[] args)
	{
         Interface_Pro4 obj = new Interface_Pro4();
		 obj.run();
		 obj.swim();
	}
}
