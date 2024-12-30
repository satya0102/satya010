public class linkedlist {
    public static class Node{
        int data;
        Node next;

        public Node (int data){
            this.data =data;
            this.next = null;
        }

    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }
    public void addlast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return ;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void print(){
        if(head == null){
            System.out.println("linkedlist is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ->");
            temp =temp.next;

        }
        System.out.println("null");
    }
    public void add(int indx,int data){
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while(i < indx -1){
            temp = temp.next;
            i++;

        }
        newNode = temp.next;
        temp.next = newNode;
    }
    public int removeFirst(){
        int size =0 ;
        if(size == 0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size =0;
            return val; 
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    
    public static void main(String [] args){
        linkedlist ll = new linkedlist();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addlast(3);
        ll.print();
        ll.addlast(4);
        ll.print();
        ll.removeFirst();
        ll.print();
        
    }

}
