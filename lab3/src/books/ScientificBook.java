package books;

public class ScientificBook extends Book{
    private String subject;
    private String complexity;

    // Конструктор по умолчанию
    public ScientificBook() {}

    // Конструктор с полным набором параметров
    public ScientificBook(String publishingHouse, String author, int pagesNum, String subject, String complexity) {
        super(publishingHouse, author, pagesNum);
        this.subject = subject;
        this.complexity = complexity;
    }

    // Конструктор с частичным набором параметров
    public ScientificBook(String publishingHouse, String author, String subject) {
        super(publishingHouse, author);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public String getComplexity() {
        return complexity;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Тематика: " + subject + ", Сложность: " + complexity);
    }

    @Override
    public String getType() {
        return "Научная книга";
    }

    @Override
    public String getName() {
        return "Научная книга";
    }
}
