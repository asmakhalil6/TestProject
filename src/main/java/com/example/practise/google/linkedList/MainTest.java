package com.example.practise.google.linkedList;

import java.util.Arrays;
import java.util.List;

public class MainTest {

    public static void main(String[] args) {
        StringBuilder str
                = new StringBuilder("GeeksForGeeks");

        // print string
        System.out.println("String contains = " + str);

        // get index of string For
        int index = str.lastIndexOf("Geeks");

        // print results
        System.out.println("Index of last occurrence"
                + " string \"Geeks\"= "
                + index);


        LinkedList linkedList = new LinkedList();
        List<Integer> request = Arrays.asList(1, 3, 2);

        request.stream().forEach(integer -> linkedList.add(integer));
        linkedList.print(linkedList);
        linkedList.sort(linkedList);
        linkedList.print(linkedList);

    }


    public static class LinkedList {

        Node head;
        Node tail;

        static class Node {

            int data;
            Node next;

            Node(int d) {
                next = null;
                data = d;
            }
        }


        void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                tail.next = newNode;
            }
            tail = newNode;
        }


        void sort(LinkedList linkedList) {
            head = linkedList.head;
            Node current = head;
            int temp;
            while (head != null) {
                while (head.next != null) {
                    if (head.data > head.next.data) {
                        temp = head.data;
                        head.data = head.next.data;
                        head.next.data = temp;
                        head.next = head.next.next;
                    }
                }

            }

        }


        void print(LinkedList linkedList) {
            while (linkedList.head != null) {
                System.out.println(linkedList.head.data);
                linkedList.head = linkedList.head.next;
            }
        }


    }


}
