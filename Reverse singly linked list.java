import java.util.Arrays;
import java.util.Collections;

class Main {	 
	public static int kthSmallest(Integer[] a, int K)
	{	 
		Arrays.sort(a);
		return a[K - 1];
	}

	public static void main(String[] args)
	{
		Integer a[] = new Integer[] { 34,23,452,63,134,64,13 };
		int K = 4;	 
		System.out.print("K'th smallest element is "+ kthSmallest(a, K));
	}
  
}


