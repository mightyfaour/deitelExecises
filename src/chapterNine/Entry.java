package chapterNine;

public class Entry {

    private String date;
    private String title;
    private String body;

    public Entry(String date, String title, String body) {
        this.date = date;
        this.title = title;
        this.body = body;

    }

    public String getDate() {
        return date;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }
}
