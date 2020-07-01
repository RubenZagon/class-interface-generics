package encryptor;

// genéricos

import java.util.Dictionary;
import java.util.Hashtable;

public class Cache {

    private Dictionary<Object, Object> items = new Hashtable<>();


    public void addItem(String key, Object item) {
        items.put(key, item);
    }

    public Object getItem(Object key) {
        return items.get(key);
    }
}
