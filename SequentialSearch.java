class SequentialSearch{
	public static void main(String[] args){
		int[] array= new int[]{10,24,4,12,54,42,65,5,84,42,9,54,36,84};
		int item= 4, flag=0, count=0;		
		for(int i: array){
			if(i==item){
				System.out.println("Value: "+item+" is at location- "+count);
				flag=1;
				break;
			}
			count++;
		}
		if(flag==0)
				System.out.println("Item is not available in the array.");
	}
}