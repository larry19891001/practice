
public class MethodDemo 
{
public static void main(String args[])
{
	Human wangming = new Human();
	wangming.name="王明";
	wangming.age=25;
	wangming.sex="男";
	wangming.addr="中国北京";
	System.out.println(wangming.name+"晚上23点钟你在干嘛");
	System.out.println(wangming.getState(23));
	System.out.println("下午15点呢");
	System.out.println(wangming.getState(15));
	}
}
