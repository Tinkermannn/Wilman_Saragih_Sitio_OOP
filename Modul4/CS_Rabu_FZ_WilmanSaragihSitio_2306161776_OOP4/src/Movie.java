public class Movie {
    public String title;
    public String director;
    public int year;

    public Movie(String title, String director, int year) {
        this.title = title;
        this.director = director;
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("Movie title: %s\nDirector: %s\nYear: %d", title, director, year);
    }
}
