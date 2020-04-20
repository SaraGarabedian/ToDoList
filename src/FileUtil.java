import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class FileUtil {
    public static final String fileName = "src\\TaskList.txt";

    public static void writeToFile (List<Task> taskList) throws IOException {
        File file = new File(fileName);
        System.out.println(file.getAbsolutePath());
        FileWriter write = new FileWriter(file, false);
        PrintWriter printLine = new PrintWriter(write);
        for (Task task : taskList) {
            printLine.println(task.toString());
        }
        printLine.close();
        write.close();
    }
}
