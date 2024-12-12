package Models;

import Materia.Models.NodeGeneric;

public class LinkedList<T> {
    private NodeGeneric<T> head; // Usar NodeGeneric aquí
    private int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    // *****************************

    public void appendToTail(T value) {
        NodeGeneric<T> newNode = new NodeGeneric<>(value);
        if (head == null) {
            head = newNode;
        } else {
            NodeGeneric<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size++;
    }

    /*
    Metodo ya no necesario ya que  se implementa en CONTACT MANAGER pero
    se necesita programar los metodos genericos cuando se utilicen enteros
    */

    public T findByValue(T value) {    
            return value;
      
    }

    /*
    Metodo ya no necesario ya que  se implementa en CONTACT MANAGER pero
    se necesita programar los metodos genericos cuando se utilicen enteros
    */

    public void deleteByValue(T value) {
    
    }

    // *****************************

    public void print() {
        NodeGeneric<T> current = head;  
        while (current != null) { 
            System.out.println(current.getValue()); 
            current = current.getNext(); 
        }
    }

    // Getters and Setters

    public int getSize() {
        return size;
    }

    public NodeGeneric<T> getHead() {
        return head;
    }

    public void setHead(NodeGeneric<T> head) {
        this.head = head;
    }

    public void setSize(int size) {
        this.size = size;
    }

    
}

