
public class erWei 
{
public static void main(String args[])
{
	int[][] twoD1={
			{1,2,3,4,5},
			{6,7,8,9,10},
			{11,12,13,14,15},
			{16,17,18,19,20},
			{21,22,23,24,25},
	};
	int [][] twoD2=new int[5][5];
	int k=1;
	for(int i=0;i<twoD2.length;i++)
		for(int j=0;j<twoD2[i].length;j++)
			twoD2[i][j]=k++;
	System.out.println("�������twoD1:");
	for(int i=0;i<twoD1.length;i++)
	{
		for(int j=0;j<twoD1[i].length;j++)
			System.out.print(twoD1[i][j]+"  ");
		System.out.println();
	}
	System.out.println("������� twoD2:");
	for(int i=0;i<twoD2.length;i++)
	{
		for(
				int j=0;j<twoD2[i].length;j++)
			System.out.print(twoD2[i][j]+"  ");
		System.out.println();
	}
	}
}
