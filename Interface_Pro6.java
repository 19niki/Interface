/*
 *Inheritance W.R.T Interfaces
  Who to achieve the multiple inheritance in java?
  In java we can achive the multiple inheritance 
   1. With the help of interface
   2. Combitaion of class and interface
   
 In multiple inheritance we can convert the reference of one parent type to another parent type
 explictly with the help of type cast operator  

  case 4: - Multiple inheritance in Java using the interfaces

 */
//Example 03: one class inheriting any number of interface
// in this example class Inter8 and Interface_Pro6 are on same level i.e parent level and class inter9 is the child.

class Inter8
{
	void run()
	{
		System.out.println("running");
	}
}


public interface Interface_Pro6 
{
         public void swim(); 
}


class Inter9 extends Inter8 implements Interface_Pro6 
{

	@Override
	public void swim() {

System.out.println("Swimming");
		
	}
	
}
//
/*
public class Interface_Pro6_Driver {

	public static void main(String[] args)
	{
		
             Inter8 obj1 = null;    // Refernce of Inter8 class
             Inter9 obj2 = null;    // Refernce of Inter9 class
             obj1 = obj2;           // storing refrence of obj2 in obj1
             Interface_Pro6  obj3;  // creating refrence for interface
             obj3 = obj2;           // storing of Inte9 ref in in the Obj3 i.e Interface refernce
             obj1 = (Inter8)obj3; //type casting opertor is used to convert Inter9 to Inter8 
             
             System.out.println(obj1);
             System.out.println(obj2);
             System.out.println(obj3);
	}

}
*/