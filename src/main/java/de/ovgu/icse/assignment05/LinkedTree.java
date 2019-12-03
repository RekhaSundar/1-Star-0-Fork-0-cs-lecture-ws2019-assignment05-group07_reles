package de.ovgu.icse.assignment05;

import java.util.LinkedList;

public class LinkedTree<E> {
    Node<E> root;

    private class Node<E> {
        private int key; //the key field
        private LinkedList<E> data; //list of data associated with a key
        private Node<E> left; //reference to the left child
        private Node<E> right; //reference to the right child
    
        private Node(int key, E element, Node<E> leftChild, Node<E> rightChild) {
            this.key = key;
            this.data = new LinkedList<E>();
            this.left = leftChild;
            this.right = rightChild;

            this.data.add(element);
        }
    }
    
    public LinkedTree() {
        //your implementation goes here
    }
    
    public LinkedTree(int key, E element) {
        //your implementation goes here
    }
    
    public void insert(int key, E element) {
        //your implementation goes here
    }
    
    public LinkedList<E> search(int key) {
        //your implementation goes here
    }
    
    public LinkedList<E> preorder(int ind) {
        //your implementation goes here
    }

    public LinkedList<E> postorder (int ind) {
        //your implementation goes here
    }

    public LinkedList<E> inorder (int ind) {
        //your implementation goes here
    }
    
    public LinkedList<E> delete(int key) {
        //your implementation goes here
    }
}
