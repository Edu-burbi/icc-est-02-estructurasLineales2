//import Controllers.MenuController;
//import Materia.Queues.Queue;
//import Materia.Queues.QueueGeneric;
//import Materia.Queues.Stacks.Stack;
//import Materia.Queues.Stacks.StackGeneric;
//import Models.Pantalla;

import Materia.Ejercicio_01_sign.SignValidator;
import Materia.Ejercicio_02_sorting.StackSorter;

import java.util.Scanner;
import java.util.Stack; 

public class App {
    public static void main(String[] args) {

        System.out.println("\n");
        System.out.println("********************************Estructuras Lineales********************************");  // Titulo del programa
        //runStack();
        //runStackGeneric();
        //();
        //MenuController menuController = new MenuController();
        //menuController.showMenu();


        Scanner scanner = new Scanner(System.in);
        System.out.println("---- Ejercicio 1: Validación de Signos ----");
        SignValidator signValidator = new SignValidator();

        System.out.print("Ingresa una cadena con signos (Ejemplo: ([]){}) para validar: ");        // Pedir al usuario que ingrese una cadena para validar
        String input = scanner.nextLine(); 

        // Validar la cadena ingresada
        boolean resultado = signValidator.validarSignos(input);
        System.out.println("Resultado: " + resultado);  // Imprimir si la cadena está es valida o no 

        System.out.println("\n---- Ejercicio 2: Ordenar una Pila ----");
        Stack<Integer> stack = new Stack<>();

        System.out.print("Ingresa el número de elementos para la pila: ");        // Pedir al usuario que ingrese los números para la pila
        int n = scanner.nextInt();  
        System.out.println("Ingresa los " + n + " números:");

        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            stack.push(scanner.nextInt());  
        }

        // Mostrar la pila original
        System.out.println("\nPila original:");
        for (int num : stack) {
            System.out.println(num);
        }

        // Ordenar la pila usando StackSorter
        StackSorter stackSorter = new StackSorter();
        stackSorter.ordenarStack(stack);

        // Mostrar la pila ordenada
        System.out.println("\nPila ordenada ascendentemente:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        scanner.close();  
    }
}


    /*public static void runStack() {
        
        // Instanciar la clase

        Stack stack = new Stack();

        // Agregar elementos

        stack.push(5);
        stack.push(7);
        stack.push(10);
        stack.push(20);

        // Cantidad de pila

        System.out.println("\nCantidad = " + stack.getSize());
        System.out.println("\n");


        // Operaciones con la pila
        System.out.println("El tamaño de la pila es -> " + stack.getSize());  // *****************""METODO QUE ME FALTO AGREGAR EN LA CLASE PASADA""*****************
        System.out.println("Cima    -> " + stack.peek() + "---- Nodo en la Cima");
        System.out.println("Retirar -> " + stack.pop()  + "---- Se retira de la Cima");
        System.out.println("El tamaño de la pila es -> " + stack.getSize());  // *****************""METODO QUE ME FALTO AGREGAR EN LA CLASE PASADA""*****************
        System.out.println("Cima    -> " + stack.peek() + "---- Nodo en la Cima");
        System.out.println("Retirar -> " + stack.pop()  + "---- Se retira de la Cima");
        System.out.println("El tamaño de la pila es -> " + stack.getSize());  // *****************""METODO QUE ME FALTO AGREGAR EN LA CLASE PASADA""*****************
        System.out.println("Cima    -> " + stack.peek() + "---- Nodo en la Cima");
        System.out.println("Retirar -> " + stack.pop()  + "---- Se retira de la Cima");
        System.out.println("El tamaño de la pila es -> " + stack.getSize());  // *****************""METODO QUE ME FALTO AGREGAR EN LA CLASE PASADA""*****************
        System.out.println("Cima    -> " + stack.peek() + "---- Nodo en la Cima");
        System.out.println("El tamaño de la pila es -> " + stack.getSize());  // *****************""METODO QUE ME FALTO AGREGAR EN LA CLASE PASADA""*****************
        System.out.println("\n");

    }

    public static void runStackGeneric() {
        
        StackGeneric<Pantalla> router = new StackGeneric<>();

        router.push(new Pantalla(1, "Home Page", "/Home"));
        router.push(new Pantalla(2, "Menu Page", "/Home/menu"));
        router.push(new Pantalla(3, "Users Page", "/Home/menu/users"));

        System.out.println("Estoy en " + router.peek().getRuta());
        router.pop();
        System.out.println("Regreso a: " + router.peek().getRuta());
        System.out.println("Estoy en: " + router.peek().getRuta());

        router.push(new Pantalla(4, "Settings Page", "/Home/menu/settings"));
        System.out.println("Cantidad de pantallas: " + router.size());
        System.out.println("Estoy en: " + router.peek().getRuta());
        router.printStack();
        System.out.println("\n");

    }

    public static void runQueue(){
            Queue cola = new Queue();

            cola.enqueue(10);
            cola.enqueue(20);
            cola.enqueue(30);

            System.out.println(cola.peek());
            System.out.println(cola.dequeue());
            System.out.println(cola.dequeue());
            System.out.println(cola.peek());
            System.out.println("\n");


    }

    public static void runQueueGeneric() {

    QueueGeneric<Pantalla> routerQueue = new QueueGeneric<>();

    // Agregar elementos a la cola

    routerQueue.enqueue(new Pantalla(1, "Home Page", "/Home"));
    routerQueue.enqueue(new Pantalla(2, "Menu Page", "/Home/menu"));
    routerQueue.enqueue(new Pantalla(3, "Users Page", "/Home/menu/users"));
    System.out.println("\n");


    // Imprimir la cola

    System.out.println("Estado inicial de la cola:");
    routerQueue.printQueue();
    System.out.println("\n");


    // Operaciones con la cola

    System.out.println("\nElemento al frente: " + routerQueue.peek().getRuta());
    System.out.println("Desencolar: " + routerQueue.dequeue().getRuta());
    System.out.println("Elemento al frente tras desencolar: " + routerQueue.peek().getRuta());
    System.out.println("\n");


    // Agregar un nuevo elemento

    routerQueue.enqueue(new Pantalla(4, "Settings Page", "/Home/menu/settings"));
    System.out.println("\n");


    // Imprimir la cola final

    System.out.println("\nEstado final de la cola:");
    routerQueue.printQueue();
    System.out.println("\nTamaño de la cola: " + routerQueue.size());
    System.out.println("\n");

    
    }
}
*/

