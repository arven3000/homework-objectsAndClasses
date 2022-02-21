package pro.sky.java.course1;

public class Main {

    public static Book findByBookName(Book[] books, String name) {

        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals(name)) {
                System.out.println("Книга " + (i + 1) + " " + books[i].getName()
                        + " " + books[i].getAuthor().getFirstName() + " "
                        + books[i].getAuthor().getLastName() + " " + books[i].getYear());
                return books[i];
            }
        }
        System.out.println("Такой книги нет в наличии");
        return null;
    }

    private static void changeYear(Book book) {

        if (book != null) {
            book.setYear(2015);
            System.out.println("Изменили год публикации книге " + book.getName()
                    + " " + book.getAuthor().getFirstName() + " "
                    + book.getAuthor().getLastName() + " на " + book.getYear());
        } else {
            throw new RuntimeException("Невозможно изменить год книге, которой нет!");
        }
    }


    public static void main(String[] args) {
        Author author1 = new Author("Федор Михайлович", "Достоевский");
        Author author2 = new Author("Иван Сергеевич", "Тургенев");
        Author author3 = new Author("Денис Иванович", "Фонвизин");
        Author author4 = new Author("Александр Сергеевич", "Пушкин");
        Author author5 = new Author("Михаил Юрьевич", "Лермонтов");

        Book book1 = new Book("Преступление и наказание", author1, 2021);
        Book book2 = new Book("Отцы и дети", author2, 2019);
        Book book3 = new Book("Недоросль", author3, 2020);
        Book book4 = new Book("Капитанская дочка", author4, 2018);
        Book book5 = new Book("Герой нашего времени", author5, 2016);

        Book[] books = {book1, book2, book3, book4, book5};

        for (int i = 0; i < books.length; i++) {
            System.out.println("Книга " + (i + 1) + " " + books[i].getName()
                    + " " + books[i].getAuthor().getFirstName() + " "
                    + books[i].getAuthor().getLastName() + " " + books[i].getYear());
        }

        System.out.println("------------------------------------------------------------------");
        book1.setYear(2008);

        System.out.println("Изменили год публикации книге " + book1.getName() + " " + book1.getAuthor().getLastName()
                + " " + book1.getAuthor().getFirstName() + " на " + book1.getYear());

        System.out.println("------------------------------------------------------------------");

        System.out.println(findByBookName(books, "Отцы и дети"));

        Book book = findByBookName(books, "Капитанская дочка");
        changeYear(book);
        Book anotherBook = findByBookName(books, "Война и мир");
        changeYear(anotherBook);
    }
}
