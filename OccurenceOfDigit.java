import java.util.Arrays;
public class OccurenceOfDigit{
	
	public static void main(String[] args){
		int[] array= new int[]{50,60,50,60,50,60,50,60,60};
		//	Sort the array
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
		//traversing array
		int j=0, count, len= array.length;
		while(j<len){
			count=0;
			for(int i=j; i<array.length; i++){
				if(array[j]==array[i])
					count++;
			}
			System.out.println(array[j]+" occurred "+count+" times.");
			j+= count;
		}
		
		
		
	}
}