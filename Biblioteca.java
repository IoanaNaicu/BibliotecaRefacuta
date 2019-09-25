import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Biblioteca {
    private List<Author> myAuthors = new ArrayList<>();
    //
    private List<Books> myBooks = new ArrayList<>();

    public Biblioteca(List<Author> myAuthors, List<Books> myBooks) {
        this.myAuthors = myAuthors;
        this.myBooks = myBooks;
    }

    public List<Author> getMyAuthors() {
        return myAuthors;
    }

    public List<Books> getMyBooks() {
        return myBooks;
    }

    public void setMyAuthors(List<Author> myAuthors) {
        this.myAuthors = myAuthors;
    }

    public void setMyBooks(List<Books> myBooks) {
        this.myBooks = myBooks;
    }

    public Author createAuthor(String name, String email, String gender, String tel) {
        return new Author(name, email, gender, tel);
    }

    public void addAuthors(Author myAuthor) {
        myAuthors.add(myAuthor);
    }

    public Author returnAuthor(String name) {
        for (Author a : myAuthors) {
            if (a.getName().equals(name))
                return a;
        }
        return null;
    }

    public void removeAuthors(String name) {

//        for (Author a : myAuthors) {
//            if (a.getName().equals(name)) {
//                myAuthors.remove(a);
//            }
        myAuthors.remove(returnAuthor(name));
    }


    public void printAuthorsList() {
        System.out.println("Lista de autori contine urmatorii: ");
        for (Author a : myAuthors) {
            System.out.println(a);
        }
    }

    public boolean isAuthorDuplicate(String mail){
        for(Author a : myAuthors)
            if (a.getEmail().equals(mail))
                return true;
          return false;
    }


    public Books createBooks(String name, int numberOfPages, double rating, Author myAuthor) {
        return new Books(name, numberOfPages, rating, myAuthor);
    }

    public void addBooks(Books myBook) {
        myBooks.add(myBook);
    }


    public void removeBooks(String bookName) {
        List<Books> deleteBooks = new ArrayList<>();
        for (Books b : myBooks) {
            if (b.getName().equals(bookName)) {
                deleteBooks.add(b);
            }
        }
        myBooks.removeAll(deleteBooks);
    }

//    public void returnBooksAfterAuthor(String name) {
//        List<Books> booksReturned = new ArrayList<>();
//
//        for (Books b : myBooks) {
//            if (b.getMyAuthorList().getName().equals(returnAuthor(name).getName()))
//                booksReturned.add(b);
//        }
//        System.out.println("Cartile scrise de autorul ales sunt: ");
//        for (Books b : booksReturned) {
//            System.out.println(b.getName());
//        }
//    }

    public boolean findBook(String bookName){
        for (Books b: myBooks) {
            if(b.getName().equals(bookName));
                return true;
        }
        return false;
    }




    public void returnBooksAfterAuthor(String name) {
        List<Books> booksReturned = new ArrayList<>();
        List<String> booksFound = new ArrayList<>();

        for (Books b : myBooks) {
            if (b.getMyAuthorInBook().getName().equals(returnAuthor(name).getName()))
                booksReturned.add(b);
        }
        System.out.println("Cartile scrise de autorul ales sunt: ");
        for (Books b : booksReturned) {
            System.out.println(b.getName());
            booksFound.add(b.getName());
        }
    }

    public void returnBookAfterAuthorHighestRating(String name) {

        List<Books> booksReturned = new ArrayList<>();
        List<Double> booksRating = new ArrayList<>();

        for (Books b : myBooks) {
            if (b.getMyAuthorInBook().getName().equals(returnAuthor(name).getName()))
                booksReturned.add(b);
        }


        for (Books b : booksReturned) {
            booksRating.add(b.getRating());
        }
        Double i = Collections.max(booksRating);

        for (Books b : booksReturned) {
            if (b.getRating() == i)
                System.out.println("Cartea cu cel mai mare rating scrisa de autorul ales este: " + b.getName());

        }

    }

    public void printBooksList() {
        System.out.println("Lista de carti contine urmatoarele: ");
        for (Books b : myBooks) {
            System.out.println(b);
        }
    }


}
