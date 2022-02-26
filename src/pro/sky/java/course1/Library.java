package pro.sky.java.course1;

public class Library {

    private static Book[] books;

    public Library(int size) {
        books = new Book[size];
    }

    public Book findByBookName(String name) {

        for (Book book : books) {
            if (book.getName().equals(name)) {
                return book;
            }
        }
        return null;
    }

    public void changeYear(String nameBook, int year) {
        Book book = findByBookName(nameBook);
        if (book != null) {
            book.setYear(2015);
        } else {
            throw new IllegalArgumentException("Невозможно изменить год книге, которой нет!");
        }
    }

    public void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                break;
            }
        }
    }

    public String printInfo(String nameBook) {
        Book book = findByBookName(nameBook);
        if (book != null) {
            return "The " + book.getName()
                    + " by " + book.getAuthor().getFirstName() + " "
                    + book.getAuthor().getLastName() + " was published in" + book.getYear();
        } else {
            return "Such a book is not available";
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Library:\n");
        for (Book book : books) {
            stringBuilder.append(book).append("\n");
        }
        return stringBuilder.toString();
    }
}
