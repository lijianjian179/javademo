package com.study.chapter6.part26;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Queue
 */
public class QueueDemo1 {

    public static void main(String[] args) {
        Queue queue = new ArrayDeque();
        queue.offer("Mary");
        queue.offer("Lily");
        queue.offer("John");
        queue.offer("Tony");
        System.out.println(queue);

        // 返回头部（不删），队列为空时返回null
        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println(queue);

        // 返回头部（删除）
        while (queue.size() > 0) {
            System.out.println(queue.poll());
        }
        System.out.println(queue);
    }
}
