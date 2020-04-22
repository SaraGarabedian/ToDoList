public class Task {
    private String title;
    private String date;
    private String project;
    private String status = "To do";

    public Task(String title, String date, String project) {
        this.title = title;
        this.date = date;
        this.project = project;
    }

    public Task(String title, String date, String project, String status) {
        this.title = title;
        this.date = date;
        this.project = project;
        this.status = status;
    }

    @Override
    public String toString() {
        return String.format("%14s| %13s| %14s| %8s|", title, date, project, status);
    }
}
