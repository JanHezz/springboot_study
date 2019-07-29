package com.janhe.code;

import com.janhe.common.ListNode;

/**
 * @CLASSNAME Test1
 * @Description
 * @Auther Jan  橙寂
 * @DATE 2019/6/16 0016 21:55
 */

public class Test1 {

    /**
     * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
     * <p>
     * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
     * <p>
     * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
     * <p>
     * 示例：
     * <p>
     * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
     * 输出：7 -> 0 -> 8
     * 原因：342 + 465 = 807
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/add-two-numbers
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param args
     */
    public static void main(String[] args) {


    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(0);
        ListNode curry=node;
        ListNode q = l1;
        ListNode p = l2;
        int carry = 0;
        while (q != null && p != null) {
            int x = q != null ? q.val : 0;
            int y = p != null ? p.val : 0;
            int sum = x + y + carry;

           /*  carry=0;
            if (sum > 9) {
                carry = 1;
                sum = sum / 10;
            }*/

             carry=sum/10;
            curry.next = new ListNode(sum%10);
            curry=curry.next;
            if (p != null) {
                p = p.next;
            }
            if (q != null) {
                q = q.next;
            }
        }
        if (carry > 0) {
            curry.next = new ListNode(carry);
        }

        return node.next;
    }

}
