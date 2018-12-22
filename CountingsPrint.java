class CountingsPrint{
	public static void main(String[] args){
	int count=1;
		for(int i=0; i<10; i++){
			count=1;
			while(count<101){
				if(i+count<10)
					System.out.print(" "+(i+count)+"  ");
				else
					System.out.print((i+count)+"  ");
				count+=10;
			}
		System.out.println(" ");
		}
	}
}