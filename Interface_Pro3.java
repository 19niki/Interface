/*
  Inheritance W.R.T Interfaces
  case 2 : - class inheriting the interface
  A calss can inherit the interface with the help of the "implements" keyword.
  
 */

//Example 01: one class inheriting one interface

public interface Interface_Pro3 
{
  void carinfo(); 
}


/* Driver class for thiseprogarm.
 
 
class Interface_Pro3_Driver implements Interface_Pro3
{
	public void carinfo()
	{
		System.out.println("car in good state");
	}
	public static void main(String[] args)
	{
		Interface_Pro3_Driver obj = new Interface_Pro3_Driver();
		obj.carinfo();
	}
}*/