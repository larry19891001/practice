
public class student 
{
	int id=0;
	static int studentNum=0;
	student(int x)
	{
		id=x;
		studentNum++;
	}
	public static void main(String args[])
	{
		student s1=new student(1000);
		student s2=new student(1001);
		student s3=new student(1002);
		student s4=new student(1003);
		System.out.println("s1��ѧ�ţ�"+s1.id);
		System.out.println("s2��ѧ�ţ�"+s2.id);
		System.out.println("s3��ѧ�ţ�"+s3.id);
		System.out.println("s4��ѧ�ţ�"+s4.id);
		System.out.println("ѧ������Ŀ��"+student.studentNum);
		
		
	}

}
