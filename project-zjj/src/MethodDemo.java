
public class MethodDemo 
{
public static void main(String args[])
{
	Human wangming = new Human();
	wangming.name="����";
	wangming.age=25;
	wangming.sex="��";
	wangming.addr="�й�����";
	System.out.println(wangming.name+"����23�������ڸ���");
	System.out.println(wangming.getState(23));
	System.out.println("����15����");
	System.out.println(wangming.getState(15));
	}
}
