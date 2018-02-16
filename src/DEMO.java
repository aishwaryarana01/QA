
public class DEMO {

	public static void main(String[] args) throws Exception
	{
		 int sum = 0;
		 double gpa = 0;
		 int i = 0;
		
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
		 
		 double GPA_Storing[] = new double[Students.length];
		 
		 while(i < Students.length)
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
		     gpa = sum / (Subjects[i].length - 1); 
		     System.out.println("GPA: " + gpa);
		     GPA_Storing[i] = gpa;
		     gpa = 0;
		     sum = 0;
		     
		     System.out.println();
		     i++;
		 }		 
		 
		 for(i = 0; i < Students.length; i++)
		 {
			  System.out.print(Students[i][0] + " has ");
			  
			  if(GPA_Storing[i] >= 3.0)
		         System.out.print("Passing ");
			  else
				 System.out.print("Failing ");  
			  
			  System.out.print("GPA");
			  System.out.println();
		 }		 
	}	
}
