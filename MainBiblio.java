import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainBiblio {
    public static void main(String[] args) {
        List<Author> myAuthors = new ArrayList<>();
        List<Books> myBooks = new ArrayList<>();

        Biblioteca b1 = new Biblioteca(myAuthors, myBooks);
        Author author1 = new Author("Creanga", "creanga@yahoo.com", "m", "07567899");
        Author author2 = new Author("Mihai", "creanga@yahoo.com", "m", "07567899");
        Author author3 = new Author("Ion", "creanga@yahoo.com", "m", "07567899");
        Author author4 = new Author("Ioana", "creanga@yahoo.com", "m", "07567899");

        Books book1 = new Books("Caprele", 3, 3, author1);
        Books book2 = new Books("Praslea", 5, 3, author1);
        Books book3 = new Books("Luceafarul", 3, 3, author2);
        Books book4 = new Books("Calul", 8, 3, author3);
        myAuthors.add(author1);
        myAuthors.add(author2);
        myAuthors.add(author3);
        myAuthors.add(author4);
        myBooks.add(book1);
        myBooks.add(book2);
        myBooks.add(book3);
        myBooks.add(book4);



        Scanner in = new Scanner(System.in);
        boolean stayInLoop = true;
        while (stayInLoop) {
            printOptions();
            while (!in.hasNext("[abcdefghi]")) {
                System.out.println("Nu ai ales din lista. Alege din nou!");
                in.next();
            }
            Character input = in.next().charAt(0);
            switch (input) {
                case 'a':
                    System.out.println("introdu nume autor:");
                    String name = in.next();
                    while(!name.matches("^[a-zA-Z\\\\s]*$")){
                        System.out.println("Insert a valid name: ");
                        name = in.next();
                    }

                    System.out.println("introdu email autor:");
                    String email = in.next();
                    while (!email.matches("^([\\w-.]+){1,64}@([\\w&&[^_]]+){2,255}.[a-z]{2,}$")) {
                        System.out.println("Insert a valid e-mail");
                        email = in.next();
//            while (!isStudentDuplicate(studentEmail)) {
//                System.out.println("Student already exists. Insert anoter student: ");
//                studentEmail = in.next();
//            }
                    }

                    System.out.println("introdu gen autor:");
                    while (!in.hasNext("[mf]")) {
                        System.out.println("Wrong gender. Insert again 'm' or 'f':");
                        in.next();
                    }
                    String gender = in.next();

                    System.out.println("introdu tel autor:");
                    String tel = in.next();
                    while(!tel.matches("^\\+(?:[0-9] ?){6,14}[0-9]$")){
                        System.out.println("Insert a valid phone numbers");
                        tel = in.next();

                    }
                    Author myAuthor = b1.createAuthor(name, email, gender, tel);
                    b1.addAuthors(myAuthor);
                    break;
                case 'b':
                    b1.printAuthorsList();
                    break;
                case 'c':
                    System.out.println("Introduceti numele autorului care doresti sa il stergi din lista: ");
                    String authorToRemove = in.next();
                    b1.removeAuthors(authorToRemove);
                    break;
                case 'd':
                    System.out.println("introdu nume carte:");
                    String name1 = in.next();
                    System.out.println("introdu numarul de pagini:");
                    int noOfPages = in.nextInt();
                    System.out.println("introdu rating-ul cartii:");
                    double rating = in.nextDouble();
                    System.out.println("Autorii disponibili sunt mai jos. Alege un nume:");
                    b1.printAuthorsList();
                    String authorName = in.next();
                    //verifica daca returnAuthor.name este null....daca e null sa introduci din nou numele
                    Books myBook = b1.createBooks(name1, noOfPages, rating, b1.returnAuthor(authorName));
                    b1.addBooks(myBook);
                    break;
                case 'e':
                    b1.printBooksList();
                    break;
                case 'f':
                    System.out.println("Introduceti numele cartii care doriti sa o stergi din lista: ");
                    String bookToRemove = in.next();
                    b1.removeBooks(bookToRemove);
                    break;
                case 'g':
                    System.out.println("Introduceti numele autorului ale carui carti vreti sa vizualizati ");
                    String nameAuthorSearchForBooks = in.next();
                    System.out.println(b1.returnBooksAfterAuthor(nameAuthorSearchForBooks));

                    break;
                case 'h':
                    System.out.println("Introduceti numele autorului a carui cea mai cotata carte doriti sa vizualizati ");
                    String nameAuthorSearchForHighestBook = in.next();
                    b1.returnBookAfterAuthorHighestRating(nameAuthorSearchForHighestBook);
                    break;
                case 'i':
                    System.out.println("you exit");
                    stayInLoop = false;


            }
        }

    }

    public static void printOptions(){
        System.out.println("Alege o optiune:");
        System.out.println("a) adauga autori");
        System.out.println("b) printeaza lista autorilor");
        System.out.println("c) sterge autori");
        System.out.println("d) adauga carti");
        System.out.println("e) printeaza carti");
        System.out.println("f) sterge carti");
        System.out.println("g) cauta carti dupa autor");
        System.out.println("h) cauta cartea cea mai bine cotata dupa autor");
        System.out.println("i) exit");
    }


}

