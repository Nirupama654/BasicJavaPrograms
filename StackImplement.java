/* Java program to implement basic stack operations */
import java.util.Arrays;
class Stack 
{ 
	static final int MAX = 10; 
	int top; 
	int a[] = new int[MAX]; 
	boolean isEmpty(){ 
		return (top < 0); 
	} 
	Stack(){ 
		top = -1; 
	} 
	boolean push(int x) { 
		if (top >= (MAX-1)) { 
			System.out.println("Stack Overflow"); 
			return false; 
		} 
		else{ 
			a[++top] = x; 
			System.out.println(x + " pushed into stack"); 
			return true; 
		} 
	} 
	int pop() { 
		if (top < 0){ 
			System.out.println("Stack Underflow"); 
			return 0; 
		} 
		else{ 
			int x = a[top--]; 
			return x; 
		} 
	} 
	void display(){
		System.out.println(Arrays.toString(a));
	}
} 
 
class StackImplement 
{ 
	public static void main(String args[]) 
	{ 
		Stack s = new Stack(); 
		s.push(10); 
		s.push(20); 
		s.push(30); 
		System.out.println(s.pop() + " Popped from stack"); 
		s.display();
	} 
} 