package com.datastructures;

import javax.naming.LinkLoopException;

public class LinkedList {

    int data;
    LinkedList node;
    LinkedList head = null;

        LinkedList next; // Reference to the next node

        public LinkedList(int data) {
            this.data = data;
            this.next = null; // Initialize next to null
        }

        // Add a new node with the given data to the end of the linked list
        public void append(int data) {
            LinkedList newNode = new LinkedList(data);


                LinkedList current = this;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }

        // Print the linked list starting from the current node
        public void print() {
            LinkedList current = this;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }





}