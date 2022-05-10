package chapterNine;

import java.util.ArrayList;

public class Diary {

    private String name;
    private String entry;
    private String password;
    private String Date;
    private String Title;
    private String Body;
    private ArrayList<Entry> entries;

    public Diary(String name, String entry, String password) {
        this.name = name;
        this.entry = entry;
        this.password = password;
        entries = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getEntry() {
        return entry;
    }

    public String getPassword() {
        return password;
    }

    public void createEntry(String Date, String Title, String Body) {
        Entry entry = new Entry(Date, Title, Body);
        entries.add(entry);
    }

    public int getNumberOEntries() {
        return entries.size();
    }
}