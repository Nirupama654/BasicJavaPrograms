class ArmstrongCheck{
	public static void main(String[] args){
		int n=8208;
		int pow=0, rem=0, res=1, num=0;
		int temp=n;
		while(temp>0){
			temp/=10;
			pow++;
		}
		temp=n;
		while(temp>0){
			rem=temp%10;
			for(int i=0; i<pow; i++){
				res*=rem;
			}
			num+=res;
			res=1;
			temp/=10;
		}
		if(num==n)
			System.out.println(n+" is an Armstrong number.");
		else
			System.out.println(n+" is not an Armstrong number.");
	}
}