public class Bug {
    private int id;
    private String title;
    private String status;

    public Bug(int id, String title) {
        this.id = id;
        this.title = title;
        this.status = "OPEN";
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getStatus() {
        return status;
    }

    public void close() {
        this.status = "CLOSED";
    }
}
