package chapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class HeartRateTest {
    private HeartRate personalInformation;
    @BeforeEach
    public void startWith() {
        personalInformation = new HeartRate("philip", "NEO", 15, 8, 2006);
    }

    @Test
    public void canCreateFullNameTest (){

        assertNotNull(personalInformation);
    }

    @Test
    public void firstNameTest(){

        assertNotNull(personalInformation);

        personalInformation.setFirstName("philip");
        personalInformation.setLastName("NEO");
        assertEquals("philip NEO", personalInformation.getFullName());

    }

    @Test
    public void canGetDayMonthYearOfBirthTest(){

        personalInformation.setFirstName("philip");
        personalInformation.setLastName("NEO");
        assertEquals("philip NEO", personalInformation.getFullName());

        personalInformation.setDayOfBirth(15);
        personalInformation.setMonthOfBirth(8);
        personalInformation.setYearOfBirth(2006);
        assertEquals(15, personalInformation.getDayOfBirth());
        assertEquals(8, personalInformation.getMonthOfBirth());
        assertEquals(2006, personalInformation.getYearOfBirth());

//        assertEquals("15/8/2006", PersonalInformation.getDateOFBirth());

    }

    @Test
    public void  canGetAgeTest(){
        personalInformation.setFirstName("philip");
        personalInformation.setLastName("NEO");
        assertEquals("philip NEO", personalInformation.getFullName());

        personalInformation.setYearOfBirth(2008);
        personalInformation.setAge(2006);
        //int age = personalInformation.getAges();
        assertEquals(14, personalInformation.getAges());


    }

    @Test
    public  void canGetMaximumHeartRateTest(){
        personalInformation.setFirstName("philip");
        personalInformation.setLastName("NEO");
        assertEquals("philip NEO", personalInformation.getFullName());

        personalInformation.setAge(2006);
        personalInformation.setMaximumHeartRate(214);

        assertEquals(214,personalInformation.getMaximumHeartRate());


    }
}
