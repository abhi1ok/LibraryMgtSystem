public class LibrarySystem {
    public static void main(String[] args) {
        Library library = new Library();

        // Create items
        Book book1 = new Book( "1984", "George Orwell", 1949, 328);
        Magazine magazine1 = new Magazine("Time", "Henry Luce", 2021, 15);

        // Add items to library
        library.addItem(book1);
        library.addItem(magazine1);

        // Display all items
        library.displayItems();
    }
}
