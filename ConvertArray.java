package ArrayProblems;

public class ConvertArray {
	private static String[] transformArr(String[] arr, int n)
	{
		int len = arr.length;
		String[] newArr = new String[len]; // new array which stores transformed array
		for(int i=0; i<len; i++) 
		{
			int t = (i+n) / n;
			int row = t - 1;
			int col = i - (row*n);
			int newIndex = col*n + row; // bcoz (row*n + col = i)
			newArr[newIndex] = arr[i];
		}
		return newArr;
	}
	public static void main(String args[])
	{
		String a[] = {"a1", "a2", "a3", "b1", "b2", "b3", "c1", "c2", "c3"};
		int N = 3; // a1, a2, ......., aN
		String rslt[] = ConvertArray.transformArr(a, N);
		
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
