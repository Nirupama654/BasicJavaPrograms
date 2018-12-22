import java.util.Arrays;
public class MaxDigit{
    public static void main(String[] aa){
        int num = 760039,i=0,count=0;
        String res="";
        int[] arr = new int[6];
        while(num !=0){
            arr[i] = num%10;
            num = num/10;
            i++;
        }
        Arrays.sort(arr);
        for(i=0;i<arr.length;i++){
            if(arr[i]==0){
                count++;
            }else{
                res +=arr[i];   
                while(count>0){
                    res +="0";
                    count--;
                }
            }
        }
        System.out.print("Shortest number is "+res);
        res="";
        for(i=arr.length-1;i>=0;i--){
            res += arr[i];
        }
        System.out.print("\nLargest number is "+res);
    }
}
