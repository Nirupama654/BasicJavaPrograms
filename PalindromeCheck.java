
class JavaPrograms{
	boolean palindromeCheck(int x){
		int i=x;
		int rev=0, temp=0;
		while(i!=0){			
			temp= i%10;
			rev= rev*10 + temp;
			i/=10;
		}
		if(x==rev)
			return true;
		else
			return false;
	}
	
}
public class PalindromeCheck{
	public static void main(String[] args){
		JavaPrograms jp= new JavaPrograms();
		System.out.println(jp.palindromeCheck(1551));
	}
}