public class singlylinkedlist {
    
    private ListNode head;
    
    private class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        } 
    }
    
    public void insertAtBeginning(int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    } 
    
    public void printLinkedList() {
        if (head == null) {
            System.out.println("null");
            return; // Return after printing "null"
        }

        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ---> ");
            current = current.next;
        }
        System.out.print("null");
    }
    
    public ListNode getMiddleNode() {
        if (head == null) {
            return null;
        }
        ListNode slowPtr = head;
        ListNode fastPtr = head;

        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }

    public void removeDuplicates(){
        if(head == null){
            return;

        }
        ListNode current  = head;
        while(current != null && current.next != null){
            if(current.data == current.next.data){
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

    }
    
    public static void main(String[] args) {
        singlylinkedlist sll = new singlylinkedlist();
        sll.insertAtBeginning(3);
        sll.insertAtBeginning(3);
        sll.insertAtBeginning(2);
        sll.insertAtBeginning(1);
        sll.insertAtBeginning(1);

        sll.printLinkedList();
        sll.removeDuplicates();
        sll.printLinkedList();
    }
}