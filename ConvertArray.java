package ArrayProblems;

public class ConvertArray {
	private static String[] transformArr(String[] arr, int n, int nr)
	{
		int len = arr.length;
		String[] newArr = new String[len]; // new array which stores transformed array
		for(int i=0; i<len; i++) 
		{
			int t = (i+n) / n;
			int row = t - 1;
			int col = i - (row*n); // finding col no. considering RMO (row  major order)
			int newIndex = col*nr + row; // finding newIndex based on CMO (column major order)
			newArr[newIndex] = arr[i];
		}
		return newArr;
	}
	public static void main(String args[])
	{
		String a[] = {"a1", "a2", "a3", "a4", "b1", "b2", "b3", "b4", "c1", "c2", "c3", "c4"}; // this can be visualized as 3x4 2D array
		int N = 4; // a1, a2, ......., aN
		int nr = 3; // no. of rows i.e different variables list, like here run of a's, b's and c's => a,b,c gives 3 rows
		String rslt[] = ConvertArray.transformArr(a, N, nr);
		
		System.out.println("Input Array:");
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]);
			System.out.print("  ");
		}
		
		System.out.println("\n\nTransformed Array:");
		for(int i=0; i<rslt.length; i++)
		{
			System.out.print(rslt[i]);
			System.out.print("  ");
		}
	}
}
