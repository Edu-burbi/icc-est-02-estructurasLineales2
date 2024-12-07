package Materia.Queues.Stacks;
import Materia.Models.Node;
import java.util.EmptyStackException;

public class Stack {

    private Node top; // Nodo en la cima de la pila
    private int size; // Tamaño de la pila

    // Constructor: Inicializamos la pila vacía

    public Stack() {
        this.top = null;
        this.size = 0;
    }

    // Método para agregar un elemento a la pila

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.setNext(top);
        top = newNode;
        size ++;

    }

    // Método para retirar el elemento de la cima

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int value = top.getValue();
        top = top.getNext(); // Avanzamos al siguiente nodo
        size--;
        return value;
    }

    // Método para ver el elemento de la cima sin retirarlo

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.getValue();
    }

    // Método para verificar si la pila está vacía

    public boolean isEmpty() {
        return top == null;
    }

    public void printStack(){
        Node aux = top;
        while (aux != null) {
            System.out.print(aux.getValue());
            aux = aux.getNext();
        }
    }

    // Metodo que retorna el tamaño de la pila
    // Complejidad O(1)

    public int getSize() {
        return size;
    }
}
