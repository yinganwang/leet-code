class MyLinkedList {
    class ListNode {
        int val;
        ListNode next;
        ListNode (int val) {
            this.val = val;
            next = null;
        }
    }
    private ListNode head;
    private int size;

    /** Initialize your data structure here. */
    public MyLinkedList() {

    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if (index < 0 || index >= size) return -1;
        ListNode curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr.val;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        ListNode newHead = new ListNode(val);
        newHead.next = head;
        head = newHead;
        size++;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        ListNode tail = new ListNode(val);
        if (head == null) head = tail;
        else {
            ListNode curr = head;
            while (curr.next != null) curr = curr.next;
            curr.next = tail;
        }
        size++;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(index > size) return;
        ListNode curr = head;
        ListNode addedNode = new ListNode(val);
        if (index == 0) {
            addAtHead(val);
            return;
        } else if (index == size) {
            addAtTail(val);
            return;
        }
        for (int i = 0; i < index - 1; i++) {
            curr = curr.next;
        }
        addedNode.next = curr.next;
        curr.next = addedNode;
        size++;
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size) return;
        if (index == 0) {
            head = head.next;
            return;
        }
        ListNode curr = head;
        for (int i = 0; i < index - 1; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
