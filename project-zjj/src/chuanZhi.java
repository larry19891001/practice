
public class chuanZhi 
{
	public int money;
	void amethod(int i)
	{
		System.out.println("�����õ���i��ֵΪ��"+i);
		i=i*5;
		System.out.println("����ִ����� i=i*5��i��ֵΪ��"+i);
		System.out.println("money��ֵΪ��"+this.money);
	}
	public static void main(String[] args)
	{
		chuanZhi pt=new chuanZhi();
		pt.money=100;
		pt.amethod(pt.money);
	}

}
