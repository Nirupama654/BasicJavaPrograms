class TablePrint{
	public static void main(String[] args){
	int count;
		for (int i=1; i<11; i++){
			count=1;
			while(count<=10){
				if(i*count<10)
					System.out.print((i*count)+"    ");
				else
					System.out.print((i*count)+"   ");
				count++;
			}
			System.out.println(" ");
		}
	}
}