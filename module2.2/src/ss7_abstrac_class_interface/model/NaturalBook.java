package ss7_abstrac_class_interface.model;

public class NaturalBook extends Book  {
    private int numberOfPublications;

    public NaturalBook() {

    }

    public NaturalBook(String bookName, String publishingCompany, int publishingYear, int numberOfPublications) {
        super(bookName, publishingCompany, publishingYear);
        this.numberOfPublications = numberOfPublications;
    }

    public int getNumberOfPublications() {
        return numberOfPublications;
    }

    public void setNumberOfPublications(int numberOfPublications) {
        this.numberOfPublications = numberOfPublications;
    }

    @Override
    public String toString() {
        return "NaturalBook{" +
                "numberOfPublications=" + numberOfPublications +
                '}';
    }


}
