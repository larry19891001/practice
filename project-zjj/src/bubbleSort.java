
public class bubbleSort 
{
public static void main(String args[])
{
	int []intArray={12,11,45,6,8,43,40,57,3,20};
	System.out.println("����ǰ�����飺");
	for(int i=0;i<intArray.length;i++)
		System.out.print(intArray[i]+"  ");
	System.out.println();
	int temp;
	for(int i=0;i<intArray.length;i++)
	{
		for(int j=i;j<intArray.length;j++)
		{
			if(intArray[j]<intArray[i])
			{
				temp=intArray[i];
				intArray[i]=intArray[j];
				intArray[j]=temp;
			}
		}
	}
	System.out.println("���������飺");
	for(int i=0;i<intArray.length;i++)
		System.out.print(intArray[i]+"  ");
}
}
