package Views;

import java.util.Scanner;

public class ConsoleView {
    private Scanner scanner;

    public ConsoleView() {
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("======= Menú Contacts =======");
        System.out.println("1. Add contact");
        System.out.println("2. Find contact");
        System.out.println("3. Delete contact");
        System.out.println("4. Print Contacts");
        System.out.println("5. Exit");
    }

    public String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}
