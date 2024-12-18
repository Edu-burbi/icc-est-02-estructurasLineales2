package Materia.Ejercicio_01_sign;

import java.util.Stack; 

public class SignValidator {
    public boolean validarSignos(String input) {
        Stack<Character> stack = new Stack<>(); // Pila para verificar los signos

        for (char c : input.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c); 
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop(); 
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop(); 
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop(); 
            } else if (c == ')' || c == '}' || c == ']') {
                return false; // Si no hay coincidencia, es falso
            }
        }

        return stack.isEmpty(); // Devuelve true si la pila está vacía
    }
}
