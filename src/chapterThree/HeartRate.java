package chapterThree;

import java.util.Date;
public class HeartRate {
    Date currentYear = new Date();

    private String firstName;
    private String lastName;
    private String fullName;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private String dateOfBirth;
    private int age;
    private int maximumHeartRate;

    public HeartRate(String firstName, String lastName, int day, int month, int year) {
    }

    public String setFirstName(String firstName) {
        this.firstName = firstName;
            return firstName;
        }

    public String setLastName(String lastName) {
        this.lastName = lastName;
            return lastName;
    }

    public Object getFullName() {
        fullName = setFirstName(firstName) + " " + setLastName(lastName);
        return fullName;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
       this.yearOfBirth = yearOfBirth;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

//    public  int getAge() {
//        int thisYear = currentYear.getYear();
//        age = thisYear + 1900 - yearOfBirth;
//        return age;
//    }
    public void setAge(int year){
        int thisYear = currentYear.getYear();
        age = thisYear + 1900 - yearOfBirth;

    }

    public int getAges() {
        return age;
   }

    public void setMaximumHeartRate(int maximumHeartRate) {
        this.maximumHeartRate = maximumHeartRate;
    }

    public int getMaximumHeartRate() {
        return maximumHeartRate;
    }


//    public String getDateOFBirth() {
//        dateOfBirth = setDayOfBirth(dayOfBirth) + " / " + setMonthOfBirth(monthOfBirth) + " / " + setYearOfBirth(yearOfBirth);
//
//        return dateOfBirth;
    //}
}
