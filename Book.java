class Book extends LibraryItem {
    private int pages;

    public Book(String title, String author, int publicationYear, int pages) {
        super(title, author, publicationYear);
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public void displayInfo() {
        System.out.println("Book: " + getTitle() + " by " + getAuthor() + ", Published: " + getPublicationYear() + ", Pages: " + getPages());
    }
}

class Magazine extends LibraryItem {
    private int issueNumber;

    public Magazine(String title, String author, int publicationYear, int issueNumber) {
        super(title, author, publicationYear);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    @Override
    public void displayInfo() {
        System.out.println("Magazine: " + getTitle() + " by " + getAuthor() + ", Published: " + getPublicationYear() + ", Issue Number: " + getIssueNumber());
    }
}
