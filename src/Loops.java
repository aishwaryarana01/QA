
public class Loops {

	public static void main(String[] args) {
		int array_a[] = new int[6];
		int array_b[] = new int[6];
		
		for(int i = 0; i<6; i++)
		{
			array_a[i] = i;
			array_b[i] = i;			
		}
		
		int sum_a = 0;
		for(int i = 0; i < 6; i++)
		    sum_a += array_a[i];
					
		int sum_b = 0;
		for(int i = 0; i < 6; i++)
	        sum_b += array_b[i];
		
		System.out.println( sum_a + " "+ sum_b);
		wild();
		wild2();
		wild3();
	
	}	
	
	public static void wild()
	{
			int c=0;
			boolean x =true;
			while(x)//infinite loop gets detected by find bugs
			{
				//if(c==5)
					//break;
				c++;
				
			}
	}
	public static void wild2()
	{
		for(int i=1; i>0; i++)//infinite loop goes undetected by findbugs
		{
			
		}
	}
	public static void wild3()
	{
		
		while(true)
		{
			//System.out.println();
		}
	}
}
