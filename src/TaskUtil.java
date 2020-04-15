import java.util.List;

public class TaskUtil {

    public static void printList(List<Task> listItems){
        for (Task task : listItems) {
            int i = listItems.indexOf(task);
            System.out.println(String.format("%5d", i+1) + "| " + task);
        }
    }
}
