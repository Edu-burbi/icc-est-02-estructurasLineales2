package Controllers;

import Materia.Models.NodeGeneric;
import Models.Contact;
import Models.LinkedList;

public class ContactManager {
    private LinkedList<Contact<String, String>> contacts;

    public ContactManager() {
        this.contacts = new LinkedList<>();
    }

    public void addContact(Contact<String, String> contact) {
        contacts.appendToTail(contact);
    }

    public Contact<String, String> findContactByName(String name) {
        NodeGeneric<Contact<String, String>> current = contacts.getHead();
        while (current != null) { // Recorre la lista
            if (current.getValue().getName().equalsIgnoreCase(name)) {
                return current.getValue(); // Devuelve el contacto si coincide
            }
            current = current.getNext(); // Avanza al siguiente nodo
        }
        return null; // Retorna null si no encuentra el contacto
    }

    // Método para eliminar un contacto por nombre

    public boolean deleteContactByName(String name) {
        NodeGeneric<Contact<String, String>> current = contacts.getHead();

        if (current == null) // Si la lista está vacía
            return false;

        // Caso 1: El contacto está en la cabeza

        if (current.getValue().getName().equalsIgnoreCase(name)) {
            contacts.setHead(current.getNext()); // Mueve la cabeza al siguiente nodo
            contacts.setSize(contacts.getSize() - 1);
            return true;
        }

        // Caso 2: Buscar en el resto de la lista

        while (current.getNext() != null) {
            if (current.getNext().getValue().getName().equalsIgnoreCase(name)) {
                current.setNext(current.getNext().getNext()); // Salta el nodo actual
                contacts.setSize(contacts.getSize() - 1);
                return true;
            }
            current = current.getNext(); // Avanza al siguiente nodo
        }

        return false;
    }

    // Método para imprimir la lista de contactos
    
    public void printList() {
        contacts.print();
    }
}