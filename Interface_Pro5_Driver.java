/*
  Inheritance W.R.T Interfaces
  case 3 : - class inheriting any number of interface
  A calss can inherit one class and any number of interface
  when a class inherits the interface and class then we shold always write the extend first and second implements 
  (i.e) we must inheirt the class fisrt the we have inheirt the interfaces

  case 4: - a interface cannot inheirt the class which is not possible

 */
//Example 03: one class inheriting any number of interface

class Interface6
{
	void multiply(int a, int b)
	{
         System.out.println(a*b);
	}
}

interface Inter13
{
   void add(int a, int b);
}

interface Inter23
{
   void sub(int a, int b);
}

class Interface8 extends Interface6 implements Inter13,Inter23
{
      public void add(int a, int b)
	{
		  System.out.println(a+b);
	}
    
	public void sub(int a, int b)
	{
         System.out.println(a-b);
	}

}


class Interface_Pro5_Driver
{
	public static void main(String[] args) 
	{
		Interface8 obj = new Interface8();
		obj.add(50,56);
		obj.sub(45,76);
		obj.multiply(12,6);
	}
}
