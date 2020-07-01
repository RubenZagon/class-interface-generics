package encryptor;

// genéricos

import java.util.Dictionary;
import java.util.Hashtable;

public class Cache<T> {

    private Dictionary<Object, T> items = new Hashtable<Object, T>();


    public void addItem(String key, T item) {
        items.put(key, item);
    }

    public T getItem(Object key) {
        return items.get(key);
    }
}
