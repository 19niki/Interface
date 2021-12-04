class A
{
}
interface B
{
}
class C extends A implements B 
{
}
class  Driver3
{
	public static void main(String[] args) 
	{
		A obj1 = new A();
        C obj2 = new C();
		B obj3 = obj2;
        obj1 = (A)obj3;



		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
	}
}
