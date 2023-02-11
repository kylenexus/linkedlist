//thea tenebro

public class Linkedlist {

    private Node head;

    public void addFirst(int data){
        //create a new node
        Node newnode = new Node(data);
        //new node points to the current head
        newnode.next = this.head;
        //head points to the new node
        this.head = newnode;
    }

    //function name: deleteFirst
    //param: none
    // return: -1 on error, 0 or success
    public int deleteFirst(){
        if(this.head == null) {
            System.out.println("Error: linkedlist is empty!");
            return -1;
        } else {/* do nothing */}

        //head should point to the next
        head = head.next;
        return 0;
    }

    public void addLast(int data){
         Node newNode = new Node(data);
         
         if (head == null){
           head = newNode;
           return;
         }
         
         Node last = this.head;
         while (last.next != null) {
           last = last.next;
         }
         
         last.next = newNode;
    }

    public void deleteLast() {
        if (head == null)
           return;
        
        if (head.next == null){
          head = null;
          return;
        }
        
        Node secondLast = head;
        
        while (secondLast.next.next != null) {
         secondLast = secondLast.next;
        }
        
        secondLast.next = null;
    }

    public void display(){
        Node temp = this.head;
        while(temp != null) {
            System.out.print(temp.data+ "->");
            temp = temp.next;
        }
        System.out.println();
    }

    public boolean exist(int data){
   	Node temp = this.head;
   	while (temp != null) 
   	{
   	  if (data == temp.data)
   		return true;
   		
   	  temp = temp.next;
   	}
   	return false;
    }

   public int delete(int data){
      Node temp = this.head, prev = null;

      // If head node itself holds the data to be deleted
      if (temp != null && temp.data == data) {
        head = temp.next; // Changed head
        return 0;
      }

      // Search for the data to be deleted, keep track of the
      // previous node as we need to change 'prev.next'
      while (temp != null && temp.data != data) {
        prev = temp;
        temp = temp.next;
      }

      // If data was not present in linked list
      if (temp == null) 
        return -1;

      // Unlink the node from linked list
      prev.next = temp.next;
      return 0;
    }


}