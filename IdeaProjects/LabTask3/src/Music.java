public class Music {
    private String title;
    private String duration;
    private String genre; // Changed 'gender' to 'genre' to represent music genre
    private Person person;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDuration() {
        return duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public Music(String title, String duration, String genre, Person person) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
        this.person = person;
    }

    public String toString() {
        return String.format("Title: %s, Duration: %s, Genre: %s, Person: %s", title, duration, genre, person);
    }
}
