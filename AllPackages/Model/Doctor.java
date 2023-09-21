package AllPackages.Model;

import AllPackages.DataBase.DataBase;
import AllPackages.Enum.Gender;

public class Doctor {
    private long id;
    private String firstName;
    private String lastName;
    private Gender gender;
    private int experienceYear;
    private static long idd=0;

    public Doctor( String firstName, String lastName, Gender gender, int experienceYear) {
        this.id = idd++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.experienceYear = experienceYear;

    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getExperienceYear() {
        return experienceYear;
    }

    public void setExperienceYear(int experienceYear) {
        this.experienceYear = experienceYear;
    }

    public static long getIdd() {
        return idd;
    }

    public static void setIdd(int idd) {
        Doctor.idd = idd;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", experienceYear=" + experienceYear +
                '}';
    }
}
