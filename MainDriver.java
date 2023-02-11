public class MainDriver {
    public static void main(String[] args)
    {
        Linkedlist ll = new Linkedlist();
        ll.addFirst(22);
        ll.addFirst(50);
        ll.addFirst(20);
        ll.display();
        
        ll.deleteFirst();
        System.out.println("After deleting first...");
        ll.display();
        
        ll.addLast(67);
        System.out.println("Adding last...");
        ll.display();
        
        ll.deleteLast();
        System.out.println("Deleting last...");
        ll.display();
        
        System.out.println("if 50 exists:" + ll.exist(50));
        System.out.println("if 20 exists:" + ll.exist(20));
        
        System.out.println("Delete 50:" + ll.delete(50));
        System.out.println("Delete 50:" + ll.delete(50));
        
        ll.display();

    }
}
