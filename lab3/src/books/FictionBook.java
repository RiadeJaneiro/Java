package books;

public class FictionBook extends Book {
    private String genre;

    // Конструктор по умолчанию
    public FictionBook() {}

    // Конструктор с полным набором параметров
    public FictionBook(String publishingHouse, String author, int pagesNum, String genre) {
        super(publishingHouse, author, pagesNum);
        this.genre = genre;
    }

    // Конструктор с частичным набором параметров
    public FictionBook(String publishingHouse, String author, String genre) {
        super(publishingHouse, author);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String getName() {
        return "Художественная книга";
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Жанр: " + genre);
    }

    @Override
    public String getType() {
        return "Художественная книга";
    }
}
