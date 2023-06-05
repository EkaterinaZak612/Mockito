public class MovieManager {
    private String[] movies;
    private int limit;

    public MovieManager() {
        this.limit = 5;
        this.movies = new String[0];
    }

    public MovieManager(int limit) {
        this.limit = limit;
        this.movies = new String[0];
    }

    public void add(String movie) {
        String[] tmp = new String[movies.length + 1];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        tmp[tmp.length - 1] = movie;
        this.movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int resultLength = Math.min(limit, movies.length);
        String[] tmp = new String[resultLength];
        for (int i = 0; i < resultLength; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;
    }
}
