public class Person {
    private String name;
    private String gender;
    private String nationality;
    private Date debutYear;

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setDebutYear(Date debutYear) {
        this.debutYear = debutYear;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getNationality() {
        return nationality;
    }

    public int getDebutYear() {
        return debutYear;
    }

    public Person(String name, String gender, String nationality, Date debutYear) {
        this.name = name;
        this.gender = gender;
        this.nationality = nationality;
        this.debutYear = debutYear;
    }

    public String toString() {
        return String.format("Name: %s, Gender: %s, Nationality: %s, Debut Year: %s", name, gender, nationality, debutYear);
    }
}
