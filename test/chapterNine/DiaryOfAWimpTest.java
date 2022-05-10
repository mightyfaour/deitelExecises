package chapterNine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiaryOfAWimpTest {
    @Test
    public void dateTest() {
        Entry diary = new Entry("7/05/2022", "Title:", "Body");
        assertEquals("7/05/2022", diary.getDate());
    }
    @Test
    public void titleTest() {
        Entry diary = new Entry("7/05/2022", "Title", "body");
        assertEquals("Title", diary.getTitle());
    }

    @Test
    public void bodyTest() {
        Entry diary = new Entry("7/05/2022", "Title", "body");
        assertEquals("body", diary.getBody());
    }

}
