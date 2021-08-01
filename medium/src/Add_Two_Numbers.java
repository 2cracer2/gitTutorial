/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class ListNode {
    int val;
    ListNode next;

    ListNode() {

    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

}

public class Add_Two_Numbers {
    public static ListNode addTwoNumbers(ListNode la, ListNode lb) {
        int temp = 0;
        ListNode lc = new ListNode(0);
        ListNode tail = lc;
        while (la!=null||lb!=null||temp!=0){
            int a = la!=null?la.val:0;
            int b = la!=null?lb.val:0;
            int sumVal = a + b + temp;
            temp = sumVal/10;
            tail.next = new ListNode(sumVal%10);
            tail = tail.next;
            if(la!=null)
                la = la.next;
            if(lb!=null)
                lb = lb.next;
        }
        return lc.next;

    }


    public static void main(String[] args) {
        ListNode la = new ListNode(3);
        la.next = new ListNode(4);
        la.next.next = new ListNode(5);
        ListNode lb = new ListNode(6);
        lb.next = new ListNode(7);
        lb.next.next = new ListNode(8);
        ListNode lc = addTwoNumbers(la, lb);
        while (la != null) {
            System.out.print(la.val);
            la = la.next;
        }
        System.out.println("******");
        while (lb != null) {
            System.out.print(lb.val);
            lb = lb.next;
        }
        System.out.println("******");
        while (lc != null) {
            System.out.print(lc.val);
            lc = lc.next;
        }
    }
}
