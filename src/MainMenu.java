import java.util.List;
import java.util.Scanner;

public class MainMenu {
    public static void welcomeMenuActions(List listItems){
        System.out.println(Texts.WELCOME_TEXT);
        Scanner scanner = new Scanner(System.in);
        int choice;
        choice = scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("Here is your To do list: \n" + Texts.LIST_ITEMS);
                TaskUtil.printList(listItems);
                scanner.nextInt();
        }
    }
}
