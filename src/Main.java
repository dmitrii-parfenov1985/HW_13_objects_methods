public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Джек","Лондон");

        Book book = new Book("Мартин Иден", author1, 1909);
        System.out.println("title = " + book.getTitle());
        System.out.println("author = " + book.getAuthor());
        System.out.println("year Of Publication = " + book.getYearOfPublication());
        book.setYearOfPublication(2025);
        System.out.println("year Of Publication = " + book.getYearOfPublication());

        Author author2 = new Author("Лев", "Толстой");
        System.out.println("firstName = " + author2.getFirstName());
        System.out.println("lastName = " + author2.getLastName());

        Author author3 = new Author("Лев", "Толстой");
        System.out.println("firstName = " + author3.getFirstName());
        System.out.println("lastName = " + author3.getLastName());

        Book book1 = new Book("Война и мир", author2, 1893);
        System.out.println("title = " + book1.getTitle());
        System.out.println("author = " + book1.getAuthor());
        System.out.println("year Of Publication = " + book1.getYearOfPublication());
        book1.setYearOfPublication(2005);

        System.out.println(author3.equals(author2));
        System.out.println(book1.equals(book));
        System.out.println(book);
        System.out.println(author1);
    }
}