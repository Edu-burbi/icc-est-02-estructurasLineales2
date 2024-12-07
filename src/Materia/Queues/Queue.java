package Materia.Queues;
import Materia.Models.Node;
import java.util.NoSuchElementException;

public class Queue {
    
    private Node front; // Nodo al frente de la cola
    private Node rear;  // Nodo al final de la cola
    private int size;   // Tamaño de la cola

    // Constructor: Inicializar cola vacía

    public Queue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    // Método para encolar nodos

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.setNext(newNode);
            rear = newNode;
        }
        size++;
    }

    // Método para desencolar nodos

    public int dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("La cola está vacía");
        }
        int value = front.getValue();
        front = front.getNext();
        if (front == null) {
            rear = null;
        }
        size--;
        return value;
    }

    // Devuelve el valor del nodo al frente de la cola sin quitarlo

    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("La cola está vacía");
        }
        return front.getValue();
    }

    // Verifica si la cola está vacía

    public boolean isEmpty() {
        return front == null;
    }

    // Método para obtener el tamaño de la cola

    public int size() {
        return size;
    }

    // Método para imprimir todos los elementos de la cola
    
    public void printQueue() {
        Node current = front;
        System.out.print("Cola: ");
        while (current != null) {
            System.out.print(current.getValue() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
}
