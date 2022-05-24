package chapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HealthProfileTest {

   @Test
    public void canGetAgeTest(){
      HealthProfile personalInformation = new HealthProfile("Phil", "Neo", "Male", 14,8 ,2007  ,17 ,68);

       assertEquals(15, personalInformation.getAge());
   }

   @Test
   public  void  testToGetDOB() {
      HealthProfile personalInformation = new HealthProfile("Phil", "Neo", "Male", 14,8 ,2007 ,17 ,68);
      String dob = personalInformation.birthDetails();
      assertEquals("14/8/2007", dob );
   }
   @Test
    public void canGetMaximumHeartRateTest() {
       HealthProfile personalInformation = new HealthProfile("Phil", "Neo", "Male", 14,8 ,2007 ,17 ,68);

       //personalInformation.setMaximumHeartRate(214);
       //System.out.println(personalInformation.getMaximumHeartRate());
       assertEquals(205,personalInformation.getMaximumHeartRate());
   }

   @Test
       public void canGetTergetedHeartRateTest() {
       HealthProfile personalInformation = new HealthProfile("Phil", "Neo", "Male", 14, 8, 2007, 17, 68);
//       personalInformation.getYearOfBirth();
      // personalInformation.setTargetedHeartRate();
      // personalInformation.getMaximumHeartRate();
       assertEquals(93.0, personalInformation.getTergettedHeartRate());
   }
   @Test
    public void canCalculateBMITest() {
        HealthProfile personalInformation = new HealthProfile("Phil", "Neo", "Male", 14, 8, 2007, 17, 68);
       // int Bmi = personalInformation.setBmi();
        assertEquals(165.0, personalInformation.getBmi());
    }
}