class LargestSmallestNumber{
	static int smallest(int num) {         
        int[] freq = new int[10]; 
        while (num > 0) { 
            int d = num % 10; 
            freq[d]++; 
            num = num / 10; 
        }
        int result = 0; 
        for (int i = 1 ; i <= 9 ; i++) { 
            if (freq[i] != 0){ 
                result = i; 
                freq[i]--; 
                break; 
            } 
        } 
        for (int i = 0 ; i <= 9 ; i++) 
            while (freq[i]-- != 0) 
                result = result * 10 + i; 
        return result; 
    } 
	static int largest(int num) { 
        int count[] = new int[10]; 
        String str = Integer.toString(num); 
        for(int i=0; i < str.length(); i++) 
            count[str.charAt(i)-'0']++;  
        int result = 0, multiplier = 1; 
        for (int i = 0; i <= 9; i++) { 
            while (count[i] > 0) { 
                result = result + (i * multiplier); 
                count[i]--; 
                multiplier = multiplier * 10; 
            } 
        } 
        return result; 
    } 
	public static void main(String args[]){
		int num = 6801028; 
        System.out.println("Given digits are:"+num+"\n Smallest: "+smallest(num)+"\n Largest: "+largest(num));
	}
}