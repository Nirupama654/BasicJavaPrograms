public class ArrayPattern{
    public static void main(String[] aa){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int j=arr.length-1;
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                System.out.print(arr[j]);
                j--;
            }
            else{
                System.out.print(arr[k]);
                k++;
            }
        }
    }
}