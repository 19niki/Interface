/*
Interface can only have 
1. Only abstract methods
2. Static final varible
3. Static methods
*/

interface Interface3
{
	static final int a = 10; //Static final varible
	void test(); // Only abstract methods
	public static void main(String [ ] args) //Static methods
	{
		System.out.println(a);
		
	}

}