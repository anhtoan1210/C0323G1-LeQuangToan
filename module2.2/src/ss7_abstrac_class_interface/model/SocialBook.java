package ss7_abstrac_class_interface.model;

public class SocialBook extends Book {
    private String author;

    public SocialBook() {

    }

    public SocialBook(String bookName, String publishingCompany, int publishingYear, String author) {
        super(bookName, publishingCompany, publishingYear);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "SocialBook{" +
                "bookName='" + getBookName() + '\'' +
                ", publishingCompany='" + getPublishingCompany() + '\'' +
                ", publishingYear=" + getPublishingYear() +
                "author='" + author + '\'' +
                '}';
    }


}
