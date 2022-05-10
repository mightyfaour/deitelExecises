package chapterNine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DiaryOfAwimps2Test {
    @Test
    public void diaryCanBeCreated() {
        Diary myDiary = new Diary("Philip", " ", "1234asd");
        assertNotNull(myDiary);

    }

    @Test
    public void nameTest() {
        Diary myDiary = new Diary("Philip", "entry", "password");
        assertEquals("Philip", myDiary.getName());
    }
    @Test
    public void entryTest() {
        Diary myDiary = new Diary("Philip", " ", "password");
        assertEquals(" ", myDiary.getEntry());
    }

    @Test
    public void  passwordTest() {
        Diary myDiary = new Diary("Philip", " ", "1234asd");
        assertEquals("1234asd", myDiary.getPassword());
    }
    @Test
    public void entryCanBeCreated() {
        Diary myDiary = new Diary("Philip", " ", "1234asd");
        myDiary.createEntry("7/08/2022", "Front-end Development", "Making love with Java.");
        assertEquals(1, myDiary.getNumberOEntries() );
    }

    @Test
    public void  multipleEntriesCanBeCreated() {
        Diary myDiary = new Diary("Philip", " ", "1234asd");
        myDiary.createEntry("7/08/2022", "Front-end Development", "Making love with Java.");
        myDiary.createEntry("8/08/2022", "Front-end Development", "forking my java code.");
        myDiary.createEntry("9/08/2022", "Front-end Development", "Seduction of Python.");
        assertEquals(3, myDiary.getNumberOEntries());

    }
    @Test
    public void searchByDate() {
        
    }


}
