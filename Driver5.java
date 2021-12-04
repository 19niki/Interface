interface I1
{
}
interface I2
{
}
interface I extends I1,I2
{
}
class A1 implements I
{
}
class B1 extends A1 implements I
{
}
class  Driver5
{
	public static void main(String[] args) 
	{
		A1 obj = new A1();
        B1 obj2 = new B1();
		I obj3 = obj2;
		obj =(A1)obj3;
		System.out.println(obj);
		System.out.println(obj2);
	}
}
