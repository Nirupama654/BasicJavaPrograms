public class Occurence{
    public static void main(String[] args){
        int n, x, count = 0, i = 0;
        int a[] ={12,24,45,12,46};
        x = 12;
        for(i = 0; i < a.length; i++){
            if(a[i] == x){
                count++;
            }
        }
        System.out.println(x+" occur "+count+" times");
    }
}