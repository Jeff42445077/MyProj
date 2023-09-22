public class Main {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
        public static int size(ListNode p ){

            if (p.next == null){
                return 1;
            }
            return 1+size(p.next);
        }

    }

        public Main.ListNode resList = new Main.ListNode(0,null);
        public Main.ListNode head = resList;
        public int carry = 0;


        class Solution {
            public Main.ListNode addTwoNumbers(Main.ListNode l1, Main.ListNode l2) {
                int sum = l1.val + l2.val + carry;
                carry  = sum / 10;
                resList.next = new Main.ListNode(sum % 10,null);
                resList = resList.next;

                if(l1.next != null && l2.next != null)
                    addTwoNumbers(l1.next, l2.next);
                else if (l1.next != null)
                    addTwoNumbers(l1.next, new Main.ListNode(0,null));
                else if (l2.next != null)
                    addTwoNumbers(new Main.ListNode(0,null), l2.next);
                else if (carry > 0)
                {
                    resList.next = new Main.ListNode(1,null);
                    resList = resList.next;
                }
                return head.next;

            }
        }
}