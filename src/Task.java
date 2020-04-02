public class Task {
    private String title;
    private String date;
    private String project;
    private String status = "To do.";

    public Task(String title, String date, String project){
        this.title = title;
        this.date = date;
        this.project = project;
    }

    @Override
    public String toString() {
        return title + ", " + date +
                ", " + project +
                ", " + status ;
    }
}
