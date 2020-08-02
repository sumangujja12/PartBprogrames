package partbprg;

public class prg2 {
	public static void main(String args[])
	{
		String s1="Bangalore is in India";
		String[] s3=s1.split(" ");
		int k=s3.length;
		for(int m=0;m<k;m++)
		{
			String s4=s3[m];
			int q=s4.length();

		char s2[]=s4.toCharArray();// it will convert string to array
		//System.out.println("The String is:" + carray);
		int l= s2.length;
		
		for(int i=0;i<l;i++)
		{
			int b=1;
			for(int j=i+1;j<l;j++)
			{
			if(s2[i]==s2[j] && s2[i]!=' ')
			{
				b=b+1;
				s2[j]='0';
			}
				
		}
			if(b>1 && s2[i]!='0')
			{
				System.out.print(s2[i]);
				System.out.println(b);
				
			
			System.out.println(s3[m]);
			}
	}
	}


	}
}
