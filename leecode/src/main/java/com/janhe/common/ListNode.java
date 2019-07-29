package com.janhe.common;

/**
 * @CLASSNAME ListNode
 * @Description
 * @Auther Jan  橙寂
 * @DATE 2019/6/16 0016 22:18
 */

public class ListNode {

    public int val;

    public ListNode next;

    public ListNode pre;

    public ListNode(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode getPre() {
        return pre;
    }

    public void setPre(ListNode pre) {
        this.pre = pre;
    }
}
