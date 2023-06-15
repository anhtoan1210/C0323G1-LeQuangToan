package ss7_abstrac_class_interface.model;

public abstract class Book {
    private String bookName;
    private String publishingCompany;
    private int publishingYear;

    public Book() {
    }

    public Book(String bookName, String publishingCompany, int publishingYear) {
        this.bookName = bookName;
        this.publishingCompany = publishingCompany;
        this.publishingYear = publishingYear;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", publishingCompany='" + publishingCompany + '\'' +
                ", publishingYear=" + publishingYear +
                '}';
    }
}
