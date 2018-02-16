
import java.util.HashSet;
public class HashCode {
		public static void main(String[] args)throws Exception{
		
		HashSet<Pair>hs=new HashSet<Pair>();
		hs.add(new Pair(1,2));//Hash code not found this error gets detected
		System.out.println(hs.size());
		//int h=s.nextInt();
		HashCode hc = new HashCode();//Dead store gets detected
	}
	static class Pair implements Comparable<Pair>
	{
		int a,b;
		Pair (int a, int b)
		{
			this.a= a;
			this.b=b;
		}
		public int compareTo(Pair o)
		{
			if(this.a!=o.a)
				return Integer.compare(this.a,o.a);
			else 
				return Integer.compare(this.b, o.b);
			//return 0;
		}
		public boolean equals(Object o)
		{
			if(o instanceof Pair) {
				Pair p = (Pair)o;
				return p.a==a && p.b==b;
			}
			return false;	
			}
		/*public int hashCode() {
			return new Integer(a).hashCode()*31+new Integer(b).hashCode();
	}*/
		}	
	}
