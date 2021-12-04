

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
}