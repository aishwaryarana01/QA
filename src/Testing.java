public class Testing {
	private static String abc;

	public static void main(String[] args) throws Exception
	{
		 int sum = 0;
		 double gpa = 0;
		 int i = 0;
		 int f = -2;
		 int d = 0;
		 //wrong code
		if(f%2==1)//Error odd check in case of modulo negative number gets detected in FIndBugs but Missed in PMD
			{
				d++;
				System.out.println(d);
			}
			
		int x =5;;//Double semicolon is not detected by FIndBugs
		int s=32;
		//Wrong code
		double z = x/s;//type cast of x to long is required otherwise Integer overflow error
		System.out.println(z);
		
		
		 String[][] Students = {{"Justin", "Five", "A01"},
				 				{"Rudy", "Widers", "B12"},
				 				{"Trevor", "Don", "B21"},
				 				{"Steve", "Don", "D52"},
				 				{"Bob","Dill","E41"}};
		 
		 String[][] Subjects = {{"A01","BIO101","CHEM101","CS302","CS102","PE15"},
				 				{"B12","BIO101","CHEM302","PHIL302","LAB232","PHYS335"},
				 				{"C02","CHEM101","CAL302","ENG302","LAB232","PE15"},
				 				{"D52","PE15","ENG302","LAB302","FRE101","CS333"},
				 				{"E41","CHEM101","ENG302","LAB302","CS302","PHYS335"}};
		 
		 String[][] Grades = {{"A01","A","A","C","A","A"},
				 			  {"B12","B","C","B","D","A"},
				 			  {"C02","C","C","B","A","A"},
				 			  {"D52","A","D","B","F","A"},
				 			  {"E41","F","A","B","F","A"}};
		 abc = null;
		 if (abc.length()==1) { //null pinter dereferencing gets detected by FindBugs
			 //System.out.println("It is null");*/
		 }
		 
		 		 
		 double GPA_Storing[] = new double[Students.length];
		 	int c=0;
			boolean t =true;
			while(t)//infinite loop gets detected by find bugs
			{
				//if(c==5)
					//break;
				c++;
				
			}
			
		String value = Grades[c][50];
		if(value== "1" || value == "1") {
			//do something
		}
		
		double u=2/3;//double precision error gets undetected
		int q=3/0;//divide by zero goes undetected
		int y=4;
		if(y==4||y==4)//Repeated conditional test goes undetected
		{
			//if(y==4 || y==4))
			c++;
		}
	
		int v[] = new int[34]; //dead code gets detected detected by Find Bugs
		int h[]= new int[10];		
		int e[]= new int[10];
		
		h[12]=3; // detected by Find Bugs, not by PMD 
		e[13]=3; // detected by Find Bugs, not by PMD
		h[14]=3; // detected by Find Bugs, not by PMD
	
							
		System.out.println(e[12]);//Error index out of bound
		while(i<Students.length) 
		 {
			 
			 System.out.print("Student: ");
			 for(int j=0; j<Students[0].length - 1;j++)
		     {
		         System.out.print(Students[i][j]+ " ");
		     }
		     System.out.println("");
		 		
		     System.out.print("Subjects: ");
			 for(int j = 1; j<Subjects[0].length;j++)
		     {
		         System.out.print(Subjects[i][j]+ " ");
		     }
		     System.out.println("");    
		   	   
		     for(int j=1; j<Grades[i].length;j++)
		     {
		    	 switch(Grades[i][j])
		    	 {
		    	 case "A": Grades[i][j].equals("A");
		    	         sum += 4;
		    	         break;
		    	 case "B": Grades[i][j].equals("B");
    	                 sum += 3;
    	                 break;
		    	 case "C": Grades[i][j].equals("C");
                         sum += 2;
                         break;
		    	 case "D": Grades[i][j].equals("D");
                         sum += 1;
                         break;
                 default:
                         break; 
		    	 }		        
		     }
		     gpa=sum/0;
		     //gpa = sum / (Subjects[i].length - 1); 
		     System.out.println("GPA: " + gpa);
		     GPA_Storing[i] = gpa;
		     gpa = 0;
		     sum = 0;
		     
		     System.out.println();
		     i++;
		 }		 
		 for(i = 0; i < Students.length; i++)
		 {
			 
			  if(Students[i][0].equals(null) || !(Students[i][0] == null))
				  System.out.print(Students[i][0] + " has ");
			  
			  if(GPA_Storing[i] >= 3.0)
		         System.out.print("Passing ");
			  else
				 System.out.print("Failing ");  
			  
			  System.out.print("GPA");
			  System.out.println();
		 }		 
	}
	  public void foo() {
		    int x = 3;
		    x = x; //self assignment gets detected by FindBugs
		  }
	  public void foo1() {
		    int x,y;
		    x = x = 17;//double assignment on local variable gets detected by find bugs
		  }
		
	public static long gcd(long x, long y)//Functions is never used so it is of no use and it does not get detected by find bugs and PMD
	{
		if(x%y==0)
			return y;
		else
			return gcd(y, x%y);
	}
	
}
