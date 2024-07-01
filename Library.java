import java.util.ArrayList;
import java.util.List;

class Library
 {
    private List<LibraryItem> items;

    public Library() {
        items = new ArrayList<>();
    }

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public void displayItems() {
        for (LibraryItem item : items) {
            item.displayInfo();
        }
    }
}
