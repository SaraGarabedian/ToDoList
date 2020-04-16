import java.util.List;
import java.util.Scanner;

public class MainMenu {
    public static void welcomeMenuActions(List<Task> listItems) {
        System.out.println(Texts.WELCOME_TEXT);
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Here is your To do list: \n" + Texts.LIST_ITEMS);
                TaskUtil.printList(listItems);
                selectSortingOption(listItems);
        }
    }

    private static void selectSortingOption(List<Task> listItems) {
        System.out.println(Texts.SORT_MENU);
        Scanner scanner2 = new Scanner(System.in);
        String selection = scanner2.nextLine();
        switch (selection) {
            case "d":
                //sort list by date;
                TaskUtil.printList(listItems);
                welcomeMenuActions(listItems);
                break;
            case "p":
                //sort list by project
                TaskUtil.printList(listItems);
                break;
            case "i":
                //sort list by ID
                System.out.println(listItems);
                break;
            case "m":
                welcomeMenuActions(listItems);
                break;
            default:
                System.out.println(">> Please enter a valid choice: ");
                selectSortingOption(listItems);
                break;
        }
    }
}
