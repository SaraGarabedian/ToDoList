import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Task> listItems = new ArrayList<>();

        try {
            FileUtil.loadFromFile(listItems);
            MainMenu.welcomeMenuActions(listItems);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
