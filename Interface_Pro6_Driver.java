
public class Interface_Pro6_Driver {

	public static void main(String[] args)
	{
		
             Inter8 obj1 = null;
             Inter9 obj2 = null;
             obj1 = obj2;
             Interface_Pro6  obj3;
             obj3 = obj2;
             obj1 = (Inter8)obj3;
             System.out.println(obj1);
             System.out.println(obj2);
             System.out.println(obj3);
	}

}
