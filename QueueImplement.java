public class QueueImplement {
	public static final int DEFAULT_SIZE=5;
	private Object data[];
	private int index;
	public QueueImplement(){
		data=new Object[DEFAULT_SIZE];
	}
	public boolean isEmpty(){
		return index==0;
	}
	public void enqueue(Object obj) throws Exception{
		if(index==DEFAULT_SIZE-1){
			throw new Exception("Queue is full. Dequeue some objects");
		}
		this.data[index]=obj;
		this.index++;
	}
	public Object dequeue() throws Exception{
		if(isEmpty())throw new Exception("Queue is empty");
		Object obj=this.data[0];
		for(int i =0; i<this.index-1; i++){
			data[i]=data[i+1];
		}
		this.index--;
		return obj;	
	}
	public void display(){
		for(Object k:data)
			System.out.println(k);
	}
	public static void main(String[] args) throws Exception {
		
		QueueImplement queue = new QueueImplement();
		queue.enqueue("1");
		System.out.println(queue.dequeue());
		
		queue.enqueue("2");
		queue.enqueue("3");
		queue.enqueue("4");
		System.out.println(queue.dequeue());
		
		queue.enqueue("5");
		queue.enqueue("6");
		//queue.enqueue("7");
		//queue.enqueue("8");
		System.out.println("Final Queue is:\n");
		queue.display();
	}

}
