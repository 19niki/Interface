/*
 What is a Interface?
  it is a non - primitive user defined data type which is used to achive 100% abstraction and multiple inheritance.
   Syntax :
  interface interface name
  {
  
  }
  1.By default interface is abstract
  2. We cannot create the object for the interface
  3. If we compile the interface we get the "class file".
  4. We cannot make the interface as "private" or "protected", We can only make it as public or default.
  5. We cannot make the interface as final
  6. We cannot create the object for the interface.
  7. BY default inteface will make the methods as public we cannot have protected or private methods in interface.
  8. In interface we can use public sataic method since it is ststic method and execute the program
  
   We only have the below things in interface
   - abstract methods
   - static final varibles // By default will make static final varible.
   - non static methods.
   
   Check interface progarm from Interface1 to Inrtaface 10
  
 */
public interface Interface_Pro1 
{
      static final int a =10;  // static final variable
      
     static void car() //static method
      {
    	  System.out.println("car is running at speed:" +a);
      }
     
     void carinfo(); //non-static abstract method by default
     
     public static void main(String[] args) //static method
     {
    	System.out.println(a);
    	car();
     }
     
}
