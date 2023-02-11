//thea tenebro
//epoy

public class MainDriver {
    public static void main(String[] args)
    {
        Linkedlist ll = new Linkedlist();
        System.out.println("add first...");
        ll.addFirst(22);
        ll.addFirst(50);
        ll.addFirst(20);
        ll.display();
        
        System.out.println("add last...");
        ll.deleteFirst();
        ll.addLast(20);
        ll.display();

        System.out.println("delete first...");
        ll.deleteFirst();
        ll.display();

        System.out.println("delete last...");
        ll.addFirst(50);
        ll.deleteLast();
        ll.display();
        
        System.out.println("if 50 exists:" + ll.exist(50));
        System.out.println("if 20 exists:" + ll.exist(20));
        
        System.out.println("Delete 50:" + ll.delete(50));
        System.out.println("Delete 50:" + ll.delete(50));
        
        ll.display();

    }
}
