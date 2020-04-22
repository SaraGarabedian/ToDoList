import java.io.*;
import java.util.List;
import java.util.Scanner;

public class FileUtil {
    public static final String fileName = "src\\TaskList.txt";

    public static void writeToFile (List<Task> taskList) throws IOException {
        File file = new File(fileName);
        //System.out.println(file.getAbsolutePath());
        FileWriter write = new FileWriter(file, false);
        PrintWriter printLine = new PrintWriter(write);
        for (Task task : taskList) {
            printLine.println(task.toString());
        }
        printLine.close();
        write.close();
    }

    public static void loadFromFile(List<Task> taskList) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner fileReader = new Scanner(file);
        while (fileReader.hasNextLine()){
            String currentLine = fileReader.nextLine();

            String[] splitLine = currentLine.split("\\|");
            String title = splitLine[0].trim();
            String dueDate = splitLine[1].trim();
            String project = splitLine[2].trim();
            String status = splitLine[3].trim();

            Task task = new Task(title, dueDate, project, status);
            taskList.add(task);
        }
    }
}
