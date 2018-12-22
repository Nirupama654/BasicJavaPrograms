public class FibonacciSeries{
	public static void main(String[] args){
		int n=8;
		int t1=0, t2=1, nextTerm=0;
		
		while(n>0){
			System.out.print(t1+"  ");
			nextTerm= t1+ t2;
			t1= t2;
			t2= nextTerm;
			n--;
		}
		
	}
}