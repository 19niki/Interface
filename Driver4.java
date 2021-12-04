/*
 Achiving the multiple inheritance with the help of Interface
*/
interface A2
{
}
class B2 implements A2
{
}
class C2 implements A2
{
}
class  Driver4
{
	public static void main(String[] args) 
	{
		C2 obj = new C2();
        B2 obj2= new B2();
		A2 obj3 = obj2;
		obj = (C2)obj3;			 

		
	}
}
