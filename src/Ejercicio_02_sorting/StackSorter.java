package Ejercicio_02_sorting;

import java.util.Stack; 

public class StackSorter {
    public void ordenarStack(Stack<Integer> stack) {
        Stack<Integer> auxStack = new Stack<>();

        while (!stack.isEmpty()) {
            int temp = stack.pop(); // Extrae el elemento del tope de la pila original

            // Mueve los elementos mayores de auxStack de vuelta a stack
            while (!auxStack.isEmpty() && auxStack.peek() > temp) {
                stack.push(auxStack.pop());
            }

            // Inserta el elemento actual en la pila auxiliar
            auxStack.push(temp);
        }

        // Copia los elementos ordenados de auxStack de vuelta a la pila original
        while (!auxStack.isEmpty()) {
            stack.push(auxStack.pop());
        }
    }
}
