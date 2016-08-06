package Carlo;

public class QUEUE {
	private int QSIZE;
	private int[]queue;
	private int nItems = 0;

	public QUEUE(int size){
		this.QSIZE= size;
		this.queue = new int[this.QSIZE];
	}

	public void showQueue(){
			for (int i=0; i< this.QSIZE;i++){
			System.out.println("QUEUE["+i+"] = " + this.queue[i]);
			
		}
			System.out.println();
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
				System.out.println("The Queue is Empty");
				return true;
			}	else{
				return false;
			}}

	public boolean enqueue (int num) {
			System.out.println("Trying to enqueue " + num + "...");
			if (!this.isFull()){
				this.queue[nItems] = num;
				System.out.println("\t" + "Added " + num);
				this.nItems++;
					return true;
			}	else{
				return false;
			}}
	// i modify dequeue base on the pop the stock
	public void dequeue() {
		 if (isEmpty()) {
		    	System.out.println("REMOVE FAILED, Storage is empty.");
		      System.out.println();
		    } else {
		      nItems = 0;
		      System.out.println("... trying to dequeue [" + (nItems) + "] ...");
		      System.out.println(queue[nItems] + " was successfully removed.");
		      System.out.println();
		      queue[nItems++] = 0;
		      nItems--;
		      for(int i=0;i<=nItems;i++){
		    	  queue[nItems+1] =  queue[nItems];
		      }
		      nItems++;
		    }
		 //reArrange is not working yet  
		 }

	public int peekFront() {
			System.out.println("The front number is : "+queue[0]);
			return this.queue[0];
	}
	public int peekRear() {
		System.out.println("The rear number is : "+queue[this.nItems-1]);
			return this.queue[this.nItems-1];
	}

	public static void main(String[]args){
		
		QUEUE Demo = new QUEUE(10);
		  Demo.showQueue();
		  Demo.enqueue(23);
		  Demo.showQueue();
		  Demo.dequeue();
		  Demo.dequeue();
		  Demo.enqueue (21);
		  Demo.showQueue();
		  Demo.enqueue (12);
		  Demo.enqueue (3);
		  Demo.enqueue (1);
		  Demo.enqueue (2);
		  Demo.enqueue (9);
		  Demo.enqueue (10);
		  Demo.showQueue();
		  Demo.peekFront();
		  Demo.peekRear();
		  Demo.showQueue();
		  Demo.dequeue();
		  Demo.dequeue();
		  Demo.showQueue();
		  
		  // im having trouble with dequeue
	}
	
}
