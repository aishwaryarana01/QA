
public class Conditions {

	public static void main(String[] args) {
        String a = "Alex";
        String b = "Bob";
        
        if(a==b)  //String Compares Supposed to uses .Equal() Both Detects, 
        //if(a.equals(b))
        	System.out.println("They are equal");
        else 
        	System.out.println("They are not");        
        	
		int f = -2;
		int c = 0;
		int y = 4;
		int t = 2;
		
		if(f%2==1)//Error odd check in case of modulo negative number gets detected in FIndBugs but Missed in PMD
		{
			c++;
		}
		
		
		if(y==4||y==4)//Repeated conditional test goes undetected in FindBugs and PMD
		{
			//if(y==4 || y==4))
			c++;
		}
		
		int r=0; 
		
		if((f&t)!=0)
			r++;
		
		try
		{
					
		} finally {
			
		}
		//Missing break statement in switch case
		char grade = 'C';
		
		switch(grade) {
        case 'A' :
           System.out.println("Excellent!"); 
           break;
        case 'B' :
        case 'C' :
           System.out.println("Well done");
           break;
        case 'D' :
           System.out.println("You passed");
        case 'F' :
           System.out.println("Better try again");
           //break; PMD and FindBugs both detects Missing Break Statement
        default :
           System.out.println("Invalid grade");
     }
		
		try {
			 throw new Exception(); //CRITICAL BUG DON't DON't THROW RAW EXCEPETION PMD
        }
        catch (final Exception e) {
            System.out.println("Catch");
        }		
				
	}
		
	public static long gcd(long x, long y)//Functions is never used so it is of o use nd it doenot get detected by findbugs
	{
		if(x%y==0)
			return y;
		else
			return gcd(y, x%y);
	}
}
