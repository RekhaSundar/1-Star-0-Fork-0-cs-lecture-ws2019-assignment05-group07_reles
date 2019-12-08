package de.ovgu.icse.assignment05;

import org.w3c.dom.Node;

import java.util.LinkedList;

/**
 * Main class of the Java program. 
 * 
 */

public class Main {

    public static void main(String[] args) {
        //test your implementation here
        LinkedTree anotherNode= new LinkedTree();
        anotherNode.insert(16,"R,D,T");
        anotherNode.insert(8,"A,C,E");
        anotherNode.insert(23,"M,I,L");
        anotherNode.insert(4,"D,R,M");
        anotherNode.insert(15,"H,O,P");
        anotherNode.insert(42,"A,H,E");

        anotherNode.inorder(0);
        // prints D A H R M A
        anotherNode.postorder(1);
        // prints H I O R C D
        anotherNode.preorder(2);
        // prints T E M P L E

    }
}

