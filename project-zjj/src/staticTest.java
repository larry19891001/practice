
public class staticTest {
private static int staticInt = 2;
private int random = 2;
public staticTest()
{
	staticInt++;
	random++;
	System.out.println("staticInt = "+staticInt+" random = "+random);
	
}
public static void main(String[] args)
{
	staticTest test= new staticTest();
	staticTest test2= new staticTest();
	staticTest test3= new staticTest();
	staticTest test4= new staticTest();
	}
}
