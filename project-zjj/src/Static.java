
public class Static 
{
	int commanint=0;
	static int staticint=0;
	Static(int x)
	{
		commanint=x;
	}
	public static void main(String args[])
	{
		Static s1=new Static(1);
		Static s2=new Static(2);
		System.out.println("s1.commanint="+s1.commanint);
		System.out.println("s2.commanint="+s2.commanint);
		System.out.println("s1.staticint="+s1.staticint);
		System.out.println("s2.staticint="+s2.staticint);
		s1.commanint++;
		System.out.println("改变commanint的值");
		System.out.println("s1.commanint="+s1.commanint);
		System.out.println("s2.commanint="+s2.commanint);
		System.out.println("s1.staticint="+s1.staticint);
		System.out.println("s2.staticint="+s2.staticint);
		s1.staticint++;
		System.out.println("通过s1改变staticint的值为："+s1.staticint);
		System.out.println("s2的staticint的值为："+s2.staticint);
		
	}

}
