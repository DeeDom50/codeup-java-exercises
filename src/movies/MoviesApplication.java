package movies;

public class MoviesApplication {
    public static void main(String[] args) {
        Movie[] movies = MoviesArray.findAll();

        do {
            System.out.println("What would you like to do?\n");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category");

            int choice = Input.getInt("Enter your choice: ");

            switch (choice) {
                case 0:
                    System.out.println("Goodbye!");
                    System.exit(0);
                    break;
                case 1:
                    displayMovies(movies);
                    break;
                case 2:
                    displayMoviesByCategory(movies, "animated");
                    break;
                case 3:
                    displayMoviesByCategory(movies, "drama");
                    break;
                case 4:
                    displayMoviesByCategory(movies, "horror");
                    break;
                case 5:
                    displayMoviesByCategory(movies, "scifi");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (true);
    }

    // Method to display all movies
    private static <Movie> void displayMovies(Movie[] movies) {
        for (Movie movie : movies) {
            System.out.println(movie.getClass() + " -- " + movie.getCategory());
        }
    }

    // Method to display movies by category
    private static <Movie> void displayMoviesByCategory(Movie[] movies, String category) {
        for (Movie movie : movies) {
            if (movie.getCategory().equalsIgnoreCase(category)) {
                System.out.println(movie.getClass() + " -- " + movie.getCategory());
            }
        }
    }
}


