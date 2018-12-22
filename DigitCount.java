class DigitCount{
	public static void main(String[] args){
		int[] arr= new int[]{12,542,85,5,448,844,89,45,22,6,7};
		int d1=0, d2=0, d3=0, d4=0;
		for(int i: arr){
			if(i>0 && i<10)
				d1++;
			else if(i>9 && i<100)
				d2++;
			else if(i>99 && i<1000)
				d3++;
			else if(i>999)
				d4++;
			else
				System.out.println("Ambiguity in input.");	
		}
		System.out.println("One Digit: "+d1+"\nTwo Digit: "+d2+"\nThree Digit: "+d3+"\nMore Than Three Digit: "+d4);
	}
	
}