package books;

public abstract class Book implements Printable, Employee {
    private String publishingHouse;
    private String author;
    private int pagesNum;

    // Конструктор по умолчанию
    public Book() {}

    // Конструктор с полным набором параметров
    public Book(String publishingHouse, String author, int pagesNum) {
        this.publishingHouse = publishingHouse;
        this.author = author;
        this.pagesNum = pagesNum;
    }

    // Конструктор с частичным набором параметров
    public Book(String publishingHouse, String author) {
        this.publishingHouse = publishingHouse;
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public String getAuthor() {
        return author;
    }

    public int getPagesNum() {
        return pagesNum;
    }

    public String getName() {
        return "Название книги";
    }

    @Override
    public void printInfo() {
        System.out.println("Книга: " + author + ", Издательство: " + publishingHouse
                + ", Страниц: " + pagesNum);
    }

    @Override
    public String getType() {
        return "Общая книга";
    }
}
