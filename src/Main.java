import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Task> listItems = new ArrayList<>();

        Task task1 = new Task("Buy Apples", "2020-05-10", "Groceries");
        Task task2 = new Task("Buy milk", "2020-04-10", "Groceries");
        Task task3 = new Task("Call mom", "2020-04-02", "Tasks");
        Task task4 = new Task("Record movie", "2020-04-02", "Entertainment");

        listItems.add(task1);
        listItems.add(task2);
        listItems.add(task3);
        listItems.add(task4);

        System.out.println(MainMenu.WELCOME_TEXT);

        System.out.println("Here is your To do list: \n" + MainMenu.LIST_ITEMS);

        TaskUtil.printList(listItems);

    }
}
