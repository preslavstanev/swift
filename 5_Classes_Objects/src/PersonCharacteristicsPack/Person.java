package PersonCharacteristicsPack;

public class Person {

    private String firstName;
    private String lastName;
    private String gender;
    private int birth;
    private double weight;
    private int height;
    private String profession;
    private double assisment1;
    private double assisment2;
    private double assisment3;
    private double assisment4;

    public Person(String firstName, String lastName, String gender, int birth, double weight, int height, String profession, double assisment1, double assisment2, double assisment3, double assisment4) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birth = birth;
        this.height = height;
        this.profession = profession;
        this.assisment1 = assisment1;
        this.assisment2 = assisment2;
        this.assisment3 = assisment3;
        this.assisment4 = assisment4;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLasName() {
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

    public int getBirth() {
        return birth;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public double getAssisment1() {
        return assisment1;
    }

    public void setAssisment1(double assisment1) {
        this.assisment1 = assisment1;
    }

    public double getAssisment2() {
        return assisment2;
    }

    public void setAssisment2(double assisment2) {
        this.assisment2 = assisment2;
    }

    public double getAssisment3() {
        return assisment3;
    }

    public void setAssisment3(double assisment3) {
        this.assisment3 = assisment3;
    }

    public double getAssisment4() {
        return assisment4;
    }

    public void setAssisment4(double assisment4) {
        this.assisment4 = assisment4;
    }
}
