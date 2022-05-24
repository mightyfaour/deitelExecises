package chapterThree;

public class HealthProfile {


    private String firstName;
    private String lastName;
    private String gender;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private int height;
    private  int weight;
    private  String personalInformation;
    private int maximumHeartRate;
    private double targettedHeartRate;
    private double Bmi;


    public HealthProfile(String firstName, String lastName, String gender, int dayOfBirth, int monthOfBirth, int yearOfBirth, int height, int weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;

        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getAge(){
        int age = 2022 - getYearOfBirth();
        return age;
    }

    public String birthDetails() {
        String dob="";
        dob = getDayOfBirth()+"/"+getMonthOfBirth()+"/"+getYearOfBirth();
        return dob;
    }

//    public int setMaximumHeartRate(int i) {
//        return maximumHeartRate;
//    }

    public int getMaximumHeartRate() {
        maximumHeartRate = 220 - getAge();
        return maximumHeartRate;

    }

    public double getTergettedHeartRate() {
        targettedHeartRate = (getMaximumHeartRate() * 100) / 220;
        return targettedHeartRate;
    }

    public double getBmi() {
        Bmi = (weight * 703) / (height * height);
        return Bmi;
    }

//    public void setTargetedHeartRate() {
//
//    }
}
