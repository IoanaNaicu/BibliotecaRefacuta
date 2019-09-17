public class Books {
    private String name;
    private  int numberOfPages;
    //private List<Author> myList;
    private double rating;
    private Author myAuthorInBook;

    public Books(String name, int numberOfPages, double rating, Author myAuthorInBook) {
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.rating = rating;
        this.myAuthorInBook = myAuthorInBook;
    }

    public String getName() {

        return name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public double getRating() {
        return rating;
    }

    public Author getMyAuthorInBook() {
        return myAuthorInBook;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setMyAuthorInBook(Author myAuthorInBook) {
        this.myAuthorInBook = myAuthorInBook;
    }

    @Override
    public String toString() {
        return "Cartea se numeste " + name + ", are " + numberOfPages + " pagini, rating de " + rating +
                " si este scrisa de " + myAuthorInBook.getName();
    }
}
