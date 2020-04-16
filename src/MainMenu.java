import java.util.ArrayList;
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
            case 2:
                Scanner scanAddTask = new Scanner(System.in);
                System.out.println(Texts.TITLE_REQUEST);
                String title = scanAddTask.nextLine();
                System.out.println(Texts.DUE_DATE_REQUEST);
                String dueDate = scanAddTask.nextLine();
                System.out.println(Texts.PROJECT_REQUEST);
                String project = scanAddTask.nextLine();
                listItems.add(new Task(title, dueDate, project));
                TaskUtil.printList(listItems);
                welcomeMenuActions(listItems);
            case 3:
                System.out.println("Here is your To do list: \n" + Texts.LIST_ITEMS);
                TaskUtil.printList(listItems);
                System.out.println(Texts.UPDATE_MENU);
                Scanner scannerUpdateSelection = new Scanner(System.in);
                String selection = scannerUpdateSelection.nextLine();
                switch (selection) {
                    case "u":
                        System.out.println(Texts.MODIFY_SELECT_TASK_REQUEST);
                        Scanner scanSelectTask = new Scanner(System.in);
                        int taskNumber = scanSelectTask.nextInt();
                        Task selectedTaskToUpdate = listItems.get(taskNumber-1);
                }
        }
    }

    private static void selectSortingOption(List<Task> listItems) {
        System.out.println(Texts.SORT_MENU);
        Scanner scannerSortSelection = new Scanner(System.in);
        String selection = scannerSortSelection.nextLine();
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
