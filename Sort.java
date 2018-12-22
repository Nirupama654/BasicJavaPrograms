public class Sort {
    public static void bubble_sort(int array[]) {
        int n = array.length;
        int temp;
        for (int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        display(array);
    }
    
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index]) 
                    index = j;
      
            int smallerNumber = arr[index];  
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        display(arr);
    }

    static void sort(int arr[]){ 
        int n = arr.length; 
        for (int i=1; i<n; ++i){ 
            int key = arr[i]; 
            int j = i-1; 
            while (j>=0 && arr[j] > key){ 
                arr[j+1] = arr[j]; 
                j = j-1; 
            } 
            arr[j+1] = key; 
        } 
    } 

    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
        bubble_sort(input);
        System.out.println();
        selectionSort(input);
        System.out.println();
        sort(input);
        display(input);
        
    }
}