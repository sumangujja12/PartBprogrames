package partbprg;

import java.util.Arrays;

public class prg1 {
	static int product = 1;
	 static boolean isNumber = true;

	public static void main(String[] args) 
	{
		 int n = 445110;
//142857
		int a1[] =  IntegerToArray(n);
		
		
		for(int j=100000; j<=300000; j++)
		 {
			 product = j*2;
			int a2[] = IntegerToArray(product);
			 
			 if(Arrays.equals(a1, a2))
			 {
				 System.out.println("Number is: " +j);
//				 break;
			 }
			
		 }
	}
	
	public static int[] IntegerToArray(int n)
	{
		 int length = (int)Math.log10(n) + 1;
		 int i = 0;
		 int a[] = new int[length];
	
		 while(n != 0)
		 {
			 a[i] = n % 10;
			 n = n / 10;
			 i++;
			 
		 }
		 Arrays.sort(a);
		 
//		 for(int it: a)
//		 {
//			 System.out.print(it);
//		 }
		 
		 return a;
	}	 
}
