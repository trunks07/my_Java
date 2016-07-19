package Carlo;

public class My {
	
	int QSIZE;
	private int[]queue;
	private int nItems;

	public My(int size){
		this.QSIZE= size;
		this.queue = new int[this.QSIZE];
	}
	public My() {
		// TODO Auto-generated constructor stub
	}
	public void showQueue(){
			for (int i=0; i< this.QSIZE;i++){
			System.out.println("Queue["+i+"] = " + this);
		}
	}

	public boolean isFull() {
			if (this.nItems == this.QSIZE) {
				System.out.println ("The Queue is already full");
				return true;
			} else{
				return false;
			}}
			
	public boolean isEmpty() {
			if (this.nItems == 0){
				System.out.println ("The Queue is Empty");
				return true;
			}	else{
				return false;
			}}

	public boolean enqueue (int num) {
			System.out.println("Trying to enqueue" + num + "...");
			if (!this.isFull()){
				this.queue[nItems] = num;
				System.out.println("\t" + "Added " + num);
				this.nItems++;
					return true;
			}	else{
				return false;
			}}

	public int dequeue(int num) {
			System.out.println("Trying to dequeue" + num + "...");
			{ if (!this.isEmpty())
					this.queue[nItems-1]=num;
					System.out.println ("\t" + "Deleted " + num);
					this.nItems--;
					return num;
				}}

	public int peekFront() {
			return this.queue[0];
	}
	public int peekRear() {
			return this.queue[this.nItems-=1];
	}

	public static void main(String[]args){
		
		My Demo = new My();
		  Demo.enqueue(1);
		  Demo.dequeue(1);
		  Demo.enqueue(2);
		  Demo.enqueue (5);
		  
	}
	
}
