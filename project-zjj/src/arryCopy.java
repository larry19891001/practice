
public class arryCopy 
{
	public static void main(String args[])
	{
		int[] array1={1,2,3};
		int[] array2={4,5,6};
		System.out.println("��������ĳ�ֵ��");
		for(int i=0;i<array1.length;i++)
			System.out.println("array1["+i+"]="+array1[i]);
		for(int i=0;i<array2.length;i++)
			System.out.println("array2["+i+"]="+array2[i]);
		array1=array2;
		System.out.println("ִ�����鿽�������������ֵ��");
			for(int i=0;i<array1.length;i++)
				System.out.println("array1["+i+"]="+array1[i]);
			for(int i=0;i<array2.length;i++)
				System.out.println("array2["+i+"]="+array2[i]);
			System.out.println("�ı�array2[0]��ֵ");
			array2[0]=10;
			System.out.println("array1[0]="+array1[0]);
			System.out.println("array2[0]="+array2[0]);
				
	}

}
