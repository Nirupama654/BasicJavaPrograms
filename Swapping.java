public class Swapping{
	public static void main(String args[]){
	
		int x=10, y=20;
		System.out.println("values before swapping \n  x: "+x+"\t y: "+y);
		x= x+ y;
		y= x- y;
		x= x- y;
		System.out.println("values after swapping \n  x: "+x+"\t y: "+y);
		
	}
}