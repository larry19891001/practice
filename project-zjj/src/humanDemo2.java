
public class humanDemo2 
{
	public static void main(String args[]){
Human2 zhangsan=new Human2(null, null, 0, null);
	Human2 qq=new Human2("青青","女", 0, null);
	Human2 lisi=new Human2("李四","男",20,"中国上海");
	System.out.println("张三的信息：");
	System.out.println("姓名："+zhangsan.name+"\n 性别:"+zhangsan.sex+"\n 年龄："+zhangsan.age+"\n 地址："+zhangsan.addr);
	System.out.println("青青的信息：");
	System.out.println("姓名："+qq.name+"\n 性别："+qq.sex+"\n 年龄："+qq.age+"\n 地址："+qq.addr);
	System.out.println("李四的信息：");
	System.out.println("姓名："+lisi.name+"\n 性别："+lisi.sex+"\n 年龄："+lisi.age+"\n 地址："+lisi.addr);
	
}
}
