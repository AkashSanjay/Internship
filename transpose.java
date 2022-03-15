package transposeofmatrix;

public class transpose {
	int arr1[][]= {{1,3,4},{2,5,6},{8,9,7}};
	int transpose[][]=new int[3][3];                                                                      {
			
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			transpose[i][j]=arr1[j][i];
		}
	}
	System.out.println("original matrix");
	for(int i=0;i<3;i++) 
	{
		for(int j=0;j<3;j++) 
		{
			System.out.println(arr1[i][j]+"");
		}
			
	}
	System.out.println("transpose matrix");
	for(int i=0;i<3;i++) 
	{
		for(int j=0;j<3;j++) 
		{
			System.out.println(transpose[i][j]+"");
		}
}}}
