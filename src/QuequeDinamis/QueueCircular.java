package QuequeDinamis;

public class QueueCircular {
  
    private Object [] queueCirc;
    private int head;
    private int tail;
    private int maxsize;
    
    public QueueCircular(int size){
       maxsize = size;
       queueCirc = new Object[maxsize];
	  head = 0;
	  tail = queueCirc.length - 1;
    }

    public boolean isEmpty(){
	  return ((tail+1) % queueCirc.length == head);
    }
    
    public boolean isFull(){
	  return ((tail+2) % queueCirc.length == head);
    }
    
    public void enqueue(Object x){
       if (!isFull()) {
     tail = ((tail+1) % queueCirc.length);
     queueCirc[tail] = x;
     System.out.println("Enqueue -> "+x);
  }else{
     System.out.println("Queue is full");
        }    
    }
    
    public Object dequeue(){
	Object temp = null;
	if( !isEmpty() ) {
        temp = queueCirc[head];
        head = ((head+1) % queueCirc.length);
	}
	return temp;
    }
    public void displayQueue(){
    if (isEmpty()){
        System.out.println("Queue is empty");
    }else{
         int i = head;
        while (i !=tail){
         System.out.println(queueCirc.length);   
        }
        System.out.println(queueCirc[tail]);
    }
    }
     public static void main(String[] args) {
        QueueCircular queue = new QueueCircular(5);
        queue.enqueue(22);
        queue.enqueue(31);
        queue.enqueue(36);
        queue.enqueue(34);
        queue.enqueue(67);
        
    }
}


