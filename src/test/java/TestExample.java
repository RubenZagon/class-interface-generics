import encryptor.*;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/*

interface Encryptor.Encryptor {
    public String Encrypt (String text);
}

public class SimpleEncrytor implements Encryptor.Encryptor {

    @Override
    public String Encrypt(String text) {
        throw new RuntimeException("Empty action");
    }
}

 */


public class TestExample {


    @Test
    public void test_class_abstract_and_interface() {
        Encryptor encryptor = new AlgorithmEncrytor();
        assertThat(encryptor.encrypt("ABCD")).isEqualTo("DCBA");
    }

    @Test
    public void test_generics() {
        Cache greetingsCache = new Cache();
        greetingsCache.addItem("saludo", "hola.¿qué tal estas?");
        greetingsCache.addItem("despedida", "adios");
        // Aquí se ve claramente que tenemos que castearlo a String
        // para poder utilizar el método replace
        Object item = greetingsCache.getItem("saludo");
        String result = ((String) item).replace(".", "-");
        assertThat(result).isEqualTo("hola-¿qué tal estas?");


        Cache numbersCache = new Cache();
        numbersCache.addItem("first", 1);
        numbersCache.addItem("second", 2);
        // Aquí se ve claramente que tenemos que castearlo a Integer
        // para poder realizar al suma
        Object cacheItem = numbersCache.getItem("first");
        Integer result2 = ((Integer)cacheItem) + 4;
        assertThat(result2).isEqualTo(5);
    }

}