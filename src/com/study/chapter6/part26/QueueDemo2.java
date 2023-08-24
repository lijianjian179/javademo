package com.study.chapter6.part26;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Deque
 */
public class QueueDemo2 {

    public static void main(String[] args) {
        Deque deque = new ArrayDeque();
        deque.offer("Mary");
        deque.offer("Lily");
        deque.offer("Tony");
        System.out.println(deque);

        deque.offerFirst("John");
        System.out.println(deque);

        deque.offerLast("Lucy");
        System.out.println(deque);

        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
        System.out.println(deque);

        while (deque.size() > 0) {
            System.out.println(deque.pollLast());
        }
        System.out.println(deque);

        // 栈
        Deque stack = new ArrayDeque();
        stack.push("刘备");
        stack.push("张飞");
        stack.push("关羽");
        System.out.println(stack);
        while (stack.size() > 0) {
            System.out.println(stack.pop());
        }
        System.out.println(stack);
    }
}
