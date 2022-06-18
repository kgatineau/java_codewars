import java.util.ArrayList;
import java.util.List;

// TODO: complete this object/class

public class PaginationHelper<I> {
    List<I> collection;
    int itemsPerPage;
    int pageCount;

    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */
    public PaginationHelper(List<I> collection, int itemsPerPage) {
    this.collection = collection;
    this.itemsPerPage = itemsPerPage;
    pageCount();
    itemCount();
    }

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
        return collection.size();
    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
        if (collection.isEmpty()) {
            pageCount = 0;
        }
        pageCount = (int) Math.ceil(collection.size()  / itemsPerPage) + 1;
        return pageCount;
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {
        pageCount();
        if (pageIndex + 1 > pageCount || pageIndex < 0 || collection.isEmpty()) {
            return -1;
        }
        if ((collection.size() - (pageIndex * itemsPerPage)) / itemsPerPage >= 1){
            return itemsPerPage;
        }
        return collection.size() - (itemsPerPage * pageIndex);
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {
        if (collection.isEmpty() || itemIndex > collection.size() || itemIndex < 0){
            return -1;
        }
        return (int) Math.floor(itemIndex / itemsPerPage);
    }

    public static void main(String[] args) {
        List<Object> l = new ArrayList<>();
        /*l.add('a');
        l.add('b');
        l.add('c');
        l.add('d');
        l.add('e');
        l.add('f'); */
        PaginationHelper<Object> p = new PaginationHelper<>(l, 4);
        System.out.println(p.pageItemCount(1));
    }
}