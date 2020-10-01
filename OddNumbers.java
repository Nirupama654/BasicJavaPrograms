import java.util.Scanner;

class OddNumbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Range in which you want to find the list of Odd Numbers ?(Lower & Upper limit of the Range respectively)");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int k=a; k<=b; k++){
			if(k%2==0)
				System.out.print(" ");
			else
				System.out.print(" "+k+ " ");
		}
	}
}
