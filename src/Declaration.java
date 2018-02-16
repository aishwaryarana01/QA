import java.io.PrintWriter;

public class Declaration {
	
	static long mod= 1000000007;
	static int xx;
	private static String abc;
	
	public static void main(String[] args) {
		//BASIC DELCARATION AND ACCESSING
		
		int xx = 0;
				
		xx=xx;//Self assignment is detected Find Bugs
		
		int min =Integer.MAX_VALUE;
		int max=Integer.MAX_VALUE;
		
		int sum= max+max;//Integer overflow gets undetected;
		
		int yy[]=new int[min*max*max*min*10000000];//array memory out of space gets undetected
				
		yy[0]=0;	
		
		int ff = 0;//dead code FindBugs does not detect, PMD detects
		int gg;;//Double semicolon FindBugs does not detect, PMD detects
		
		gg = 0;
		System.out.println(gg);
		abc = null;
		abc.length();
		
		int q=3/0;//divide by zero goes undetected
				
		double u=2/3;//double precision error gets undetected by both
		
		System.out.println(u);
		
		long x=5;
		int y=4;
		long z = x<<32;//type cast of x to long is required otherwise Integer overflow error
		
		
		//Input-output file
		PrintWriter pw = new PrintWriter(System.out);
		pw.println("d");
		//pw.close();//PrintWriter is not closed but it is not detected
		//s.close();//Scanner is not closed but it is not detected;
		
		
		/////ARRAY BASED DECLARATION AND ACCESSING
		int v[] = new int[34]; //dead code gets detected detected by Find Bugs
		int h[]= new int[10];		
		int e[]= new int[10];
					
		for(int i = 0; i < 9; i++)
			 h[i] = i;
		
		h[12]=3; // detected by Find Bugs, not by PMD 
		e[13]=3; // detected by Find Bugs, not by PMD
		h[14]=3; // detected by Find Bugs, not by PMD
							
		System.out.println(e[12]);//Error index out of bound
	
	}

}
