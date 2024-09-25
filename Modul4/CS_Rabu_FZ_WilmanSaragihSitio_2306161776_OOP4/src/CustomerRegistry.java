import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CustomerRegistry extends LibraryCollection<Customer> {
    public CustomerRegistry(HashMap<String, Customer> items) {
        super(items);
    }

    public Map<String, Customer> findByName(String name) {
        return getAllItems().entrySet().stream()
                .filter(entry ->
                        entry.getValue().name.toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue));
    }

    public Customer findByCustomerId(String customerId) {
        return getAllItems().values().stream()
                .filter(entry ->
                        entry.customerId.equals(customerId))
                .findFirst().orElse(null);
    }

    public Customer findByKey(String key) {
        return getAllItems().get(key);
    }
}
