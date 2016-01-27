
public class chuanZhi 
{
	public int money;
	void amethod(int i)
	{
		System.out.println("方法得到的i的值为："+i);
		i=i*5;
		System.out.println("方法执行语句 i=i*5后i的值为："+i);
		System.out.println("money的值为："+this.money);
	}
	public static void main(String[] args)
	{
		chuanZhi pt=new chuanZhi();
		pt.money=100;
		pt.amethod(pt.money);
	}

}
