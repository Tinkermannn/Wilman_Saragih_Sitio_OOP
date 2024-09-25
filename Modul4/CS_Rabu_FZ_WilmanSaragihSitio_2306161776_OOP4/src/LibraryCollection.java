import java.util.HashMap;
import java.util.*;

public class LibraryCollection<T> {
    private HashMap<String, T> items;

    public LibraryCollection(HashMap<String, T> items) {
        this.items = new HashMap<>();
    }

    public void addItem(String key, T item) {
        items.put(key,item);
    }

    public T getItem(String key) {
        return items.get(key);
    }

    public Map<String,T> getAllItems() {
        return items;
    }
}
