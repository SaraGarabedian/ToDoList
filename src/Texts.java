public class Texts {
    public static String WELCOME_TEXT = ">> Welcome to your To do list\n" +
            ">> You have %d tasks to do and %d tasks are done!\n" +
            ">> Select an option:\n" +
            ">> (1) Show Task List (by date or project)\n" +
            ">> (2) Add New Task\n" +
            ">> (3) Edit Task (update, mark as done, remove)\n" +
            ">> (4) Save and Quit\n" +
            ">> Enter your selection: ";

    public static String LIST_ITEMS = String.format("%5s| %14s| %13s| %14s| %8s|", "ID", "Title", "Due Date", "Project", "Status");

    public static String SORT_MENU = ">> (d) Show by Date (p) Show by Project (i) Show by ID (m) Main menu\n" +
            ">> ";


    public static String TITLE_REQUEST = "Add a title to your new task and press Enter:\n" +
            ">> ";
    public static String DUE_DATE_REQUEST = "Add a due date for your task and press Enter:\n" +
            ">> ";
    public static String PROJECT_REQUEST = "Add a your new task to a project and press Enter:\n" +
            ">> ";

    public static String UPDATE_MENU = ">> (u) Modify task (d) Mark as Done (r) Remove task (m) Main menu";

    public static String MODIFY_SELECT_TASK_REQUEST = "Select a task to modify and press Enter\n" +
            ">> ";
    public static String MODIFY_TITLE_REQUEST = "Modify the title of your task and press Enter\n" +
            ">> ";
    public static String MODIFY_DUE_DATE_REQUEST = "Modify the due date of your task and press Enter\n" +
            ">> ";
    public static String MODIFY_PROJECT_REQUEST = "Modify the project for your task and press Enter\n" +
            ">> ";

    public static String MARK_DONE_SELECT_TASK_REQUEST = "Select a task to mark as done and press Enter\n" +
            ">> ";
    public static String REMOVE_SELECT_TASK_REQUEST = "Select a task to remove and press Enter\n" +
            ">> ";

}
